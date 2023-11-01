package com.example.wine.api.repositories;

import com.example.wine.api.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vinhos", path = "vinhos")
public interface VinhoRepository extends JpaRepository<Vinho, Long> {
}
