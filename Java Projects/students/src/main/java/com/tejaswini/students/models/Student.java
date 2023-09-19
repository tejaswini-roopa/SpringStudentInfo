package com.tejaswini.students.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "roll_number")
    private int rollNo;
    private String name;
    private int rank;
    @Column(name = "mail_id")
    private String mailId;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "address")
    private String address;
}
