package com.bridgelabz.addressbookapp.model;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBook {

    private String name;
    private String address;

    public AddressBook(AddressBookDTO dto) {
        this.name = dto.getName();
        this.address = dto.getAddress();
    }
}