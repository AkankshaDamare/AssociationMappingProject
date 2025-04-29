package com.example.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addr_id")
    private Integer id;
    @Column(name = "city")
    private String city;
    @Column(name = "pincode")
    private Long pincode;

    @OneToOne(mappedBy = "address")
    @JsonIgnore

    private Student student;
}
