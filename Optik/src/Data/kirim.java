/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;

public class kirim {
    private int id_kirim;
    private String kd_barang;
    private String tujuan;
    private String status_kirim;
    private String estimasi_waktu;
    private String bukti_kirim;
    private Date tanggal_kirim;
    private String total_fee;

    // Constructor
    public kirim(int id_kirim, String kd_barang, String tujuan, String status_kirim, String estimasi_waktu, String bukti_kirim , Date tanggal_kirim, String total_fee) {
        this.id_kirim = id_kirim;
        this.kd_barang = kd_barang;
        this.tujuan = tujuan;
        this.status_kirim = status_kirim;
        this.estimasi_waktu = estimasi_waktu;
        this.bukti_kirim = bukti_kirim;
        this.tanggal_kirim = tanggal_kirim;
        this.total_fee = total_fee;
    }

    // Getter dan Setter
    public int getid_kirim() {
        return id_kirim;
    }

    public void setid_kirim(int id_kirim) {
        this.id_kirim = id_kirim;
    }

    public String getkd_barang() {
        return kd_barang;
    }

    public void setkd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String gettujuan() {
        return tujuan;
    }

    public void settujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public String getstatus_kirim() {
        return status_kirim;
    }

    public void setstatus_kirim (String status_kirim) {
        this.status_kirim = status_kirim;
    }
    
    public String getestimasi_waktu() {
        return estimasi_waktu;
    }

    public void setestimasi_waktu (String estimasi_waktu) {
        this.estimasi_waktu = estimasi_waktu;
    }
    
    public String getbukti_kirim() {
        return bukti_kirim;
    }

    public void setbukti_kirim (String bukti_kirim) {
        this.bukti_kirim = bukti_kirim;
    }
    
    public Date gettanggal_kirim() {
        return tanggal_kirim;
    }

    public void settanggal_kirim (Date tanggal_kirim) {
        this.tanggal_kirim = tanggal_kirim;
    }
    
    public String gettotal_fee() {
        return total_fee;
    }

    public void settotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------KIRIM-----------------");
        System.out.println("-------------------------------------");
        System.out.println("ID Kirim: " + id_kirim);
        System.out.println("Kode Barang: " + kd_barang);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Status Kirim: " + status_kirim);
        System.out.println("Estimasi Waktu: " + estimasi_waktu);
        System.out.println("Bukti Kirim: " + bukti_kirim);
        System.out.println("Tanggal Kirim: " + tanggal_kirim);
        System.out.println("Total fee: " + total_fee);
        System.out.println("------------------------------------");
    }
    
}

