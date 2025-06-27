package com.lucas.hexagonal.adapters.in.controller.mapper;

import com.lucas.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.lucas.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper() {

    @Mapping(target - "id", ignore = true)
    @Mapping(target - "address", ignore = true)
    @Mapping(target - "isValidCpf", ignore = true)
    Customer toCostumer(CustomerRequest customerRequest);
}


