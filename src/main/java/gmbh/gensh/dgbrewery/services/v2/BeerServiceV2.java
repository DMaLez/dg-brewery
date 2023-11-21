package gmbh.gensh.dgbrewery.services.v2;

import gmbh.gensh.dgbrewery.web.model.BeerDTO;
import gmbh.gensh.dgbrewery.web.model.v2.BeerDTOV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDTOV2 getBeerById(UUID beerId);

    BeerDTOV2 saveNewBeer(BeerDTOV2 beerDTO);

    void updateBeer(UUID beerId, BeerDTOV2 beerDTO);

    void deleteById(UUID beerId);

}
