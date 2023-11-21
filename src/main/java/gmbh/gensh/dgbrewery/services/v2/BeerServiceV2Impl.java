package gmbh.gensh.dgbrewery.services.v2;

import gmbh.gensh.dgbrewery.web.model.v2.BeerDTOV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDTOV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDTOV2 saveNewBeer(BeerDTOV2 beerDTO) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
