package roshka.diegoduarte.mssc_brewery.services;

import roshka.diegoduarte.mssc_brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, UUID customerId1);

    void deleteById(UUID customerId);
}
