package com.example.wine.api.repositories;

import com.example.wine.api.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "vinhos", path = "vinhos")
public interface VinhoRepository extends JpaRepository<Vinho, Long> {

    List<Vinho> findByNomeContainingIgnoreCase(@Param("nome") String nome);
}
