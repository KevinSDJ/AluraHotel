package com.app.hotelalura.entities;

import java.util.Date;

public abstract class Person {

    private int id;
    private String first_name;
    private String surname;
    private Date dateBirth;
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

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dataBirth) {
        this.dateBirth = dataBirth;
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
        return "Person{" + "id=" + id + ", name=" + first_name + ", surname=" + surname + ", dataBirth=" + dateBirth + ", nationality=" + nationality + ", phone=" + phone + '}';
    }

}
