package com.example.wine.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vinhos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String uvas;
    private String produtor;
    private String regiao;
    private String pais;
    private EnumTipo tipo;
    private Double teorAlcoolico;
    private Integer safra;
    private String harmonizacao;

}
