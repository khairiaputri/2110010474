/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;

public class pesanan {
    private int id_pesan;
    private String kd_barang;
    private String kd_customer;
    private String jumlah;
    private String harga_jual;
    private Date tanggal_pesan;
    private String status_pesan;
    
    // Constructor
    public pesanan(int id_pesan, String kd_barang, String kd_customer, String jumlah, String harga_jual, Date tanggal_pesan , String status_pesan) {
        this.id_pesan = id_pesan;
        this.kd_barang = kd_barang;
        this.kd_customer = kd_customer;
        this.jumlah = jumlah;
        this.harga_jual = harga_jual;
        this.tanggal_pesan = tanggal_pesan;
        this.status_pesan = status_pesan;
    }

    // Getter dan Setter
    public int getid_barang() {
        return id_pesan;
    }

    public void setid_pesan(int id_pesan) {
        this.id_pesan = id_pesan;
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
    
    public String getjumlah() {
        return jumlah;
    }

    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    
    public String getharga_jual() {
        return harga_jual;
    }

    public void setharga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }
    
    public Date gettanggal_pesan() {
        return tanggal_pesan;
    }

    public void settanggal_pesan(Date tanggal_pesan) {
        this.tanggal_pesan = tanggal_pesan;
    }
    
    public String getstatus_pesan() {
        return status_pesan;
    }

    public void setstatus_pesan(String status_pesan) {
        this.status_pesan = status_pesan;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------PESANAN-----------------");
        System.out.println("---------------------------------------");
        System.out.println("ID Pesan: " + id_pesan);
        System.out.println("Kode Barang: " + kd_barang);
        System.out.println("Kode Customer: " + kd_customer);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga Jual: " + harga_jual);
        System.out.println("Tanggal Pesan: " + tanggal_pesan);
        System.out.println("Status Pesan: " + status_pesan);
        System.out.println("----------------------------------------");
    }
    
}

