package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


    List<Student> findAllByName(String name);

    Optional<Student> getById(int id);

    boolean existsByMobile(Long mobile);

    long countByAgeGreaterThan(Integer age);

    void deleteByName(String name);

    List<Student> findByAgeLessThan(int age);

    List<Student> findByNameIgnoreCase(String name);

    List<Student> findByAge(int age);

    List<Student> findByNameAndMobile(String name, Long no);

    List<Student> findByNameOrMobile(String name, Long no);


    //Address
    Optional<Student> findByAddressId(Integer id);

    List<Student> findByAddressCity(String name);


    //course


    List<Student> findByCoursesId(Integer id);

    List<Student> findByCoursesName(String name);

    List<Student> findByCourses_NameOrderByAgeDesc(String courseName);

    List<Student> findByNameContaining(String keyword);

    List<Student> findTop2ByCoursesNameOrderByAgeDesc(String name);



    //QUERIES:

    //@Query(value = "SELECT * FROM student WHERE ID = :id", nativeQuery = true)
   /* @Query(value = "SELECT s FROM Student s WHERE s.id = :id ")
    Optional<Student>getStudentById(@Param("id") Integer id);

    //@Query(value = "SELECT name FROM student WHERE id = :id ", nativeQuery = true)
    @Query(value = "SELECT s.name FROM Student s WHERE s.id = :id")
    Optional<String>getStudNameById(@Param("id") Integer id);


    @Query(value = "SELECT id, name, mobile, age FROM student WHERE id = :id", nativeQuery = true)
    //@Query(value = "SELECT s.id, s.name, s.age FROM Student s WHERE s.id = :id")
    Optional<Object[]>getStudDetailsById(@Param("id") Integer id);

    */

    @Query(value = "select s from Student s")
    Page<Student> getAllStudentPaged(Pageable pageable);


}
