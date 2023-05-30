package com.asobo.projectai.convertor;

import com.asobo.projectai.entity.Country;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MapToCountryConvertor implements Converter<Map<String, Object>, Country> {
    @Override
    public Country convert(Map<String, Object> source) {

        return Country.builder()
                .name(convertName((Map<String, Object>) source.get("name")))
                .tld((List<String>) source.get("tld"))
                .cca2((String) source.get("cca2"))
                .ccn3((String) source.get("ccn3"))
                .cca3((String) source.get("cca3"))
                .cioc((String) source.get("cioc"))
                .independent(source.get("independent") != null ? (Boolean) source.get("independent") : null)
                .status((String) source.get("status"))
                .unMember((Boolean) source.get("unMember"))
                .currencies((Map<String, Country.Currency>) source.get("currencies"))
                .idd(convertIdds((Map<String, Object>) source.get("idd")))
                .capital((List<String>) source.get("capital"))
                .altSpellings((List<String>) source.get("altSpellings"))
                .region((String) source.get("region"))
                .subregion((String) source.get("subregion"))
                .languages((Map<String, String>) source.get("languages"))
                .translations(convertTranslations((Map) source.get("translations")))
                .latlng((List<Double>) source.get("latlng"))
                .landlocked((Boolean) source.get("landlocked"))
                .borders((List<String>) source.get("borders"))
                .area((Double) source.get("area"))
                .demonyms(convertDemonyms((Map<String, Map<String, String>>) source.get("demonyms")))
                .flag((String) source.get("flag"))
                .maps(convertMaps((Map<String, String>) source.get("maps")))
                .population((Double) source.get("population"))
                .gini((Map<String, Double>) source.get("gini"))
                .fifa((String) source.get("fifa"))
                .car(convertCar((Map<String, Object>) source.get("car")))
                .timezones((List<String>) source.get("timezones"))
                .continents((List<String>) source.get("continents"))
                .flags(convertFlags((Map<String, String>) source.get("flags")))
                .coatOfArms(convertCoatOfArms((Map<String, String>) source.get("coatOfArms")))
                .startOfWeek((String) source.get("startOfWeek"))
                .capitalInfo(convertCapitalInfo((Map) source.get("capitalInfo")))
                .postalCode(convertPostalCode((Map<String, String>) source.get("postalCode")))
                .build();
    }

    private Country.Name convertName(Map name) {
        return name != null ? Country.Name.builder()
                .common((String) name.get("common"))
                .official((String) name.get("official"))
                .nativeName((Map<String, Map<String, String>>) name.get("nativeName"))
                .build() : Country.Name.builder().build();
    }

    private Country.Idd convertIdds(Map idd) {
        return idd != null ? Country.Idd.builder()
                .root((String) idd.get("root"))
                .suffixes((List<String>) idd.get("suffixes"))
                .build() : Country.Idd.builder().build();
    }

    private Country.Translations convertTranslations(Map translations) {
        return translations != null ? Country.Translations.builder()
                .translations(translations)
                .build() : Country.Translations.builder().build();
    }

    private Country.Demonyms convertDemonyms(Map demonyms) {
        return demonyms != null ? Country.Demonyms.builder()
                .eng((Map) demonyms.get("eng"))
                .fra((Map) demonyms.get("fra"))
                .build() : Country.Demonyms.builder().build();
    }

    private Country.Maps convertMaps(Map maps) {
        return maps != null ? Country.Maps.builder()
                .googleMaps((String) maps.get("googleMaps"))
                .openStreetMaps((String) maps.get("openStreetMaps"))
                .build() : Country.Maps.builder().build();
    }

    private Country.Car convertCar(Map car) {
        return car != null ? Country.Car.builder()
                .signs((List<String>) car.get("signs"))
                .side((String) car.get("side"))
                .build() : Country.Car.builder().build();
    }

    private Country.Flags convertFlags(Map flags) {
        return flags != null ? Country.Flags.builder()
                .svg((String) flags.get("svg"))
                .png((String) flags.get("png"))
                .alt((String) flags.get("alt"))
                .build() : Country.Flags.builder().build();
    }

    private Country.CoatOfArms convertCoatOfArms(Map coatOfArms) {
        return coatOfArms != null ? Country.CoatOfArms.builder()
                .svg((String) coatOfArms.get("svg"))
                .png((String) coatOfArms.get("png"))
                .build() : Country.CoatOfArms.builder().build();
    }

    private Country.CapitalInfo convertCapitalInfo(Map capitalInfo) {
        return capitalInfo != null ? Country.CapitalInfo.builder()
                .latlng((List<Double>) capitalInfo.get("latlng"))
                .build() : Country.CapitalInfo.builder().build();
    }

    private Country.PostalCode convertPostalCode(Map postalCode) {
        return postalCode != null ? Country.PostalCode.builder()
                .format((String) postalCode.get("format"))
                .regex((String) postalCode.get("regex"))
                .build() : Country.PostalCode.builder().build();
    }
}
