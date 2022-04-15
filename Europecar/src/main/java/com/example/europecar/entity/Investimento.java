package com.example.europecar.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table (name = "HB_INVESTIMENTO1")
public class Investimento {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nome;

    @Column
    private double totale;

    @Column
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    private Area area;

    @ManyToOne
    @JoinColumn(name = "id_Categoria", referencedColumnName = "id")
    private Categoria categoria;
}
