package com.college.model;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private float marks;

}
