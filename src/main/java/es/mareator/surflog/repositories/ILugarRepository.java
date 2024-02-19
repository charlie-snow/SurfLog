package es.mareator.surflog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.mareator.surflog.models.LugarModel;

public interface ILugarRepository extends JpaRepository<LugarModel, Long> {

}
