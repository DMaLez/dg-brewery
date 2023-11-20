package gmbh.gensh.dgbrewery.services;

import gmbh.gensh.dgbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        // TODO: implement
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer");
    }
}
