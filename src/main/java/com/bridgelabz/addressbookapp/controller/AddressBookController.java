package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @PostMapping("/create")
    public AddressBook createAddress(@RequestBody AddressBookDTO dto) {
        return new AddressBook(dto);
    }

    // GET
    @GetMapping("")
    public String getMessage() {
        return "Get Call Successful";
    }

    // GET by ID
    @GetMapping("/{id}")
    public String getById(@PathVariable int id) {
        return "Get Call for ID: " + id;
    }

    // POST
    @PostMapping("")
    public String create(@RequestParam String name) {
        return "Created entry for: " + name;
    }

    // PUT
    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestParam String name) {
        return "Updated ID " + id + " with name: " + name;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return "Deleted entry with ID: " + id;
    }
}