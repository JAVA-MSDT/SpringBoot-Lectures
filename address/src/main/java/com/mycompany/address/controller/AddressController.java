package com.mycompany.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping
    public String getAddress() {
        return AddressController.class.getSimpleName();
    }
}
