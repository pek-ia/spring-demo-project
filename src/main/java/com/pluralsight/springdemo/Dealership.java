package com.pluralsight.springdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dealerships")
public class Dealership {
    @Id
    private int dealership_id;
    private String name;
    private String phone;
    private String address;

    public int getDealership_id() {
        return dealership_id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Dealership(int dealership_id, String name, String phone, String address) {
        this.dealership_id = dealership_id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Dealership(){}
}
