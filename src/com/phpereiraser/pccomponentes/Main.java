package com.phpereiraser.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");


        Procesador Intel = new Procesador();
        Intel.setId(1);
        Intel.setFabricante("Intel");
        Intel.setMarca("I7 11800H");

        System.out.println(Intel.getId());
        System.out.println(Intel.getmarca());
        System.out.println(Intel.getFabricante());

        PlacaBase MSI_PRO_B660M = new PlacaBase();
        MSI_PRO_B660M.setId(2);
        MSI_PRO_B660M.setBrand("MSI");
        MSI_PRO_B660M.setModel("B660M");

        System.out.println(MSI_PRO_B660M.getId());
        System.out.println(MSI_PRO_B660M.getBrand());
        System.out.println(MSI_PRO_B660M.getModel());

        VentiladorCPU Tempest_Cooler = new VentiladorCPU();
        Tempest_Cooler.setId(3);
        Tempest_Cooler.setBrand("Tempest");
        Tempest_Cooler.setModel("Cooler 4Pipes White");

        System.out.println(Tempest_Cooler.getId());
        System.out.println(Tempest_Cooler.getBrand());
        System.out.println(Tempest_Cooler.getModel());

        Teclado Newskill_Suiko = new Teclado();
        Newskill_Suiko.setId(4);
        Newskill_Suiko.setBrand("Newskill");
        Newskill_Suiko.setModel("Suiko");

        System.out.println(Newskill_Suiko.getId());
        System.out.println(Newskill_Suiko.getBrand());
        System.out.println(Newskill_Suiko.getModel());

        TarjetaGrafica Nvidia_RTX= new TarjetaGrafica();
        Nvidia_RTX.setId(5);
        Nvidia_RTX.setBrand("Nvidia");
        Nvidia_RTX.setModel("Gigabyte RTX 3060");

        System.out.println(Nvidia_RTX.getId());
        System.out.println(Nvidia_RTX.getBrand());
        System.out.println(Nvidia_RTX.getModel());


        TarjetadeSonido Creative= new TarjetadeSonido();
        Creative.setId(6);
        Creative.setBrand("Creative");
        Creative.setModel("Sound Blaster Audigy");

        System.out.println(Creative.getId());
        System.out.println(Creative.getBrand());
        System.out.println(Creative.getModel());

        Raton Tempest= new Raton();
        Tempest.setId(7);
        Tempest.setBrand("Tempest");
        Tempest.setModel("X6 Guardian");

        System.out.println(Tempest.getId());
        System.out.println(Tempest.getBrand());
        System.out.println(Tempest.getModel());

        Monitor MSI= new Monitor();
        MSI.setId(8);
        MSI.setBrand("MSI");
        MSI.setModel("Optix G241VC");

        System.out.println(MSI.getId());
        System.out.println(MSI.getBrand());
        System.out.println(MSI.getModel());

        MemoriaRAM Crucial= new MemoriaRAM();
        Crucial.setId(9);
        Crucial.setBrand("Crucial");
        Crucial.setModel("CL17");
        Crucial.setCapacity("16GB");
        Crucial.setSpeed("2400 MHz");

        System.out.println(Crucial.getId());
        System.out.println(Crucial.getBrand());
        System.out.println(Crucial.getModel());
        System.out.println(Crucial.getCapacity());
        System.out.println(Crucial.getSpeed());

        GrabadoraDVD Asus= new GrabadoraDVD();
        Asus.setId(10);
        Asus.setBrand("Asus");
        Asus.setModel("DRW-24D5MT");

        System.out.println(Asus.getId());
        System.out.println(Asus.getBrand());
        System.out.println(Asus.getModel());

        FuenteDeAlimentacion Keep_Out= new FuenteDeAlimentacion();
        Keep_Out.setId(11);
        Keep_Out.setBrand("Keep Out");
        Keep_Out.setModel("FX900V2");
        Keep_Out.setWatts("900W");

        System.out.println(Keep_Out.getId());
        System.out.println(Keep_Out.getBrand());
        System.out.println(Keep_Out.getModel());
        System.out.println(Keep_Out.getWatts());


        DiscoDuro Samsung = new DiscoDuro();
        Samsung.setId(12);
        Samsung.setBrand("Samsung");
        Samsung.setModel("870 QVO SSD");
        Samsung.setCapacity("1TB");

        System.out.println(Samsung.getId());
        System.out.println(Samsung.getBrand());
        System.out.println(Samsung.getModel());
        System.out.println(Samsung.getCapacity());


        CajaTorre Tempest_Start   = new CajaTorre();
        Tempest_Start .setId(13);
        Tempest_Start .setBrand("Tempest");
        Tempest_Start .setModel("Start Torre ATX");

        System.out.println(Tempest_Start .getId());
        System.out.println(Tempest_Start.getBrand());
        System.out.println(Tempest_Start .getModel());


        Altavoces Tempest_M10   = new Altavoces();
        Tempest_M10 .setId(13);
        Tempest_M10 .setBrand("Tempest");
        Tempest_M10 .setModel("M10 RGB Hero");

        System.out.println(Tempest_M10 .getId());
        System.out.println(Tempest_M10.getBrand());
        System.out.println(Tempest_M10 .getModel());




        SetupPC setupPC1 = new SetupPC();

        setupPC1.setId("1234");
        setupPC1.setProcesador(Intel);
        setupPC1.setPlacaBase(MSI_PRO_B660M);

        System.out.println(setupPC1.getId());
        System.out.println("Procesador: " + setupPC1.getProcesador().getmarca());
        System.out.println("Placa Base: " + setupPC1.getPlacaBase().getBrand());

    }
}