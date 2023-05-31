package com.asobo.projectai.convertor;

import com.asobo.projectai.entity.Country;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapToCountryConvertorTest {
    @InjectMocks
    private MapToCountryConvertor convertor;

    public Map<String, Object> createSampleData() {
        // Create a sample data map
        Map<String, Object> data = new HashMap<>();

        // Set values for the keys used in the conversion
        data.put("name", createSampleNameData());
        data.put("tld", createSampleTldData());
        data.put("cca2", "CC2");
        data.put("ccn3", "CCN3");
        data.put("cca3", "CC3");
        data.put("cioc", "CIOC");
        data.put("independent", true);
        data.put("status", "Status");
        data.put("unMember", true);
        data.put("currencies", createSampleCurrenciesData());
        data.put("idd", createSampleIddData());
        data.put("capital", createSampleCapitalData());
        data.put("altSpellings", createSampleAltSpellingsData());
        data.put("region", "Region");
        data.put("subregion", "Subregion");
        data.put("languages", createSampleLanguagesData());
        data.put("translations", createSampleTranslationsData());
        data.put("latlng", createSampleLatlngData());
        data.put("landlocked", true);
        data.put("borders", createSampleBordersData());
        data.put("area", 100.0);
        data.put("demonyms", createSampleDemonymsData());
        data.put("flag", "Flag");
        data.put("maps", createSampleMapsData());
        data.put("population", 1000.0);
        data.put("gini", createSampleGiniData());
        data.put("fifa", "FIFA");
        data.put("car", createSampleCarData());
        data.put("timezones", createSampleTimezonesData());
        data.put("continents", createSampleContinentsData());
        data.put("flags", createSampleFlagsData());
        data.put("coatOfArms", createSampleCoatOfArmsData());
        data.put("startOfWeek", "Monday");
        data.put("capitalInfo", createSampleCapitalInfoData());
        data.put("postalCode", createSamplePostalCodeData());

        return data;
    }

    public Map<String, Object> createSampleNameData() {
        Map<String, Object> nameData = new HashMap<>();
        nameData.put("common", "Country Name");
        nameData.put("official", "Official Name");
        nameData.put("nativeName", createSampleNativeNameData());

        return nameData;
    }

    public Map<String, Map<String, String>> createSampleNativeNameData() {
        Map<String, Map<String, String>> nativeNameData = new HashMap<>();
        Map<String, String> nativeNames = new HashMap<>();
        nativeNames.put("eng", "English Name");
        nativeNames.put("fra", "French Name");
        nativeNameData.put("native", nativeNames);

        return nativeNameData;
    }

    public List<String> createSampleTldData() {
        return Arrays.asList(".tld1", ".tld2");
    }

    public Map<String, Map<String, String>> createSampleCurrenciesData() {
        Map<String, Map<String, String>> currenciesData = new HashMap<>();
        Map<String, String> currencyDetails = new HashMap<>();
        currencyDetails.put("name", "Currency Name");
        currencyDetails.put("symbol", "Currency Symbol");
        currenciesData.put("currencyCode", currencyDetails);

        return currenciesData;
    }

    public Map<String, Object> createSampleIddData() {
        Map<String, Object> iddData = new HashMap<>();
        iddData.put("root", "+");
        iddData.put("suffixes", createSampleIddSuffixesData());

        return iddData;
    }

    public List<String> createSampleIddSuffixesData() {
        return Arrays.asList("123", "456");
    }

    public List<String> createSampleCapitalData() {
        return Arrays.asList("Capital 1", "Capital 2");
    }

    public List<String> createSampleAltSpellingsData() {
        return Arrays.asList("Alt Spelling 1", "Alt Spelling 2");
    }

    public Map<String, String> createSampleLanguagesData() {
        Map<String, String> languagesData = new HashMap<>();
        languagesData.put("languageCode", "Language Name");

        return languagesData;
    }

    public Map<String, String> createSampleTranslationsData() {
        Map<String, String> translationsData = new HashMap<>();
        translationsData.put("translationCode", "Translation Name");

        return translationsData;
    }

    public List<Double> createSampleLatlngData() {
        return Arrays.asList(1.0, 2.0);
    }

    public List<String> createSampleBordersData() {
        return Arrays.asList("Border 1", "Border 2");
    }

    public Map<String, Map<String, String>> createSampleDemonymsData() {
        Map<String, Map<String, String>> demonymsData = new HashMap<>();
        Map<String, String> demonyms = new HashMap<>();
        demonyms.put("eng", "English Demonym");
        demonyms.put("fra", "French Demonym");
        demonymsData.put("demonymCode", demonyms);

        return demonymsData;
    }

    public Map<String, String> createSampleMapsData() {
        Map<String, String> mapsData = new HashMap<>();
        mapsData.put("googleMaps", "Google Maps URL");
        mapsData.put("openStreetMaps", "OpenStreetMaps URL");

        return mapsData;
    }

    public Map<String, Double> createSampleGiniData() {
        Map<String, Double> giniData = new HashMap<>();
        giniData.put("year", 2022.0);
        giniData.put("value", 0.42);

        return giniData;
    }

    public Map<String, Object> createSampleCarData() {
        Map<String, Object> carData = new HashMap<>();
        carData.put("signs", createSampleCarSignsData());
        carData.put("side", "Side");

        return carData;
    }

    public List<String> createSampleCarSignsData() {
        return Arrays.asList("Sign 1", "Sign 2");
    }

    public List<String> createSampleTimezonesData() {
        return Arrays.asList("Timezone 1", "Timezone 2");
    }

    public List<String> createSampleContinentsData() {
        return Arrays.asList("Continent 1", "Continent 2");
    }

    public Map<String, String> createSampleFlagsData() {
        Map<String, String> flagsData = new HashMap<>();
        flagsData.put("svg", "SVG URL");
        flagsData.put("png", "PNG URL");
        flagsData.put("alt", "Alternative Flag");

        return flagsData;
    }

    public Map<String, String> createSampleCoatOfArmsData() {
        Map<String, String> coatOfArmsData = new HashMap<>();
        coatOfArmsData.put("svg", "SVG URL");
        coatOfArmsData.put("png", "PNG URL");

        return coatOfArmsData;
    }

    public Map<String, Object> createSampleCapitalInfoData() {
        Map<String, Object> capitalInfoData = new HashMap<>();
        capitalInfoData.put("latlng", createSampleCapitalInfoLatlngData());

        return capitalInfoData;
    }

    public List<Double> createSampleCapitalInfoLatlngData() {
        return Arrays.asList(1.0, 2.0);
    }

    public Map<String, String> createSamplePostalCodeData() {
        Map<String, String> postalCodeData = new HashMap<>();
        postalCodeData.put("format", "Postal Code Format");
        postalCodeData.put("regex", "Postal Code Regex");

        return postalCodeData;
    }

    @Test
    public void testConvert() {
        // Initialize the Mockito annotations
        MockitoAnnotations.openMocks(this);

        // Create the sample data
        Map<String, Object> data = createSampleData();

        // Convert the data using the converter
        Country country = convertor.convert(data);

        // Assert the converted country object
        assertEquals("Country Name", country.getName().getCommon());
        assertEquals("Official Name", country.getName().getOfficial());
        assertEquals("English Name", country.getName().getNativeName().get("native").get("eng"));
        assertEquals("French Name", country.getName().getNativeName().get("native").get("fra"));
        assertEquals(Arrays.asList(".tld1", ".tld2"), country.getTld());
        assertEquals("CC2", country.getCca2());
        assertEquals("CCN3", country.getCcn3());
        assertEquals("CC3", country.getCca3());
        assertEquals("CIOC", country.getCioc());
        assertEquals(true, country.getIndependent());
        assertEquals("Status", country.getStatus());
        assertEquals(true, country.isUnMember());
        assertEquals("+", country.getIdd().getRoot());
        assertEquals(Arrays.asList("123", "456"), country.getIdd().getSuffixes());
        assertEquals(Arrays.asList("Capital 1", "Capital 2"), country.getCapital());
        assertEquals(Arrays.asList("Alt Spelling 1", "Alt Spelling 2"), country.getAltSpellings());
        assertEquals("Region", country.getRegion());
        assertEquals("Subregion", country.getSubregion());
        assertEquals("Language Name", country.getLanguages().get("languageCode"));
        assertEquals(Arrays.asList(1.0, 2.0), country.getLatlng());
        assertEquals(true, country.isLandlocked());
        assertEquals(Arrays.asList("Border 1", "Border 2"), country.getBorders());
        assertEquals(100.0, country.getArea());
        assertEquals("Flag", country.getFlag());
        assertEquals("Google Maps URL", country.getMaps().getGoogleMaps());
        assertEquals("OpenStreetMaps URL", country.getMaps().getOpenStreetMaps());
        assertEquals(1000.0, country.getPopulation());
        assertEquals(0.42, country.getGini().get("value"));
        assertEquals("FIFA", country.getFifa());
        assertEquals(Arrays.asList("Sign 1", "Sign 2"), country.getCar().getSigns());
        assertEquals("Side", country.getCar().getSide());
        assertEquals(Arrays.asList("Timezone 1", "Timezone 2"), country.getTimezones());
        assertEquals(Arrays.asList("Continent 1", "Continent 2"), country.getContinents());
        assertEquals("SVG URL", country.getFlags().getSvg());
        assertEquals("PNG URL", country.getFlags().getPng());
        assertEquals("Alternative Flag", country.getFlags().getAlt());
        assertEquals("SVG URL", country.getCoatOfArms().getSvg());
        assertEquals("PNG URL", country.getCoatOfArms().getPng());
        assertEquals("Monday", country.getStartOfWeek());
        assertEquals(Arrays.asList(1.0, 2.0), country.getCapitalInfo().getLatlng());
        assertEquals("Postal Code Format", country.getPostalCode().getFormat());
        assertEquals("Postal Code Regex", country.getPostalCode().getRegex());
    }
}