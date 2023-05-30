package com.asobo.projectai.service;

import com.asobo.projectai.convertor.MapToCountryConvertor;
import com.asobo.projectai.entity.Country;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private final static String REST_COUNTRIES_API_URL_ALL = "https://restcountries.com/v3.1/all";
    private final static String REQUEST_METHOD = "GET";

    private final MapToCountryConvertor mapToCountryConvertor;

    public CountryService(MapToCountryConvertor mapToCountryConvertor) {
        this.mapToCountryConvertor = mapToCountryConvertor;
    }

    public String getAllCountries(String name, Integer population, String param3) {

        try {
            HttpURLConnection connection = createConnection();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                Gson gson = new Gson();
                Object countriesData = gson.fromJson(response.toString(), Object.class);

                List<Map> listOfMaps = ((ArrayList<Map>) countriesData).stream().toList();

                List<Country> countries = listOfMaps.stream()
                        .map(mapToCountryConvertor::convert).toList();

                if (name != null && !name.isEmpty() && !name.isBlank()) {
                    return getFilteredDataByName(countries, gson, name);
                }

                return gson.toJson(countriesData);
            }

        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred";
        }
    }

    private HttpURLConnection createConnection() throws IOException {
        URL url = new URL(REST_COUNTRIES_API_URL_ALL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(REQUEST_METHOD);
        return connection;
    }

    private String getFilteredDataByName(List<Country> countries, Gson gson, String name) {
        return gson.toJson(countries.stream()
                .filter(c -> c.getName().getCommon().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList()));
    }
}
