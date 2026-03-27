package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;

import java.util.List;

public interface IAddressBookService {

    AddressBook addAddress(AddressBookDTO dto);

    List<AddressBook> getAllAddresses();

    AddressBook getById(int id);

    AddressBook update(int id, AddressBookDTO dto);

    void delete(int id);
}