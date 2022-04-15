package com.example.europecar.service;

import com.example.europecar.entity.Investimento;

import java.util.List;

public interface InvestimentoService {
    Investimento findById(Long id);

    List<Investimento> findAll();

    Investimento delete(Long id);

    void save(Investimento investimento);
}
