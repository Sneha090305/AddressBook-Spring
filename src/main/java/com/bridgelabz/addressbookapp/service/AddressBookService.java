package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBook;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository repository;

    // CREATE
    @Override
    public AddressBook addAddress(AddressBookDTO dto) {
        AddressBook address = new AddressBook(dto);
        return repository.save(address);
    }

    // GET ALL
    @Override
    public List<AddressBook> getAllAddresses() {
        return repository.findAll();
    }

    // GET BY ID
    @Override
    public AddressBook getById(int id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new AddressBookException("Address not found with ID: " + id));
    }

    // UPDATE
    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook address = repository.findById(id)
                .orElseThrow(() ->
                        new AddressBookException("Cannot update. ID not found: " + id));

        address.setName(dto.getName());
        address.setAddress(dto.getAddress());

        return repository.save(address);
    }

    // DELETE
    @Override
    public void delete(int id) {
        if (!repository.existsById(id)) {
            throw new AddressBookException("Cannot delete. ID not found: " + id);
        }
        repository.deleteById(id);
    }
}