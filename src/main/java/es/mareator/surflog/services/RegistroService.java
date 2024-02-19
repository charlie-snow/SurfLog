package es.mareator.surflog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.mareator.surflog.models.RegistroModel;
import es.mareator.surflog.repositories.IRegistroRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistroService {

    @Autowired
    IRegistroRepository registroRepository;

    public List<RegistroModel> getRegistros() {
        try {
            List<RegistroModel> registros = (ArrayList<RegistroModel>) registroRepository.findAll();
            System.out.println(registros.size());
            // return new List<>(registros);
            return registros;
        } catch (Exception e) {
            System.err.println("Error recuperando Contenidos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
