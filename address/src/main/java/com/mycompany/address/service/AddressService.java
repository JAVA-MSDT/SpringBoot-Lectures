package com.mycompany.address.service;

import com.mycompany.address.model.Address;
import com.mycompany.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(UUID id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Address Not Found in DB."));
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

//    public List<Address> getAddresses() {
//        return List.of(
//                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0000"), "Palestine", "Jerusalem", "Freedom ST"),
//                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0001"), "Egypt", "Cairo", "Pyramids ST"),
//                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0002"), "Russia", "Saint Petersburg", "The kings ST"),
//                new Address(UUID.fromString("bb3373e2-1abc-4961-861e-ce7c38ab0003"), "Poland", "Warsaw", "Wolska ST, 000")
//
//        );
//    }

}
