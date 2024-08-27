package com.weather.management.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "weather")
public class WeatherEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "station_id")
    Long stationId;
    @Column(name = "timestamp")
    String timestamp;
    @Column(name = "temperature")
    String temperature;
    @Column(name = "humidity")
    String humidity;
    @Column(name = "windSpeed")
    String windSpeed;

//    public WeatherEntity(Long id, Long stationId, String timestamp, String temperature, String humidity, String windSpeed) {
//        this.id = id;
//        this.stationId = stationId;
//        this.timestamp = timestamp;
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.windSpeed = windSpeed;
//    }

    public WeatherEntity(Long stationId, String timestamp, String temperature, String humidity, String windSpeed) {
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
