package com.example.europecar.EntityDto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AreaDto {

    private String nomeArea;
    private List<String> investimenti = new ArrayList<>();;

}