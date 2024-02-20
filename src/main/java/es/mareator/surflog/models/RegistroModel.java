package es.mareator.surflog.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "registros")
public class RegistroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime momento;

    @ManyToOne
    @JoinColumn(name = "lugar") // This assumes you have a column named "lugar_id" in registros table
    @JsonBackReference
    private LugarModel lugar;

    @Column
    private String texto;

    @Column
    private Integer gente;

    @Column
    private String fotos;

    // Condiciones --------------------------------------- >

    @Column
    private Double altura_ola; // Use Double instead of double for nullable

    @Column
    private Short direccion_ola; // Use Integer instead of int for nullable

    @Column
    private Double periodo_ola;

    @Column
    private Double velocidad_viento;

    @Column
    private Short direccion_viento;

    @Column
    private Double punto_marea;

    @Column
    private Boolean subiendo_marea; // Use Boolean instead of boolean for nullable

    @Column
    private Double altura_marea;

    @Column
    private Double temperatura_agua;

    @Column
    private Double temperatura_ambiente;

    @Column
    private Double lluvia;

    @Column
    private Double nubes;

    // Condiciones --------------------------------------------------- <

    // Surfada ------------------------------------------------------- >

    @Column
    private Short tiempo;

    @Column
    private Byte numero_olas;

    @Column
    private Byte que_tal_olas;

    @Column
    private Byte que_tal_yo;

    @Column
    private String foto_sesion;

    @Column
    private String fotos_sesion;

    // Surfada -------------------------------------- <

    public RegistroModel() {
    }

    public RegistroModel(Long id, LocalDateTime momento, LugarModel lugar, String texto, Integer gente, String fotos,
            Double altura_ola, Short direccion_ola, Double periodo_ola, Double velocidad_viento, Short direccion_viento,
            Double punto_marea, Boolean subiendo_marea, Double altura_marea, Double temperatura_agua,
            Double temperatura_ambiente, Double lluvia, Double nubes, Short tiempo, Byte numero_olas, Byte que_tal_olas,
            Byte que_tal_yo, String foto_sesion, String fotos_sesion) {
        this.id = id;
        this.momento = momento;
        this.lugar = lugar;
        this.texto = texto;
        this.gente = gente;
        this.fotos = fotos;
        this.altura_ola = altura_ola;
        this.direccion_ola = direccion_ola;
        this.periodo_ola = periodo_ola;
        this.velocidad_viento = velocidad_viento;
        this.direccion_viento = direccion_viento;
        this.punto_marea = punto_marea;
        this.subiendo_marea = subiendo_marea;
        this.altura_marea = altura_marea;
        this.temperatura_agua = temperatura_agua;
        this.temperatura_ambiente = temperatura_ambiente;
        this.lluvia = lluvia;
        this.nubes = nubes;
        this.tiempo = tiempo;
        this.numero_olas = numero_olas;
        this.que_tal_olas = que_tal_olas;
        this.que_tal_yo = que_tal_yo;
        this.foto_sesion = foto_sesion;
        this.fotos_sesion = fotos_sesion;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getMomento() {
        return this.momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public LugarModel getLugar() {
        return this.lugar;
    }

    public void setLugar(LugarModel lugar) {
        this.lugar = lugar;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getGente() {
        return this.gente;
    }

    public void setGente(Integer gente) {
        this.gente = gente;
    }

    public String getFotos() {
        return this.fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public Double getAltura_ola() {
        return this.altura_ola;
    }

    public void setAltura_ola(Double altura_ola) {
        this.altura_ola = altura_ola;
    }

    public Short getDireccion_ola() {
        return this.direccion_ola;
    }

    public void setDireccion_ola(Short direccion_ola) {
        this.direccion_ola = direccion_ola;
    }

    public Double getPeriodo_ola() {
        return this.periodo_ola;
    }

    public void setPeriodo_ola(Double periodo_ola) {
        this.periodo_ola = periodo_ola;
    }

    public Double getVelocidad_viento() {
        return this.velocidad_viento;
    }

    public void setVelocidad_viento(Double velocidad_viento) {
        this.velocidad_viento = velocidad_viento;
    }

    public Short getDireccion_viento() {
        return this.direccion_viento;
    }

    public void setDireccion_viento(Short direccion_viento) {
        this.direccion_viento = direccion_viento;
    }

    public Double getPunto_marea() {
        return this.punto_marea;
    }

    public void setPunto_marea(Double punto_marea) {
        this.punto_marea = punto_marea;
    }

    public Boolean isSubiendo_marea() {
        return this.subiendo_marea;
    }

    public Boolean getSubiendo_marea() {
        return this.subiendo_marea;
    }

    public void setSubiendo_marea(Boolean subiendo_marea) {
        this.subiendo_marea = subiendo_marea;
    }

    public Double getAltura_marea() {
        return this.altura_marea;
    }

    public void setAltura_marea(Double altura_marea) {
        this.altura_marea = altura_marea;
    }

    public Double getTemperatura_agua() {
        return this.temperatura_agua;
    }

    public void setTemperatura_agua(Double temperatura_agua) {
        this.temperatura_agua = temperatura_agua;
    }

    public Double getTemperatura_ambiente() {
        return this.temperatura_ambiente;
    }

    public void setTemperatura_ambiente(Double temperatura_ambiente) {
        this.temperatura_ambiente = temperatura_ambiente;
    }

    public Double getLluvia() {
        return this.lluvia;
    }

    public void setLluvia(Double lluvia) {
        this.lluvia = lluvia;
    }

    public Double getNubes() {
        return this.nubes;
    }

    public void setNubes(Double nubes) {
        this.nubes = nubes;
    }

    public Short getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(Short tiempo) {
        this.tiempo = tiempo;
    }

    public Byte getNumero_olas() {
        return this.numero_olas;
    }

    public void setNumero_olas(Byte numero_olas) {
        this.numero_olas = numero_olas;
    }

    public Byte getQue_tal_olas() {
        return this.que_tal_olas;
    }

    public void setQue_tal_olas(Byte que_tal_olas) {
        this.que_tal_olas = que_tal_olas;
    }

    public Byte getQue_tal_yo() {
        return this.que_tal_yo;
    }

    public void setQue_tal_yo(Byte que_tal_yo) {
        this.que_tal_yo = que_tal_yo;
    }

    public String getFoto_sesion() {
        return this.foto_sesion;
    }

    public void setFoto_sesion(String foto_sesion) {
        this.foto_sesion = foto_sesion;
    }

    public String getFotos_sesion() {
        return this.fotos_sesion;
    }

    public void setFotos_sesion(String fotos_sesion) {
        this.fotos_sesion = fotos_sesion;
    }

    public RegistroModel id(Long id) {
        setId(id);
        return this;
    }

    public RegistroModel momento(LocalDateTime momento) {
        setMomento(momento);
        return this;
    }

    public RegistroModel lugar(LugarModel lugar) {
        setLugar(lugar);
        return this;
    }

    public RegistroModel texto(String texto) {
        setTexto(texto);
        return this;
    }

    public RegistroModel gente(Integer gente) {
        setGente(gente);
        return this;
    }

    public RegistroModel fotos(String fotos) {
        setFotos(fotos);
        return this;
    }

    public RegistroModel altura_ola(Double altura_ola) {
        setAltura_ola(altura_ola);
        return this;
    }

    public RegistroModel direccion_ola(Short direccion_ola) {
        setDireccion_ola(direccion_ola);
        return this;
    }

    public RegistroModel periodo_ola(Double periodo_ola) {
        setPeriodo_ola(periodo_ola);
        return this;
    }

    public RegistroModel velocidad_viento(Double velocidad_viento) {
        setVelocidad_viento(velocidad_viento);
        return this;
    }

    public RegistroModel direccion_viento(Short direccion_viento) {
        setDireccion_viento(direccion_viento);
        return this;
    }

    public RegistroModel punto_marea(Double punto_marea) {
        setPunto_marea(punto_marea);
        return this;
    }

    public RegistroModel subiendo_marea(Boolean subiendo_marea) {
        setSubiendo_marea(subiendo_marea);
        return this;
    }

    public RegistroModel altura_marea(Double altura_marea) {
        setAltura_marea(altura_marea);
        return this;
    }

    public RegistroModel temperatura_agua(Double temperatura_agua) {
        setTemperatura_agua(temperatura_agua);
        return this;
    }

    public RegistroModel temperatura_ambiente(Double temperatura_ambiente) {
        setTemperatura_ambiente(temperatura_ambiente);
        return this;
    }

    public RegistroModel lluvia(Double lluvia) {
        setLluvia(lluvia);
        return this;
    }

    public RegistroModel nubes(Double nubes) {
        setNubes(nubes);
        return this;
    }

    public RegistroModel tiempo(Short tiempo) {
        setTiempo(tiempo);
        return this;
    }

    public RegistroModel numero_olas(Byte numero_olas) {
        setNumero_olas(numero_olas);
        return this;
    }

    public RegistroModel que_tal_olas(Byte que_tal_olas) {
        setQue_tal_olas(que_tal_olas);
        return this;
    }

    public RegistroModel que_tal_yo(Byte que_tal_yo) {
        setQue_tal_yo(que_tal_yo);
        return this;
    }

    public RegistroModel foto_sesion(String foto_sesion) {
        setFoto_sesion(foto_sesion);
        return this;
    }

    public RegistroModel fotos_sesion(String fotos_sesion) {
        setFotos_sesion(fotos_sesion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RegistroModel)) {
            return false;
        }
        RegistroModel registroModel = (RegistroModel) o;
        return Objects.equals(id, registroModel.id) && Objects.equals(momento, registroModel.momento)
                && Objects.equals(lugar, registroModel.lugar) && Objects.equals(texto, registroModel.texto)
                && Objects.equals(gente, registroModel.gente) && Objects.equals(fotos, registroModel.fotos)
                && Objects.equals(altura_ola, registroModel.altura_ola)
                && Objects.equals(direccion_ola, registroModel.direccion_ola)
                && Objects.equals(periodo_ola, registroModel.periodo_ola)
                && Objects.equals(velocidad_viento, registroModel.velocidad_viento)
                && Objects.equals(direccion_viento, registroModel.direccion_viento)
                && Objects.equals(punto_marea, registroModel.punto_marea)
                && Objects.equals(subiendo_marea, registroModel.subiendo_marea)
                && Objects.equals(altura_marea, registroModel.altura_marea)
                && Objects.equals(temperatura_agua, registroModel.temperatura_agua)
                && Objects.equals(temperatura_ambiente, registroModel.temperatura_ambiente)
                && Objects.equals(lluvia, registroModel.lluvia) && Objects.equals(nubes, registroModel.nubes)
                && Objects.equals(tiempo, registroModel.tiempo)
                && Objects.equals(numero_olas, registroModel.numero_olas)
                && Objects.equals(que_tal_olas, registroModel.que_tal_olas)
                && Objects.equals(que_tal_yo, registroModel.que_tal_yo)
                && Objects.equals(foto_sesion, registroModel.foto_sesion)
                && Objects.equals(fotos_sesion, registroModel.fotos_sesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, momento, lugar, texto, gente, fotos, altura_ola, direccion_ola, periodo_ola,
                velocidad_viento, direccion_viento, punto_marea, subiendo_marea, altura_marea, temperatura_agua,
                temperatura_ambiente, lluvia, nubes, tiempo, numero_olas, que_tal_olas, que_tal_yo, foto_sesion,
                fotos_sesion);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", momento='" + getMomento() + "'" +
                ", lugar='" + getLugar() + "'" +
                ", texto='" + getTexto() + "'" +
                ", gente='" + getGente() + "'" +
                ", fotos='" + getFotos() + "'" +
                ", altura_ola='" + getAltura_ola() + "'" +
                ", direccion_ola='" + getDireccion_ola() + "'" +
                ", periodo_ola='" + getPeriodo_ola() + "'" +
                ", velocidad_viento='" + getVelocidad_viento() + "'" +
                ", direccion_viento='" + getDireccion_viento() + "'" +
                ", punto_marea='" + getPunto_marea() + "'" +
                ", subiendo_marea='" + isSubiendo_marea() + "'" +
                ", altura_marea='" + getAltura_marea() + "'" +
                ", temperatura_agua='" + getTemperatura_agua() + "'" +
                ", temperatura_ambiente='" + getTemperatura_ambiente() + "'" +
                ", lluvia='" + getLluvia() + "'" +
                ", nubes='" + getNubes() + "'" +
                ", tiempo='" + getTiempo() + "'" +
                ", numero_olas='" + getNumero_olas() + "'" +
                ", que_tal_olas='" + getQue_tal_olas() + "'" +
                ", que_tal_yo='" + getQue_tal_yo() + "'" +
                ", foto_sesion='" + getFoto_sesion() + "'" +
                ", fotos_sesion='" + getFotos_sesion() + "'" +
                "}";
    }

}
