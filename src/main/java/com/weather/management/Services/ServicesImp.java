package com.weather.management.Services;

import com.weather.management.DTO.SaveWeatherEntity;
import com.weather.management.Entity.WeatherEntity;
import com.weather.management.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesImp implements Services {

    @Autowired
    Repo repo;

    @Override
    public List<WeatherEntity> getWeatherManagement() {

        List<WeatherEntity> weatherEntityArrayList = new ArrayList<>();

        List<WeatherEntity> entity = repo.findAll();

        entity.forEach(x -> weatherEntityArrayList.add(new WeatherEntity(
                x.getStationId(),
                x.getTimestamp(),
                x.getTemperature(),
                x.getHumidity(),
                x.getWindSpeed()
        )));

        return weatherEntityArrayList;
    }

    @Override
    public String saveWeatherManagement(SaveWeatherEntity saveWeatherEntity) {
        WeatherEntity result = new WeatherEntity(
                saveWeatherEntity.getStationId(),
                saveWeatherEntity.getTimestamp(),
                saveWeatherEntity.getTemperature(),
                saveWeatherEntity.getHumidity(),
                saveWeatherEntity.getWindSpeed()
        );
        repo.save(result);
        return "New Record Added Successfully";
    }

    @Override
    public List<WeatherEntity> getWeatherStates() {
        List<WeatherEntity> report = repo.findAll();

        return report;
    }

}
