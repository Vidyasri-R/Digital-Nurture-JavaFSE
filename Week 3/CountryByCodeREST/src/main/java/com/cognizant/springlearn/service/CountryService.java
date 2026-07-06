package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.Country;

@Service
public class CountryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);
    private List<Country> countryList;
    public CountryService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Map<String, Country> countryBeans = context.getBeansOfType(Country.class);
        countryList = new ArrayList<>(countryBeans.values());
    }
    public Country getCountry(String code) {
        LOGGER.info("Start getCountry()");
        Country result = countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
        LOGGER.debug("Country found: {}", result);
        LOGGER.info("End getCountry()");
        return result;
    }
}
