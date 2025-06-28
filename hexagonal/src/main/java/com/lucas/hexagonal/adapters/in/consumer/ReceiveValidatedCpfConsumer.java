package com.lucas.hexagonal.adapters.in.consumer;

import com.lucas.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.lucas.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.lucas.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {


    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "lucas")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
