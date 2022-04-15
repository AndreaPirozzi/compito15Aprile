package com.example.europecar.Converter;

import com.example.europecar.EntityDto.AreaDto;
import com.example.europecar.entity.Area;
import com.example.europecar.entity.Investimento;

import java.util.ArrayList;
import java.util.List;

public class AreaMapper {

    public AreaDto toDto(Area area){
        AreaDto dto = new AreaDto();

        dto.setNomeArea(area.getNomeArea());

        List<String> nomi_investimenti = new ArrayList<>();
        for (Investimento investimento : area.getInvestimento()){
            nomi_investimenti.add(investimento.getNomeInvestimento());
        }
        dto.setInvestimenti(nomi_investimenti);
        return dto;
    }
}
