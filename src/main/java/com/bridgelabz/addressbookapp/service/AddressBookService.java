package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import com.bridgelabz.addressbookapp.repository.IAddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private IAddressBookRepository repository;

    @Override
    public AddressBook addAddress(AddressBookDTO dto) {
        AddressBook address = new AddressBook(dto);
        return repository.save(address);
    }

    @Override
    public List<AddressBook> getAllAddresses() {
        return repository.findAll();
    }

    @Override
    public AddressBook getById(int id) {
        return repository.findById(id);
    }

    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook address = repository.findById(id);
        if (address != null) {
            address.setName(dto.getName());
            address.setAddress(dto.getAddress());
        }
        return address;
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}