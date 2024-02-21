package es.mareator.surflog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "lugares")
public class LugarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String coordenadas;

    @OneToMany(mappedBy = "lugar")
    @JsonBackReference

    private List<RegistroModel> registros;

    public LugarModel() {
    }

    public LugarModel(Long id, String nombre, String coordenadas, List<RegistroModel> registros) {
        this.id = id;
        this.nombre = nombre;
        this.coordenadas = coordenadas;
        this.registros = registros;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCoordenadas() {
        return this.coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public List<RegistroModel> getRegistros() {
        return this.registros;
    }

    public void setRegistros(List<RegistroModel> registros) {
        this.registros = registros;
    }

    public LugarModel id(Long id) {
        setId(id);
        return this;
    }

    public LugarModel nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public LugarModel coordenadas(String coordenadas) {
        setCoordenadas(coordenadas);
        return this;
    }

    public LugarModel registros(List<RegistroModel> registros) {
        setRegistros(registros);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LugarModel)) {
            return false;
        }
        LugarModel lugarModel = (LugarModel) o;
        return Objects.equals(id, lugarModel.id) && Objects.equals(nombre, lugarModel.nombre)
                && Objects.equals(coordenadas, lugarModel.coordenadas)
                && Objects.equals(registros, lugarModel.registros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, coordenadas, registros);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", coordenadas='" + getCoordenadas() + "'" +
                ", registros='" + getRegistros() + "'" +
                "}";
    }

}
