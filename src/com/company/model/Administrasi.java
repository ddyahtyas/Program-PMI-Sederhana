package com.company.model;

import com.company.CRUD;

import java.util.ArrayList;

import static com.company.model.Main.sc;
import static javafx.application.Platform.exit;

public class Administrasi extends Person implements CRUD {

    private int pilih;
    public static ArrayList<Orang> orangs = new ArrayList<>();

    public Administrasi(){
        boolean quit = false;
        while (!quit){
        System.out.println("MENU FOR ADMIN \n 1. Menambah Pegawai baru  \n 2. Update Pegawai \n 3. Menghapus Data Pegawai \n 4. Melihat Semua Pegawai \n 5. keluar");
        pilih = sc.nextInt();
        sc.nextLine();
            switch (pilih) {
                case 1:
                    create();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    read();
                    break;
                case 5:
                    exit();
                    quit=true;
                    break;
            }
        }
    }

    public Administrasi(Person person) {
        super(person);
    }

    @Override
    public boolean create() {
        orangs.add(new Orang());
        return false;
    }

    @Override
    public boolean update() {
        for (int i = 0; i < orangs.size(); i++) {
            System.out.println("id" + i);
            orangs.get(i).orangShow();
        }
        System.out.println("pilih id");
        pilih = sc.nextInt();
        sc.nextLine();
        System.out.println("username");
        orangs.get(pilih).username = sc.nextLine();
        System.out.println("pass");
        orangs.get(pilih).password = sc.nextLine();
        System.out.println("nama");
        orangs.get(pilih).nama = sc.nextLine();
        System.out.println("jabatan");
        orangs.get(pilih).jabatan = sc.nextLine();
        return false;
    }

    @Override
    public boolean delete() {
        for (int i = 0; i < orangs.size(); i++) {
            System.out.println("id" + i);
            orangs.get(i).orangShow();
        }
        System.out.println("pilih id");
        pilih = sc.nextInt();
        orangs.remove(pilih);
        return false;
    }

    @Override
    public void read() {
        for (int i = 0; i < orangs.size(); i++) {
            System.out.println("id" + i);
            orangs.get(i).orangShow();
        }
    }
}

