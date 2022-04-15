package com.example.europecar.Converter;

import com.example.europecar.EntityDto.InvestimentoDto;
import com.example.europecar.entity.Investimento;

import com.example.europcarnb.entity.Investimento;
import entityDto.InvestimentoDto;
import org.modelmapper.ModelMapper;

public class InvestimentoMapper {

    public InvestimentoDto toDto(Investimento investimento){
        ModelMapper modelInvestimento = new ModelMapper();
        InvestimentoDto investimentoDto = modelInvestimento.map(investimento, InvestimentoDto.class);
        return investimentoDto;
    }
}


