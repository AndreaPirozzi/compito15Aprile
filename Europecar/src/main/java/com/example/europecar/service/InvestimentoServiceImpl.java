package com.example.europecar.service;

import com.example.europecar.entity.Investimento;
import com.example.europecar.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestimentoServiceImpl implements InvestimentoService{

    @Autowired
    InvestimentoRepository investimentoRepository;

    @Override
    public Investimento findById(Long id){
        Investimento investimento = investimentoRepository.findById(id).get();
        return investimento;
    }

    @Override
    public List<Investimento> findAll() {
        return investimentoRepository.findAll();
    }

    @Override
    public Investimento delete(Long id) {
        Investimento investimento = investimentoRepository.findById(id).get();
        investimentoRepository.delete(investimento);
        return investimento;
    }

    @Override
    public void save(Investimento investimento){
        investimentoRepository.save(investimento);
    }
}
