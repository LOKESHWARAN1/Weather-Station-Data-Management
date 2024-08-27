package com.weather.management.Controller;


import com.weather.management.DTO.SaveWeatherEntity;
import com.weather.management.Entity.WeatherEntity;
import com.weather.management.Services.ServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WeatherController {

    @Autowired
    ServicesImp services;

    @GetMapping("/measurements")
    public List<WeatherEntity> getMeasurements() {
        return services.getWeatherManagement();
    }

    @PostMapping("/measurements")
    public String createRecord(@RequestBody SaveWeatherEntity saveWeatherEntity) {
        return services.saveWeatherManagement(saveWeatherEntity);
    }

    @GetMapping("/api/measurements/stats")
    public List<WeatherEntity> getStats() {
        return services.getWeatherStates();
    }
}
