package com.phpereiraser.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Procesador amd = new Procesador();
        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getmarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("I7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getId());
        System.out.println(pentium.getmarca());
        System.out.println(pentium.getFabricante());

        PlacaBase MSI_PRO_B660M = new PlacaBase();
        MSI_PRO_B660M.setId(3);
        MSI_PRO_B660M.setBrand("MSI");
        MSI_PRO_B660M.setModel("B660M");

        System.out.println(MSI_PRO_B660M.getId());
        System.out.println(MSI_PRO_B660M.getBrand());
        System.out.println(MSI_PRO_B660M.getModel());
    }
}