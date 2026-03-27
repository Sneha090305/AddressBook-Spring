package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBook {

    private static int counter = 0;

    private int id;
    private String name;
    private String address;

    public AddressBook(AddressBookDTO dto) {
        this.id = ++counter;
        this.name = dto.getName();
        this.address = dto.getAddress();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}