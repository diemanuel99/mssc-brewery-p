package roshka.diegoduarte.mssc_brewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import roshka.diegoduarte.mssc_brewery.web.model.v2.BeerStyleEnum;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
