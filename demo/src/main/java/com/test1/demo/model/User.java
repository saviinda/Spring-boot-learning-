package com.test1.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//create a table in database
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id     //primary key
    private int id;
    private String name;

}
