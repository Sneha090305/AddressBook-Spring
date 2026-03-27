package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import com.bridgelabz.addressbookapp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    // POST
    @PostMapping("/create")
    public AddressBook create(@RequestBody AddressBookDTO dto) {
        return service.addAddress(dto);
    }

    // GET ALL
    @GetMapping("/all")
    public List<AddressBook> getAll() {
        return service.getAllAddresses();
    }
}