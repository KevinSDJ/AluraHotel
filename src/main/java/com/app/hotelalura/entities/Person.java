package com.app.hotelalura.entities;


import java.io.Serializable;
import java.sql.Date;

public class Person implements Serializable{
    static final long serialVersionUID = 1L; 
    
    private int id;
    private String first_name;
    private String surname;
    private Date date_birth;
    private String nationality;
    private String phone;
    
    public Person(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

   

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date dataBirth) {
        this.date_birth = dataBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + first_name + ", surname=" + surname + ", dataBirth=" + date_birth + ", nationality=" + nationality + ", phone=" + phone + '}';
    }

}
