package com.app.hotelalura.entities;

import java.util.Date;

public class Person {

    private int id;
    private String name;
    private String surname;
    private Date dataBirth;
 
    private String nationality;
    private long phone;
    
    public Person(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(Date dataBirth) {
        this.dataBirth = dataBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", dataBirth=" + dataBirth + ", nationality=" + nationality + ", phone=" + phone + '}';
    }

}
