package com.weather.management.Repo;

import com.weather.management.Entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<WeatherEntity, Long> {
}
