package es.mareator.surflog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
            ArrayList<RegistroModel> Registros = (ArrayList<RegistroModel>) registroRepository.findAll();
            return new ArrayList<>(Registros);
        } catch (Exception e) {
            System.err.println("Error recuperando Contenidos: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    @SuppressWarnings("null")
    public Optional<RegistroModel> getRegistroById(Long registroId) {
        return registroRepository.findById(registroId);
    }
}
