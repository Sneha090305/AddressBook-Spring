package com.bridgelabz.addressbookapp.model;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
<<<<<<< HEAD

public class AddressBook {

    private static int counter = 0;

    private int id;
=======
import lombok.Data;

@Data
public class AddressBook {

>>>>>>> c1401e5a071cdcab843f2b39cc9efeb3cd46b31a
    private String name;
    private String address;

    public AddressBook(AddressBookDTO dto) {
        this.id = ++counter;
        this.name = dto.getName();
        this.address = dto.getAddress();
    }
}