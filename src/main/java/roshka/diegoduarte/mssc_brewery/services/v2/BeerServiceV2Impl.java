package roshka.diegoduarte.mssc_brewery.services.v2;

import org.springframework.stereotype.Service;
import roshka.diegoduarte.mssc_brewery.web.model.BeerDto;
import roshka.diegoduarte.mssc_brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
