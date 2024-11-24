package com.buses.civa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;


@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numeroBus;
    private String placa;
    private String caracteristicas;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    @JsonProperty("marca")
    private Marca marca;

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getMarca() {
        return marca != null ? marca.getNombre() : "Sin Marca";
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
