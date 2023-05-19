/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;

public class barang {
    private int id_barang;
    private String kd_barang;
    private String nama;
    private String kd_kategori;
    private String kd_supplier;
    private Date tanggal_beli;
    private String stok;
    private String satuan;
    private double harga_beli;
    private double harga_jual;
    

    // Constructor
    public barang(int id_barang, String kd_barang, String nama, String kd_kategori, String kd_supplier, Date tanggal_beli , String stok, String satuan, double harga_beli, double harga_jual ) {
        this.id_barang = id_barang;
        this.kd_barang = kd_barang;
        this.nama = nama;
        this.kd_kategori = kd_kategori;
        this.kd_supplier = kd_supplier;
        this.tanggal_beli = tanggal_beli;
        this.stok = stok;
        this.satuan = satuan;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
    }

    // Getter dan Setter
    public int getid_barang() {
        return id_barang;
    }

    public void setIdProduk(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getkd_barang() {
        return kd_barang;
    }

    public void setkd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }
    
    public String getkd_kategori() {
        return kd_kategori;
    }

    public void setkd_kategori(String kd_kategori) {
        this.kd_kategori = kd_kategori;
    }
    
    public String getkd_supplier() {
        return kd_supplier;
    }

    public void setkd_supplier(String kd_supplier) {
        this.kd_supplier = kd_supplier;
    }
    
    public Date gettanggal_beli() {
        return tanggal_beli;
    }

    public void settanggal_beli(Date tanggal_beli) {
        this.tanggal_beli = tanggal_beli;
    }
    
    public String getstok() {
        return stok;
    }

    public void setstok(String stok) {
        this.stok = stok;
    }
    
    public String getsatuan() {
        return satuan;
    }

    public void setsatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getharga_beli() {
        return harga_beli;
    }

    public void setharga_beli(double harga_beli) {
        this.harga_beli = harga_beli;
    }

    public double getharga_jual() {
        return harga_jual;
    }

    public void setharga_jual(double harga_jual) {
        this.harga_jual = harga_jual;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("--------------------------------------");
        System.out.println("---------------BARANG-----------------");
        System.out.println("--------------------------------------");
        System.out.println("ID Barang: "        +id_barang);
        System.out.println("Kode Barang: "      +kd_barang);
        System.out.println("Nama: "                 + nama);
        System.out.println("Kode Kategori: "  +kd_kategori);
        System.out.println("Kode Supplier: "  +kd_supplier);
        System.out.println("Tanggal Beli: "  +tanggal_beli);
        System.out.println("Stok: "                  +stok);
        System.out.println("Satuan: "              +satuan);
        System.out.println("Harga Beli: "      +harga_beli);
        System.out.println("Harga Jual: "      +harga_jual);
        System.out.println("----------------------------------------");
    }
    
}

