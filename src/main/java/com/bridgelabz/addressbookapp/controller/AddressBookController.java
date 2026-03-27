package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {

    @GetMapping("/addressbook")
    public String getMessage() {
        return "Welcome to Address Book App";
    }
}