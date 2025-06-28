package com.lucas.hexagonal.application.core.usecase;

import com.lucas.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.lucas.hexagonal.application.ports.in.FindCustomerByIdInputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdUseCase deleteCustomerByIdUseCase) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdUseCase = deleteCustomerByIdUseCase;
    }

    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdUseCase.delete(id);
    }
}
