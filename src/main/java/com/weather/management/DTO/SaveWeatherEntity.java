package com.weather.management.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveWeatherEntity {

    Long stationId;
    String timestamp;
    String temperature;
    String humidity;
    String windSpeed;

    public SaveWeatherEntity(Long stationId, String timestamp, String temperature, String humidity, String windSpeed) {
        this.stationId = stationId;
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                ", stationId=" + stationId +
                ", timestamp='" + timestamp + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                '}';
    }
}
