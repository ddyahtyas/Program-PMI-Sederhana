package com.company.model;

import java.util.ArrayList;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] strings) {
        System.out.println("SELAMAT DATANG PADA SISTEM PENDATAAN DONOR DARAH SEDERHANA \n" +
                           "========================= LOGIN =========================");
        System.out.println("Username : ");
        username: sc.nextLine();
        System.out.println("Password : ");
        password: sc.nextLine();
        System.out.println("Jabatan(pegawai/admin)");
        String pilih = sc.nextLine();
        switch (pilih) {
            case "pegawai":
                Pegawai pegawai = new Pegawai();
                break;
            case "admin":
                Administrasi administrasi = new Administrasi();
                break;
        }
    }
}
