package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private final List<AddressBook> addressList = new ArrayList<>();

    public AddressBook addAddress(AddressBookDTO dto) {
        AddressBook address = new AddressBook(dto);
        addressList.add(address);
        return address;
    }

    public List<AddressBook> getAllAddresses() {
        return addressList;
    }
}
