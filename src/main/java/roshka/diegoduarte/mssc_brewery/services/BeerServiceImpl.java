package roshka.diegoduarte.mssc_brewery.services;

import org.springframework.stereotype.Service;
import roshka.diegoduarte.mssc_brewery.web.model.BeerDto;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Pilsen")
                .beerStyle("Pale Ale")
                .build();
    }
}
