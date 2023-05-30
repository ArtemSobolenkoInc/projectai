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

    // Getters and setters

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<String> getTld() {
        return tld;
    }

    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Map<String, Currency> currencies) {
        this.currencies = currencies;
    }

    public Idd getIdd() {
        return idd;
    }

    public void setIdd(Idd idd) {
        this.idd = idd;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Demonyms getDemonyms() {
        return demonyms;
    }

    public void setDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Maps getMaps() {
        return maps;
    }

    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Map<String, Double> getGini() {
        return gini;
    }

    public void setGini(Map<String, Double> gini) {
        this.gini = gini;
    }

    public String getFifa() {
        return fifa;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getContinents() {
        return continents;
    }

    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public CoatOfArms getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(CoatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getStartOfWeek() {
        return startOfWeek;
    }

    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    @Builder
    @Getter
    @Setter
    public static class Name {
        private String common;
        private String official;
        private Map<String, Map<String, String>> nativeName;

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public Map<String, Map<String, String>> getNativeName() {
            return nativeName;
        }

        public void setNativeName(Map<String, Map<String, String>> nativeName) {
            this.nativeName = nativeName;
        }
    }

    public static class Currencies {
        private Map<String, Currency> JOD;

        public Map<String, Currency> getJOD() {
            return JOD;
        }

        public void setJOD(Map<String, Currency> JOD) {
            this.JOD = JOD;
        }
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

//    @Getter
//    @Setter
//    @Builder
//    public static class Translation {
//        private String official;
//        private String common;
//
//        public String getOfficial() {
//            return official;
//        }
//
//        public void setOfficial(String official) {
//            this.official = official;
//        }
//
//        public String getCommon() {
//            return common;
//        }
//
//        public void setCommon(String common) {
//            this.common = common;
//        }
//    }

    @Getter
    @Setter
    @Builder
    public static class Demonyms {
        private Map<String, Map> eng;
        private Map<String, Map> fra;
    }

//    public static class Demonym {
//        private String f;
//        private String m;
//
//        public String getF() {
//            return f;
//        }
//
//        public void setF(String f) {
//            this.f = f;
//        }
//
//        public String getM() {
//            return m;
//        }
//
//        public void setM(String m) {
//            this.m = m;
//        }
//    }

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
