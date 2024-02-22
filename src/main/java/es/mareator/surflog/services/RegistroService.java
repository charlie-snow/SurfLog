package es.mareator.surflog.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.mareator.surflog.models.LugarModel;
import es.mareator.surflog.models.RegistroModel;
import es.mareator.surflog.repositories.ILugarRepository;
import es.mareator.surflog.repositories.IRegistroRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistroService {

    @Autowired
    IRegistroRepository registroRepository;

    @Autowired
    ILugarRepository lugarRepository;

    public List<RegistroModel> getRegistros() {
        try {
            ArrayList<RegistroModel> Registros = (ArrayList<RegistroModel>) registroRepository.findAll();
            return new ArrayList<>(Registros);
        } catch (Exception e) {
            System.err.println("Error recuperando Contenidos: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // @SuppressWarnings("null")
    // public RegistroModel getRegistroWithLugar(Long registroId) {
    // Optional<RegistroModel> registroOptional =
    // registroRepository.findById(registroId);

    // if (registroOptional.isPresent()) {
    // RegistroModel registro = registroOptional.get();
    // System.out.println("registro");

    // // Make sure the associated LugarModel is fetched
    // if (registro.getLugar() != null) {
    // System.out.println("lugaropt");

    // Optional<LugarModel> lugarOptional =
    // lugarRepository.findById(registro.getLugar().getId());

    // if (lugarOptional.isPresent()) {
    // System.out.println("lugar");
    // registro.setLugar(lugarOptional.get());
    // System.out.println(registro.getLugar().getNombre());

    // } else {
    // // Handle case where associated LugarModel is not found
    // System.out.println("Lugar no encontrado");
    // }
    // }

    // return registro;
    // } else {
    // // Handle case where RegistroModel is not found
    // return null;
    // }
    // }

    @SuppressWarnings("null")
    public Optional<RegistroModel> getRegistroById(Long registroId) {
        return registroRepository.findById(registroId);
    }

    public RegistroModel createRegistro(RegistroModel registro) {
        // Implement any validation logic if needed
        return registroRepository.save(registro);
    }
}
