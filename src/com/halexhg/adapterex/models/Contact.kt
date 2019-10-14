package com.halexhg.adapterex.models;

class Contact {

    var name: String;
    var lastName: String;
    var phoneNumber: String;
    var address: String;
    var city: String;
    var country: String;

    constructor(name: String, lastName: String, phoneNumber: String, address: String, city: String, country: String) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.country = country;
    }

}