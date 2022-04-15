package com.example.europecar.service;

import com.example.europecar.entity.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria findById(Long id);

    List<Categoria> findAll();

    Categoria delete(Long id);

    void save(Categoria categoria);
}
