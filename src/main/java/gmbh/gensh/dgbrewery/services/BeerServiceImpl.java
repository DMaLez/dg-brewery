package gmbh.gensh.dgbrewery.services;

import gmbh.gensh.dgbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beer) {
        return BeerDTO.builder().id(UUID.randomUUID()).build();
    }
}
