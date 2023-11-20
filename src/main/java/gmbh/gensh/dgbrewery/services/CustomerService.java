package gmbh.gensh.dgbrewery.services;

import gmbh.gensh.dgbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

}
