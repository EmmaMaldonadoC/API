package com.sesion9.clase.Controllers;

import com.sesion9.clase.Models.NivelAccesoModel;
import com.sesion9.clase.Repositories.INivelAccesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nivelAcceso")
public class NivelAccesoController {
    private final INivelAccesoRepository nivelAccesoRepository;

    @Autowired
    public NivelAccesoController(INivelAccesoRepository nivelAccesoRepository) {

        this.nivelAccesoRepository = nivelAccesoRepository;
    }

    @PostMapping("/guardar")
    @ResponseBody
    public String guardarNivelAcceso(@RequestBody NivelAccesoModel nuevoNivelAcceso) {
        nivelAccesoRepository.save(nuevoNivelAcceso);
        return "Nivel de acceso guardado con exito";
    }
}
