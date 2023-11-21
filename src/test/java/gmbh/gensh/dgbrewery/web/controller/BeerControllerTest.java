package gmbh.gensh.dgbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmbh.gensh.dgbrewery.web.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeer() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/v1/beer" + UUID.randomUUID().toString())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    void handlePost() throws Exception {
        BeerDTO beerDTO = BeerDTO.builder().build();
        String beetDTOToJson = objectMapper.writeValueAsString(beerDTO);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/beer/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(beetDTOToJson))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}