package com.changeside.project1.controller;

import com.changeside.project1.entity.Address;
import com.changeside.project1.entity.Faculty;
import com.changeside.project1.repository.AddressRepository;
import com.changeside.project1.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
@RequiredArgsConstructor

public class AddressController {

    private final AddressService addressService;

    @GetMapping("addresses")
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @GetMapping("/{id}")
    public Address getById(@PathVariable int id) {
        return addressService.getById(id);
    }

    public void create(@RequestBody Address address) {
        addressService.create(address);
    }

}
