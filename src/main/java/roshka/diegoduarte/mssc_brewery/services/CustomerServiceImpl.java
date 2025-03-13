package roshka.diegoduarte.mssc_brewery.services;

import org.springframework.stereotype.Service;
import roshka.diegoduarte.mssc_brewery.web.model.CustomerDto;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .ID(UUID.randomUUID())
                .name("Diego Duarte")
                .build();
    }
}
