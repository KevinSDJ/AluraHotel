package com.app.hotelalura.entities;



public class Admin extends Person{

    private String email;
    private String password;
    
    public Admin(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
    public Admin(){
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Admin{");
        sb.append("id=").append(getId());
        sb.append(", first_name=").append(getFirst_name());
        sb.append(", surname=").append(getSurname());
        sb.append(", date_birth=").append(getDate_birth());
        sb.append(", nationality=").append(getNationality());
        sb.append(", phone=").append(getPhone());
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

    
    
}
