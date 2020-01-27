package com.company.model;

public class Darah{
    protected int idDarah;
    protected String jenisDarah;
    protected int stock;
    protected int jumlahDarahMasuk;
    protected int jumlahDarahKeluar;

    public Darah() {
    }

    public int getIdDarah() {
        return idDarah;
    }

    public void setIdDarah(int idDarah) {
        this.idDarah = idDarah;
    }

    public String getJenisDarah() {
        return jenisDarah;
    }

    public void setJenisDarah(String jenisDarah) {
        this.jenisDarah = jenisDarah;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getJumlahDarahMasuk() {
        return jumlahDarahMasuk;
    }

    public void setJumlahDarahMasuk(int jumlahDarahMasuk) {
        this.jumlahDarahMasuk = jumlahDarahMasuk;
    }

    public int getJumlahDarahKeluar() {
        return jumlahDarahKeluar;
    }

    public void setJumlahDarahKeluar(int jumlahDarahKeluar) {
        this.jumlahDarahKeluar = jumlahDarahKeluar;
    }

    public Darah(String jenisDarah) {
        this.jenisDarah = jenisDarah;
        this.stock=0;
        this.jumlahDarahMasuk = 0;
        this.jumlahDarahKeluar = 0;
    }

    public void addingDarah(Pendonoran pendonor){
        if (jenisDarah.equals(pendonor.getJenisDarah())){
            jumlahDarahMasuk+=pendonor.getJumlahDarahMasuk();
            stock+=pendonor.getJumlahDarahMasuk();
        }
    }

    public void editDarah(Permintaan penerima){
        if (jenisDarah.equals(penerima.getJenisDarah()) && stock>=penerima.jumlahDarahMasuk){
            jumlahDarahKeluar+=penerima.getJumlahDarahKeluar();
            stock-=penerima.getJumlahDarahMasuk();
        }
    }

    public void showStock() {
        System.out.println("Persediaan darah :");
        System.out.println("Jenis darah = " + jenisDarah +";  dengan jumlah Stock = " + stock );
    }
}
