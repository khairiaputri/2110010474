/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;

public class supplier {
    private int id_supplier;
    private String kd_supplier;
    private String nama_supplier;
    private String telp;
    private String alamat;

    // Constructor
    public supplier(int id_supplier, String kd_supplier, String nama_supplier, String telp, String alamat) {
        this.id_supplier = id_supplier;
        this.kd_supplier = kd_supplier;
        this.nama_supplier = nama_supplier;
        this.telp = telp;
        this.alamat = alamat;

    }

    // Getter dan Setter
    public int getid_supplier() {
        return id_supplier;
    }

    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getkd_supplier() {
        return kd_supplier;
    }

    public void setkd_supplier(String kd_supplier) {
        this.kd_supplier = kd_supplier;
    }

    public String getnama_supplier() {
        return nama_supplier;
    }

    public void setnama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }
    
    public String gettelp() {
        return telp;
    }

    public void settelp(String telp) {
        this.telp = telp;
    }
    
    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------SUPPLIER-----------------");
        System.out.println("----------------------------------------");
        System.out.println("ID Supplier: " + id_supplier);
        System.out.println("Kode Supplier: " + kd_supplier);
        System.out.println("Nama Supplier: " + nama_supplier);
        System.out.println("Telepon: " + telp);
        System.out.println("Alamat: " + alamat);
        System.out.println("-----------------------------------------");
    }
    
}

