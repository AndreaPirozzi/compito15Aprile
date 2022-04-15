package com.example.europecar.controllerRest;

import com.example.europecar.entity.Area;
import com.example.europecar.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/area")
public class RestAreaController {

    @Autowired
    AreaService areaService;

    @GetMapping(value = "/{id}")
    public Area getById(@PathVariable("id") long id) {
        return areaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Area> getAll() {
        return areaService.findAll();
    }

    @PostMapping(value = "/newCategoria")
    public void newArea(@RequestBody Area area) {
        areaService.save(area);
    }

    @DeleteMapping(value = "/deleteArea/{id}")
    public void deleteAreaPerId(@PathVariable("id") Long id) {
        areaService.delete(id);
    }


}
