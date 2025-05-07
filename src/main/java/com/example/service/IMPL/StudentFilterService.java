package com.example.service.IMPL;

import com.example.entity.Address;
import com.example.entity.Courses;
import com.example.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class StudentFilterService {

    public final EntityManager entityManager;

    public List<Student> findStudentWithSearchAndFilter (String search, Integer minAge, Long pincode, LocalDate startDate){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> studentRoot = cq.from(Student.class);
        Join<Student, Address> addressJoin = studentRoot.join("address", JoinType.LEFT);
        Join<Student, Courses> coursesJoin = studentRoot.join("courses", JoinType.LEFT);

        List<Predicate> finalPredicate = new ArrayList<>();
        if(minAge != null){
            Predicate agePredicate = cb.greaterThanOrEqualTo(studentRoot.get("age"), minAge);
            finalPredicate.add(agePredicate);
        }

        if(pincode != null){
            Predicate pincodePredicate = cb.equal(addressJoin.get("pincode"), pincode);
            finalPredicate.add(pincodePredicate);
        }

        if(startDate != null){
            Predicate startDatePredicate = cb.greaterThanOrEqualTo(coursesJoin.get("startDate"), startDate.atStartOfDay());
            finalPredicate.add(startDatePredicate);

        }

        Predicate[] predicateArray = finalPredicate.toArray(new Predicate[0]);
        Predicate combinePredicate = cb.and(predicateArray);

        CriteriaQuery<Student> where = cq.where(combinePredicate);

        List<Student> resultList = entityManager.createQuery(cq).getResultList();
        return resultList;

    }
}
