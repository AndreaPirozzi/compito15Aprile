package com.example.europecar.service;

import com.example.europecar.entity.Area;

import java.util.List;

public interface AreaService {
    Area findById(Long id);

    List<Area> findAll();

    Area delete(Long id);

    void save(Area area);
}
