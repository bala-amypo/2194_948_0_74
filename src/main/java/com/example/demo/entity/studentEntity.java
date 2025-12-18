package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class studentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(Message="Name is not Valid")
    private String name;

    @Email(message="Email Format is not Valid")
    private string email;

    public void setId (Long id){
        this.id=id;
    }
    public Long getId(){
        return id
    }
    public studentEntity(){

    }
    public studentEntity(Long)
}