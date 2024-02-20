package es.mareator.surflog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.mareator.surflog.models.LugarModel;
import es.mareator.surflog.services.LugarService;

@RestController
<<<<<<< HEAD
@RequestMapping("/lugar")
=======
@RequestMapping("/lugares")
>>>>>>> desarrollo
public class LugarController {

    @Autowired
    private LugarService lugarService;

    @GetMapping
    public List<LugarModel> getLugares() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getLugares");
        return this.lugarService.getLugares();

    }
}
