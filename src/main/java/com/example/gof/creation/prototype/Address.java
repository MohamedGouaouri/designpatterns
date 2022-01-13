package com.example.gof.creation.prototype;

public class Address {
    private String Country;
    private String City;
    private String streetName;

    public Address(String country, String city, String streetName) {
        Country = country;
        City = city;
        this.streetName = streetName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address clone(){
        return new Address(getCountry(), getCity(), getStreetName());
    }
}
