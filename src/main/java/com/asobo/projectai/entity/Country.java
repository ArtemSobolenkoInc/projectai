package com.asobo.projectai.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class Country {
    private Name name;
    private List<String> tld;
    private String cca2;
    private String ccn3;
    private String cca3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Map<String, Currency> currencies;
    private Idd idd;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private Map<String, String> languages;
    private Translations translations;
    private List<Double> latlng;
    private boolean landlocked;
    private List<String> borders;
    private double area;
    private Demonyms demonyms;
    private String flag;
    private Maps maps;
    private Double population;
    private Map<String, Double> gini;
    private String fifa;
    private Car car;
    private List<String> timezones;
    private List<String> continents;
    private Flags flags;
    private CoatOfArms coatOfArms;
    private String startOfWeek;
    private CapitalInfo capitalInfo;
    private PostalCode postalCode;

    @Builder
    @Getter
    @Setter
    public static class Name {
        private String common;
        private String official;
        private Map<String, Map<String, String>> nativeName;
    }

    @Setter
    @Getter
    @Builder
    public static class Currency {
        private String name;
        private String symbol;
    }

    @Getter
    @Setter
    @Builder
    public static class Idd {
        private String root;
        private List<String> suffixes;
    }

    @Getter
    @Setter
    @Builder
    public static class Translations {
        private Map<String, Map> translations;
    }

    @Getter
    @Setter
    @Builder
    public static class Demonyms {
        private Map<String, Map> eng;
        private Map<String, Map> fra;
    }

    @Getter
    @Setter
    @Builder
    public static class Maps {
        private String googleMaps;
        private String openStreetMaps;
    }

    @Getter
    @Setter
    @Builder
    public static class Flags {
        private String svg;
        private String png;
        private String alt;
    }

    @Getter
    @Setter
    @Builder
    public static class CoatOfArms {
        private String svg;
        private String png;
    }

    @Getter
    @Setter
    @Builder
    public static class CapitalInfo {
        private List<Double> latlng;
    }

    @Getter
    @Setter
    @Builder
    public static class PostalCode {
        private String format;
        private String regex;
    }

    @Getter
    @Setter
    @Builder
    public static class Car {
        private List<String> signs;
        private String side;

    }
}
