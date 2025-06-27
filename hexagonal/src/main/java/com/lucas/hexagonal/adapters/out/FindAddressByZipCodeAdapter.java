package com.lucas.hexagonal.adapters.out;

import com.lucas.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.lucas.hexagonal.adapters.out.client.mapper.AddresResponseMapper;
import com.lucas.hexagonal.application.core.domain.Address;
import com.lucas.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddresResponseMapper addresResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addresResponse = findAddressByZipCodeClient.find(zipCode);
        return addresResponseMapper.toAddress(addresResponse);
    }


}
