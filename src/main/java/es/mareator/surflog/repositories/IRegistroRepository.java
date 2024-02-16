package es.mareator.surflog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.mareator.surflog.models.RegistroModel;

public interface IRegistroRepository extends JpaRepository<RegistroModel, Long> {

}
