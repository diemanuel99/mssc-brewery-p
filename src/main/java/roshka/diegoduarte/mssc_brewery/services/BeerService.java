package roshka.diegoduarte.mssc_brewery.services;

import roshka.diegoduarte.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
