package com.example.europecar.service;

import com.example.europecar.entity.Area;
import com.example.europecar.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    AreaRepository areaRepository;

    @Override
    public Area findById(Long id){
        Area area = areaRepository.findById(id).get();
        return area;
    }

    @Override
    public List<Area> findAll() {
        return areaRepository.findAll();
    }

    @Override
    public Area delete(Long id) {
        Area area = areaRepository.findById(id).get();
        areaRepository.delete(area);
        return area;
    }

    @Override
    public void save(Area area){
        areaRepository.save(area);
    }
}

