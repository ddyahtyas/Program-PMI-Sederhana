package com.company.model;

import static com.company.model.Main.sc;

public class Pendonoran extends Darah {
    private String nama;
    private String tglDonor;

    public Pendonoran(String jenisDarah, int stock, int jumlahDarahMasuk, int jumlahDarahKeluar) {
        super();
    }

    public Pendonoran() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglDonor() {
        return tglDonor;
    }

    public void setTglDonor(String tglDonor) {
        this.tglDonor = tglDonor;
    }

     public void addingPendonor(){
         System.out.println("Tanggal Donor : ");
         tglDonor = sc.nextLine();
         System.out.println("Masukkan nama pendonor : ");
         nama = sc.nextLine();
         System.out.println("Masukkan jenis darah (golongan) [A/B/AB/O] : ");
         jenisDarah = sc.nextLine();
         System.out.println("jumlah kantong darah : ");
         jumlahDarahMasuk = sc.nextInt();
         System.out.println("Data sudah terinput");
        }

     public void showPendonor(){
         System.out.println("tanggal donor : " + tglDonor);
         System.out.println("Nama : " + nama);
         System.out.println("jenis Darah : " + jenisDarah);
         System.out.println("jumlah darah yang masuk : " + jumlahDarahMasuk);
     }
}
