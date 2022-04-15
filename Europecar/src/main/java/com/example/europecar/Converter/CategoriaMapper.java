package com.example.europecar.Converter;

import com.example.europcarnb.entity.Categoria;
import entityDto.CategoriaDto;
import org.modelmapper.ModelMapper;

public class CategoriaMapper {

    public CategoriaDto toDto(Categoria categoria){
        ModelMapper modelCategoria = new ModelMapper();
        CategoriaDto categoriaDto = modelCategoria.map(categoria, CategoriaDto.class);
        return categoriaDto;
    }
}
