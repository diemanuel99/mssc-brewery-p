package roshka.diegoduarte.mssc_brewery.web.mappers;

import org.mapstruct.Mapper;
import roshka.diegoduarte.mssc_brewery.domain.Customer;
import roshka.diegoduarte.mssc_brewery.web.model.CustomerDto;
@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto dto);
}
