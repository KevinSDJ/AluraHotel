package com.app.hotelalura.entities;



public class Booking {

    private String code;
    private String dateIn;
    private String dateOut;
    private int value;
    private String paymentMethod;

    public Booking() {
    }

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
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
        return "Booking{" + "code=" + code + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", value=" + value + ", paymentMethod=" + paymentMethod + '}';
    }

}
