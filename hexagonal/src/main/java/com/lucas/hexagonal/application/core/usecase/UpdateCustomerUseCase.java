package com.lucas.hexagonal.application.core.usecase;

import com.lucas.hexagonal.application.core.domain.Customer;
import com.lucas.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.lucas.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.lucas.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.lucas.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort

                                 ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);

    }
}
