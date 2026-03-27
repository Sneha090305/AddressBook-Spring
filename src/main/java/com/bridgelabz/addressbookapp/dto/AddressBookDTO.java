package com.bridgelabz.addressbookapp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class AddressBookDTO {

    @NotBlank(message = "Name should not be empty")
    @Pattern(
            regexp = "^[A-Z][a-zA-Z\\s]{2,}$",
            message = "Name must start with capital letter and have at least 3 characters"
    )
    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}