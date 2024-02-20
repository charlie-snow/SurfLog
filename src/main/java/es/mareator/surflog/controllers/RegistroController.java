package es.mareator.surflog.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.mareator.surflog.models.RegistroModel;
import es.mareator.surflog.services.RegistroService;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @GetMapping
    public List<RegistroModel> getRegistros() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getRegistros");
        return this.registroService.getRegistros();

    }

    @GetMapping("/{id}")
    public Optional<RegistroModel> getRegistroById(@PathVariable("id") Long id) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getRegistro x Id");

        System.out.println(id);
        return this.registroService.getRegistroById(id);
    }

    @PostMapping
    public ResponseEntity<RegistroModel> createRegistro(@RequestBody RegistroModel registro) {
        RegistroModel createdRegistro = registroService.createRegistro(registro);
        return new ResponseEntity<>(createdRegistro, HttpStatus.CREATED);
    }

}
