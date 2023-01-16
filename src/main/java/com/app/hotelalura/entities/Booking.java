package com.app.hotelalura.entities;

import java.util.Date;

class Booking {
    private String id;
    private Date dateIn;
    private Date dateOut;
    private int value;
    private String paymentMethod;
    public Booking(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", value=" + value + ", paymentMethod=" + paymentMethod + '}';
    }
    
    
}
