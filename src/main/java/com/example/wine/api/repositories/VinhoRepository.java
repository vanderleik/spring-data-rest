package com.example.wine.api.repositories;

import com.example.wine.api.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {
}
