package com.weather.management.Services;

import com.weather.management.DTO.SaveWeatherEntity;
import com.weather.management.Entity.WeatherEntity;

import java.util.List;

public interface Services {

    List<WeatherEntity> getWeatherManagement();
    String saveWeatherManagement(SaveWeatherEntity saveWeatherEntity);
    List<WeatherEntity> getWeatherStates();
}
