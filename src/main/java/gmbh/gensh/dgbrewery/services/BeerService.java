package gmbh.gensh.dgbrewery.services;

import gmbh.gensh.dgbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

}
