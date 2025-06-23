package com.mycompany.address.controller;

import com.mycompany.address.model.Address;
import com.mycompany.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAddresses() {
        return addressService.getAddresses();
    }

    @GetMapping(value = "/{id}")
    public Address getAddressById(@PathVariable UUID id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable UUID id,@RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    @PutMapping()
    public Address updateAddress(@RequestBody Address address) {
        return addressService.updateAddress(address);
    }

}
