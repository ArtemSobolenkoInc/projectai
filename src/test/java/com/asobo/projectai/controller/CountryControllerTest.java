package com.asobo.projectai.controller;

import com.asobo.projectai.service.CountryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class CountryControllerTest {

    private CountryController countryController;

    @Mock
    private CountryService countryService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        countryController = new CountryController(countryService);
    }

    @Test
    public void testGetAllCountries() {
        // Mock input parameters
        String name = "TestName";
        Integer population = 100000;
        String sortOrder = "asc";
        Integer recordsSize = 10;

        // Mock the response from the service
        String expectedResponse = "Test Response";
        when(countryService.getCountries(name, population, sortOrder, recordsSize)).thenReturn(expectedResponse);

        // Call the controller method
        ResponseEntity<String> responseEntity = countryController.getAllCountries(name, population, sortOrder, recordsSize);

        // Verify the response
        assertEquals(expectedResponse, responseEntity.getBody());
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

}