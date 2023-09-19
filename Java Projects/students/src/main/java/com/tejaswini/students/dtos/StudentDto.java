package com.tejaswini.students.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private int rollNo;
    private String name;
    private int rank;

    private String mailId;

    private String phoneNo;

    private String address;
}
