package com.changeside.project1.service;

import com.changeside.project1.entity.Address;

import java.util.List;

public interface AddressService {

    Address getById(int id);

    void create(Address address);

    List<Address> getAll();

}
