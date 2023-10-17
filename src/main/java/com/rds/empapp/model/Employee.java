package com.rds.empapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
public class Employee {

    @Id
    private int id;
    private String name;
    private String email;
    private String address;


}
