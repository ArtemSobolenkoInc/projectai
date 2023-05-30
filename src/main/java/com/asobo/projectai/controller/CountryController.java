package com.asobo.projectai.controller;

import com.asobo.projectai.service.CountryService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/countries", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllCountries(
            @RequestParam(required = false) final String name,
            @RequestParam(required = false) final Integer population,
            @RequestParam(required = false) final String param3
    ) {
        return ResponseEntity.ok(countryService.getAllCountries(name, population, param3));
    }

}
