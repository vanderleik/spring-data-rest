package com.example.wine.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "VINHOS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "UVAS")
    private String uvas;
    @Column(name = "PRODUTOR")
    private String produtor;
    @Column(name = "REGIAO")
    private String regiao;
    @Column(name = "PAIS")
    private String pais;
    @Column(name = "TIPO")
    @Enumerated(EnumType.STRING)
    private EnumTipoVinho tipo;
    @Column(name = "TEOR_ALCOOLICO")
    private Double teorAlcoolico;
    @Column(name = "SAFRA")
    private Integer safra;
    @Column(name = "HARMONIZACAO")
    private String harmonizacao;

}
