package com.app.hotelalura.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

public class Booking implements Serializable {

    static final long serialVersionUID = 23L;

    private int id;
    private String code;
    private Date dateIn;
    private Date dateOut;
    private Double price;
    private String paymentMethod;
    private Integer guest_id;

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Integer guest_id) {
        this.guest_id = guest_id;
    }

    public Booking() {
        UUID uuid_auto = UUID.randomUUID();
        code = uuid_auto.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
   

    @Override
    public String toString() {
        return "Booking{" + "code=" + code + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", price=" + price
                + ", paymentMethod=" + paymentMethod + '}';
    }

}
