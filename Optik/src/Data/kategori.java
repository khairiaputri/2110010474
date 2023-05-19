/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;


public class kategori {
    private int id_kategori;
    private String kd_kategori;
    private String kategori;

    // Constructor
    public kategori(int id_kategori, String kd_kategori, String kategori) {
        this.id_kategori = id_kategori;
        this.kd_kategori = kd_kategori;
        this.kategori = kategori;
  
    }

    // Getter dan Setter
    public int getid_kategori() {
        return id_kategori;
    }

    public void setid_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getkd_kategori() {
        return kd_kategori;
    }

    public void setkd_kategori(String kd_kategori) {
        this.kd_kategori = kd_kategori;
    }

    public String getkategori() {
        return kategori;
    }

    public void setkategori(String kategori) {
        this.kategori = kategori;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------KATEGORI-----------------");
        System.out.println("----------------------------------------");
        System.out.println("ID Kategori: " + id_kategori);
        System.out.println("Kode Kategori: " + kd_kategori);
        System.out.println("Kategori: " + kategori);
        System.out.println("-------------------------------------");
    }
    
}
