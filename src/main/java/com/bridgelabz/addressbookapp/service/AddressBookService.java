package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private final List<AddressBook> addressList = new ArrayList<>();

    @Override
    public AddressBook addAddress(AddressBookDTO dto) {
        AddressBook address = new AddressBook(dto);
        addressList.add(address);
        return address;
    }

    @Override
    public List<AddressBook> getAllAddresses() {
        return addressList;
    }

    @Override
    public AddressBook getById(int id) {
        return addressList.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook address = getById(id);
        if (address != null) {
            address.setName(dto.getName());
            address.setAddress(dto.getAddress());
        }
        return address;
    }

    @Override
    public void delete(int id) {
        addressList.removeIf(a -> a.getId() == id);
    }
}
