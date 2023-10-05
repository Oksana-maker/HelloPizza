package com.example.hellopizza.persistence;

import com.example.hellopizza.entity.Beverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeverageRepository extends JpaRepository<Beverage,Long> {
}
