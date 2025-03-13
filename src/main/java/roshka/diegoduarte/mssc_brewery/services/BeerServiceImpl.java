package roshka.diegoduarte.mssc_brewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import roshka.diegoduarte.mssc_brewery.web.model.BeerDto;

import java.util.UUID;
@Slf4j
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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo create a real implementation
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Delete Beer with id {}", beerId);
    }

}
