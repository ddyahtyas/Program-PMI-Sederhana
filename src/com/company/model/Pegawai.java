package com.company.model;

import java.util.ArrayList;

import static com.company.model.Main.*;

public class Pegawai extends Person {
    public static ArrayList<Pendonoran> pendonorans = new ArrayList<>();
    public static ArrayList<Permintaan> penerimaans = new ArrayList<>();
    public static ArrayList<Darah> darahs= new ArrayList<>();

    public Pegawai(){
        darahs.add(new Darah("A"));
        darahs.add(new Darah("B"));
        darahs.add(new Darah("AB"));
        darahs.add(new Darah("O"));
        boolean quit = false;
        while (!quit){
        System.out.println("MENU FOR PEGAWAI \n 1. Menambah Pendonor \n 2. Menambah Penerima donor \n 3. Melihat Stock Darah \n 4. Melihat history pendonor \n 5. Melihat history penerima \n 6.Keluar");
        int pilih = sc.nextInt();
        sc.nextLine();
        Pendonoran pendonor;
        Permintaan penerima;
        switch (pilih){
            case 1:
                pendonor = new Pendonoran();
                pendonor.addingPendonor();
                for (Darah darah : darahs) {
                    darah.addingDarah(pendonor);
                }
                pendonorans.add(pendonor);
                break;
            case 2:
                penerima = new Permintaan();
                penerima.addingPenerima();
                for (Darah darah : darahs) {
                    darah.editDarah(penerima);
                }
                penerimaans.add(penerima);
                break;
            case 3 :
                for (Darah darah : darahs) {
                    darah.showStock();
                }
                break;
            case 4:
                for (Pendonoran pendonoran : pendonorans) {
                    pendonoran.showPendonor();
                }
                break;
            case 5:
                for (Permintaan penerimaan : penerimaans) {
                    penerimaan.showPenerima();
                }
                break;
            case 6:
                quit=true;
                break;
            }
        }
    }
}
