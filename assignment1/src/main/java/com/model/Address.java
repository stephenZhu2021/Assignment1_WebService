package com.model;

public class Address {

    private int number;
    private String streetName;
    private String postalCode;
    private City city;

    public Address() {
    }

    public Address(int number, String streetName, String postalCode, City city) {
        this.number = number;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city=" + city +
                '}';
    }
}
