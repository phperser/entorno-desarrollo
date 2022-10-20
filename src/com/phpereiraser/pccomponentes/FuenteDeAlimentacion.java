package com.phpereiraser.pccomponentes;

public class FuenteDeAlimentacion {
    private Integer id;
    private String brand;
    private String model;
    private String Watts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public  String getWatts(){return brand;}
    public  void  setWatts(String Watts) {this.Watts = Watts;}

}
