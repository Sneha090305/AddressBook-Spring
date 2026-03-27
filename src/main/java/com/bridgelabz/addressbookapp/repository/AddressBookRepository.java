package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressBookRepository implements IAddressBookRepository {

    private final List<AddressBook> addressList = new ArrayList<>();

    @Override
    public AddressBook save(AddressBook address) {
        addressList.add(address);
        return address;
    }

    @Override
    public List<AddressBook> findAll() {
        return addressList;
    }

    @Override
    public AddressBook findById(int id) {
        return addressList.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(int id) {
        addressList.removeIf(a -> a.getId() == id);
    }
}
