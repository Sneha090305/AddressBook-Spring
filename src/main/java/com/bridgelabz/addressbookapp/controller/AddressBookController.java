package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService service;

    @PostMapping("/create")
    public AddressBook create(@Valid @RequestBody AddressBookDTO dto) {
        return service.addAddress(dto);
    }

    @GetMapping("/all")
    public List<AddressBook> getAll() {
        return service.getAllAddresses();
    }

    @GetMapping("/{id}")
    public AddressBook getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public AddressBook update(@PathVariable int id, @Valid @RequestBody AddressBookDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted ID: " + id;
    }
}