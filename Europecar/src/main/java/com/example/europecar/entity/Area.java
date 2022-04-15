package com.example.europecar.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "HB_AREA1")
public class Area {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

}
