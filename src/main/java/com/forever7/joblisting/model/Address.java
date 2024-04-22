package com.forever7.joblisting.model;

public class Address {
    private String address;
    private int pincode;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String country;
    private long phoneNumber;
}
