/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;

public class transaksi {
    private int id_transaksi;
    private String kd_barang;
    private String kd_customer;
    private Date tanggal_bayar;
    private String jumlah_barang;
    private String harga_jual;
    private String ongkir;
    private String total_bayar;
    private String bukti_bayar;
    private String kd_kategori;
    private String status_bayar;
    private String kd_pesan;

    // Constructor
    public transaksi(int id_transaksi, String kd_barang, String kd_customer, Date tanggal_bayar, String jumlah_barang, String harga_jual , String ongkir, String total_bayar, String bukti_bayar, String kd_kategori, String status_bayar,String kd_pesan  ) {
        this.id_transaksi = id_transaksi;
        this.kd_barang = kd_barang;
        this.kd_customer = kd_customer;
        this.tanggal_bayar = tanggal_bayar;
        this.jumlah_barang = jumlah_barang;
        this.harga_jual = harga_jual;
        this.ongkir = ongkir;
        this.total_bayar = total_bayar;
        this.bukti_bayar = bukti_bayar;
        this.kd_kategori = kd_kategori;
        this.status_bayar = status_bayar;
        this.kd_pesan = kd_pesan;
    }

    // Getter dan Setter
    public int getid_transaksi() {
        return id_transaksi;
    }

    public void setid_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getkd_barang() {
        return kd_barang;
    }

    public void setkd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String getkd_customer() {
        return kd_customer;
    }

    public void setkd_customer(String kd_customer) {
        this.kd_customer = kd_customer;
    }
    
    public Date gettanggal_bayar() {
        return tanggal_bayar;
    }

    public void settanggal_bayar(Date tanggal_bayar) {
        this.tanggal_bayar = tanggal_bayar;
    }
    
    public String getjumlah_barang() {
        return jumlah_barang;
    }

    public void setjumlah_barang(String jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }
    
    public String getharga_jual() {
        return harga_jual;
    }

    public void setharga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }
    
    public String getongkir() {
        return ongkir;
    }

    public void setongkir(String ongkir) {
        this.ongkir = ongkir;
    }
    
    public String gettotal_bayar() {
        return total_bayar;
    }

    public void settotal_bayar(String total_bayar) {
        this.total_bayar = total_bayar;
    }

    public String getbukti_bayar() {
        return bukti_bayar;
    }

    public void setbukti_bayar(String bukti_bayar) {
        this.bukti_bayar = bukti_bayar;
    }

    public String getkd_kategori() {
        return kd_kategori;
    }

    public void setkd_kategori(String kd_kategori) {
        this.kd_kategori = kd_kategori;
    }
    
    public String getstatus_bayar() {
        return status_bayar;
    }

    public void setstatus_bayar(String status_bayar) {
        this.status_bayar = status_bayar;
    }
    
    public String getkd_pesan() {
        return kd_pesan;
    }

    public void setkd_pesan(String kd_pesan) {
        this.kd_pesan = kd_pesan;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------TRANSAKSI-----------------");
        System.out.println("-----------------------------------------");
        System.out.println("ID Transaksi: " + id_transaksi);
        System.out.println("Kode Barang: " + kd_barang);
        System.out.println("Kode Customer: " + kd_customer);
        System.out.println("Tanggal Bayar: " + tanggal_bayar);
        System.out.println("Jumlah Barang: " + jumlah_barang);
        System.out.println("Harga Jual: " + harga_jual);
        System.out.println("Ongkir: " + ongkir);
        System.out.println("Total Bayar: " + total_bayar);
        System.out.println("Bukti Bayar: " + bukti_bayar);
        System.out.println("Kode Kategori: " + kd_kategori);
        System.out.println("Status Bayar: " + status_bayar);
        System.out.println("Kode Pesan: " + kd_pesan);
        System.out.println("----------------------------------------");
    }
    
}

