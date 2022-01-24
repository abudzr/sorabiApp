package com.example.sorabi.models;

import javax.persistence.*;
import io.swagger.annotations.ApiModel;

@ApiModel(description="All details about user")
@Entity
@Table(name="tbl_user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String inputPhoneNumber){
        this.phoneNumber = inputPhoneNumber;
    }
}
