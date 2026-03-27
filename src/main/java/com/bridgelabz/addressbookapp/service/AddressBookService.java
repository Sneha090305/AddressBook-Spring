package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository repository;

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
        return repository.findById(id).orElse(null);
    }

    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook address = repository.findById(id).orElse(null);
        if (address != null) {
            address.setName(dto.getName());
            address.setAddress(dto.getAddress());
            return repository.save(address);
        }
        return null;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}