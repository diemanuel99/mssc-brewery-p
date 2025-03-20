package roshka.diegoduarte.mssc_brewery.web.mappers;

import org.mapstruct.Mapper;
import roshka.diegoduarte.mssc_brewery.domain.Beer;
import roshka.diegoduarte.mssc_brewery.web.model.BeerDto;
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
