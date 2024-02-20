package es.mareator.surflog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.mareator.surflog.models.LugarModel;
import es.mareator.surflog.repositories.ILugarRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class LugarService {

    @Autowired
    ILugarRepository lugarRepository;

    public List<LugarModel> getLugares() {
        try {
            List<LugarModel> lugares = (ArrayList<LugarModel>) lugarRepository.findAll();
            System.out.println(lugares.size());
            return lugares;
        } catch (Exception e) {
            System.err.println("Error recuperando Lugares: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
