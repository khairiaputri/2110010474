/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;


public class kota {
    private int id_kota;
    private String kd_kota;
    private String kota;
    private String ongkir;
    private String estimasi;

    // Constructor
    public kota(int id_kota, String kd_kota, String kota, String ongkir, String estimasi) {
        this.id_kota = id_kota;
        this.kd_kota = kd_kota;
        this.kota = kota;
        this.ongkir = ongkir;
        this.estimasi = estimasi;
    }

    // Getter dan Setter
    public int getid_kota() {
        return id_kota;
    }

    public void setid_kota(int id_kota) {
        this.id_kota = id_kota;
    }

    public String getkd_kota() {
        return kd_kota;
    }

    public void setkd_kota(String kd_kota) {
        this.kd_kota = kd_kota;
    }

    public String getkota() {
        return kota;
    }

    public void setkota(String kota) {
        this.kota = kota;
    }
    
    public String getongkir() {
        return ongkir;
    }

    public void setongkir(String ongkir) {
        this.ongkir = ongkir;
    }
    
    public String getestimasi() {
        return estimasi;
    }

    public void setestimasi(String estimasi) {
        this.estimasi = estimasi;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------KOTA-----------------");
        System.out.println("------------------------------------");
        System.out.println("ID Kota: " + id_kota);
        System.out.println("Kode Kota: " + kd_kota);
        System.out.println("Kota: " + kota);
        System.out.println("Ongkir: " + ongkir);
        System.out.println("Estimasi: " + estimasi);
        System.out.println("---------------------------------------");
    }
    
}
