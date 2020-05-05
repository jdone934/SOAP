package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {
    TemperatureConversionsSoapType service;

    @BeforeEach
    void setUp() {
        service = new TemperatureConversions().getTemperatureConversionsSoap12();
    }

    @Test
    void convertTempToFahrenheit() {
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        BigDecimal expected = BigDecimal.valueOf(32);
        assertEquals(expected, result);
    }

    @Test
    void convertTempToCelsius() {
        BigDecimal result = service.fahrenheitToCelsius(BigDecimal.valueOf(212));
        BigDecimal expected = BigDecimal.valueOf(100);
        assertEquals(expected, result);
    }

    @Test
    void windChillInCelsius() {
        BigDecimal result = service.windChillInCelsius(BigDecimal.valueOf(20), BigDecimal.valueOf(10));
        BigDecimal expected = BigDecimal.valueOf(14.33);
        assertEquals(expected, result);
    }

    @Test
    void windChillInFahrenheit() {
        BigDecimal result = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(5));
        BigDecimal expected = BigDecimal.valueOf(24.638);
        assertEquals(expected, result);
    }
}