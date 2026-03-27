package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBook;

import java.util.List;

public interface IAddressBookRepository {

    AddressBook save(AddressBook address);

    List<AddressBook> findAll();

    AddressBook findById(int id);

    void delete(int id);
}