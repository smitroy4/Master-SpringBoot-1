package com.smit.Master_SpringBoot_1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                   //Replaces all the boilerplate including Constructors, Getters-Setters, Hashcode, etc
@AllArgsConstructor     //Creates constructors with all the arguments
public class StudentDto {
    private Long id;
    private String name;
    private String email;








//    public StudentDto(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

}
