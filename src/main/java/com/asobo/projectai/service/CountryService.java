package com.asobo.projectai.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {

    private final RestTemplate restTemplate;

    public CountryService() {
        this.restTemplate = new RestTemplate();
    }

    private final String REST_COUNTRIES_API_URL_ALL = "https://restcountries.com/v3.1/all";

    public String getAllCountries(String name, Integer population, String param3) {

        ResponseEntity<String> response = restTemplate.getForEntity(REST_COUNTRIES_API_URL_ALL, String.class);

        return response.getBody();
    }

}
