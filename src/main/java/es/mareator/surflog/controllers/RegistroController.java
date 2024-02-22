package es.mareator.surflog.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
import es.mareator.surflog.repositories.IRegistroRepository;
import es.mareator.surflog.services.RegistroService;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    // @Autowired
    // private IRegistroRepository registroRepository;

    @GetMapping
    public List<RegistroModel> getRegistros() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getRegistros");
        return this.registroService.getRegistros();
    }

    // @GetMapping
    // public Page<RegistroModel> getRegistros(@PageableDefault(page = 0, size = 20)
    // Pageable pageable) {
    // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getRegistros");
    // return this.registroRepository.findAll(pageable);
    // }

    @GetMapping("/{id}")
    public Optional<RegistroModel> getRegistroById(@PathVariable("id") Long id) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getRegistro x Id");
        return this.registroService.getRegistroById(id);
    }

    // @GetMapping("/{id}")
    // public RegistroModel getRegistroById(@PathVariable("id") Long id) {
    // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> getRegistro x Id con
    // lugar");

    // Optional<RegistroModel> optionalRegistro =
    // Optional.ofNullable(this.registroService.getRegistroWithLugar(id));

    // // If present, print the value, otherwise print a message indicating it's
    // empty
    // // optionalRegistro.ifPresentOrElse(
    // // registro -> System.out.println("Registro with Lugar found: " + registro),
    // // () -> System.out.println("No Registro with Lugar found for id: " + id));

    // return optionalRegistro.orElse(null);
    // }

    @PostMapping
    public ResponseEntity<RegistroModel> createRegistro(@RequestBody RegistroModel registro) {
        RegistroModel createdRegistro = registroService.createRegistro(registro);
        return new ResponseEntity<>(createdRegistro, HttpStatus.CREATED);
    }

}
