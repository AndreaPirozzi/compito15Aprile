package com.example.europecar.controllerRest;

import com.example.europecar.entity.Categoria;
import com.example.europecar.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class RestCategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public Categoria getById(@PathVariable("id") long id) {
        return categoriaService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<Categoria> getAll() {
        return categoriaService.findAll();
    }

    @PostMapping(value = "/newCategoria")
    public void newCategoria(@RequestBody Categoria categoria) {
        categoriaService.save(categoria);
    }

    @DeleteMapping(value = "/deleteCategoria/{id}")
    public void deleteCategoriaPerId(@PathVariable("id") Long id) {
        categoriaService.delete(id);
    }


}
