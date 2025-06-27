package com.lucas.hexagonal.adapters.out;

import com.lucas.hexagonal.application.core.domain.Address;
import com.lucas.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Override
    public Address find(String zipCode) {
        return null;
    }


}
