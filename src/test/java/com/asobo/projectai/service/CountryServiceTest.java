package com.asobo.projectai.service;

import com.asobo.projectai.convertor.MapToCountryConvertor;
import com.asobo.projectai.entity.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

class CountryServiceTest {
    private CountryService countryService;
    private MapToCountryConvertor convertor;

    @BeforeEach
    public void setup() {
        convertor = mock(MapToCountryConvertor.class);
        countryService = new CountryService(convertor);
    }

    @Test
    public void testGetFilteredDataByName() {
        // Arrange
        List<Country> countries = new ArrayList<>();
        countries.add(Country.builder().name(Country.Name.builder().common("Country 1").build()).build());
        countries.add(Country.builder().name(Country.Name.builder().common("Country 2").build()).build());
        countries.add(Country.builder().name(Country.Name.builder().common("Country 3").build()).build());

        // Act
        List<Country> filteredCountries = countryService.getFilteredDataByName(countries, "2");

        // Assert
        Assertions.assertEquals(1, filteredCountries.size());
        Assertions.assertEquals("Country 2", filteredCountries.get(0).getName().getCommon());
    }

    @Test
    public void testGetFilteredDataByPopulation() {
        // Arrange
        List<Country> countries = new ArrayList<>();
        List<String> tlds1 = new ArrayList<>();
        tlds1.add("100");

        List<String> tlds2 = new ArrayList<>();
        tlds1.add("500");

        List<String> tlds3 = new ArrayList<>();
        tlds1.add("1000");
        countries.add(Country.builder().name(Country.Name.builder().common("Country 1").build())
                .tld(tlds1)
                .population(50.0)
                .build());
        countries.add(Country.builder().name(Country.Name.builder().common("Country 2").build())
                .tld(tlds2)
                .population(501.0 * 1000000)
                .build());

        countries.add(Country.builder().name(Country.Name.builder().common("Country 3").build())
                .tld(tlds3)
                .population(501.0 * 1000000)
                .build());

        // Act
        List<Country> filteredCountries = countryService.getFilteredDataByPopulation(countries, 5);

        // Assert
        Assertions.assertEquals(1, filteredCountries.size());
        Assertions.assertEquals("Country 1", filteredCountries.get(0).getName().getCommon());
    }

    @Test
    public void testGetSortedCountriesByName() {
        // Arrange
        List<Country> countries = new ArrayList<>();
        List<String> tlds1 = new ArrayList<>();
        tlds1.add("100");

        List<String> tlds2 = new ArrayList<>();
        tlds1.add("500");

        List<String> tlds3 = new ArrayList<>();
        tlds1.add("1000");
        countries.add(Country.builder().name(Country.Name.builder().common("Country 3").build())
                .tld(tlds1).build());
        countries.add(Country.builder().name(Country.Name.builder().common("Country 1").build())
                .tld(tlds2).build());

        countries.add(Country.builder().name(Country.Name.builder().common("Country 2").build())
                .tld(tlds3).build());

        // Act
        List<Country> sortedCountries = countryService.getSortedCountriesByName(countries, "ascend");

        // Assert
        Assertions.assertEquals("Country 1", sortedCountries.get(0).getName().getCommon());
        Assertions.assertEquals("Country 2", sortedCountries.get(1).getName().getCommon());
        Assertions.assertEquals("Country 3", sortedCountries.get(2).getName().getCommon());
    }

    @Test
    public void testGetPaginatedListOfMaps() {
        // Arrange
        List<Map<String, Object>> prePaginatedListOfMaps = new ArrayList<>();
        prePaginatedListOfMaps.add(Map.of("key1", "value1"));
        prePaginatedListOfMaps.add(Map.of("key2", "value2"));
        prePaginatedListOfMaps.add(Map.of("key3", "value3"));

        // Act
        List<Map<String, Object>> paginatedListOfMaps = countryService.getPaginatedListOfMaps(2, prePaginatedListOfMaps);

        // Assert
        Assertions.assertEquals(2, paginatedListOfMaps.size());
        Assertions.assertEquals(Map.of("key1", "value1"), paginatedListOfMaps.get(0));
        Assertions.assertEquals(Map.of("key2", "value2"), paginatedListOfMaps.get(1));
    }
}