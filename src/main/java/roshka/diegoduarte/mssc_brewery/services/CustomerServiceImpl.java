package roshka.diegoduarte.mssc_brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import roshka.diegoduarte.mssc_brewery.web.model.CustomerDto;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .ID(UUID.randomUUID())
                .name("Diego Duarte")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .ID(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, UUID customerId1) {
        //todo create a real implementation
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Delete Customer with id {}", customerId);
    }
}
