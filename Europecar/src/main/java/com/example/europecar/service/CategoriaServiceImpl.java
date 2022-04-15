package com.example.europecar.service;

import com.example.europecar.entity.Categoria;
import com.example.europecar.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Long id){
        Categoria categoria = categoriaRepository.findById(id).get();
        return categoria;
    }
    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria delete(Long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);
        return categoria;
    }

    @Override
    public void save(Categoria categoria){
        categoriaRepository.save(categoria);
    }
}
