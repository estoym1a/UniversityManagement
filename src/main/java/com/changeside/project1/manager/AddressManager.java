package com.changeside.project1.manager;

import com.changeside.project1.entity.Address;
import com.changeside.project1.repository.AddressRepository;
import com.changeside.project1.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

    public class AddressManager implements AddressService {
        private final AddressRepository addressRepository;

        @Override
        public List<Address> getAll() {
            return addressRepository.findAll();
        }

        @Override
        public Address getById(int id) {
            return addressRepository.findById(id).get();
        }

        @Override
        public void create(Address address) {
            addressRepository.save((address));
}}
