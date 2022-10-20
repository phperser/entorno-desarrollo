package com.phpereiraser.pccomponentes;

public class SetupPC {
    private String id;
    private Procesador procesador;
    private PlacaBase placaBase;


    public void setId(String id){
        this.id = id;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public void setPlacaBase(PlacaBase placaBase) {
        this.placaBase = placaBase;
    }

    public String getId() {
        return this.id;
    }

    public Procesador getProcesador() {
        return this.procesador;
    }

    public PlacaBase getPlacaBase() {
        return this.placaBase;
    }
}
