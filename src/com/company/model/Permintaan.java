package com.company.model;

import static com.company.model.Main.sc;

public class Permintaan extends  Darah {
    private String namaPeminta ;
    private String tglBeli;

    public Permintaan(String jenisDarah, int hargaSatuan, int jumlahDarahKeluar, int jumlahDarahMasuk) {
        super();
    }

    public Permintaan() {
    }

    public String getNamaPeminta() {
        return namaPeminta;
    }

    public void setNamaPeminta(String namaPeminta) {
        this.namaPeminta = namaPeminta;
    }

    public String getTglBeli() {
        return tglBeli;
    }

    public void setTglBeli(String tglBeli) {
        this.tglBeli = tglBeli;
    }
    
    public void addingPenerima(){
        System.out.println("Tanggal Transaksi : ");
        tglBeli = sc.nextLine();
        System.out.println("Masukkan nama pemohon : ");
        namaPeminta = sc.nextLine();
        System.out.println("Masukkan jenis darah (golongan) [A/B/AB/O] : ");
        jenisDarah = sc.nextLine();
        System.out.println("jumlah kantong darah : ");
        jumlahDarahMasuk = sc.nextInt();
        System.out.println("Data sudah terinput");
        if (jumlahDarahMasuk>stock){
            stock=getStock();
            System.out.println("Stock Tidak Terpenuhi, Stock yang terserdia hanya " + stock);
        }
        
    }

    public void showPenerima(){
        System.out.println("tanggal transaksi : " + tglBeli);
        System.out.println("Nama pemohon : " + namaPeminta);
        System.out.println("jenis Darah : " + jenisDarah);
        System.out.println("jumlah darah yang keluar : " + jumlahDarahKeluar);
    }
}
