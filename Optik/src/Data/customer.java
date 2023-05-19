/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;


/**
 *
 * @author USER
 */
public class customer {
    
    //field global
    private int id_customer; 
    private String kd_customer; 
    private String customer;
    private String kd_kota; 
    private String telp; 
    private String email; 
    private String gabung; 
    private String jenkel; 

    // Constructor
    public customer(int id_customer, String kd_customer, String customer, String kd_kota,String telp,String email, String gabung, String jenkel) {
        this.id_customer = id_customer;
        this.kd_customer = kd_customer;
        this.customer = customer;
        this.kd_kota = kd_kota;
        this.telp = telp;
        this.email = email;
        this.gabung = gabung;
        this.jenkel = jenkel;
    }

    // Getter dan Setter
    public int getid_customer() {
        return id_customer;
    }

    public void setid_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getkd_customer() {
        return kd_customer;
    }

    public void setkd_customer(String kd_customer) {
        this.kd_customer = kd_customer;
    }

    public String getcustomer() {
        return customer;
    }

    public void setcustomer(String customer) {
        this.customer = customer;
    }

    public String getkd_kota() {
        return kd_kota;
    }

    public void setkd_kota(String kd_kota) {
        this.kd_kota = kd_kota;
    }
    
    public String gettelp() {
        return telp;
    }

    public void settelp(String telp) {
        this.telp = telp;
    }
    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public String getgabung() {
        return gabung;
    }

    public void setgabung(String gabung) {
        this.gabung = gabung;
    }
    
    public String getjenkel() {
        return jenkel;
    }

    public void setjenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("---------------CUSTOMER-----------------");
        System.out.println("----------------------------------------");
        System.out.println("ID Customer: " + id_customer);
        System.out.println("Kode Customer: " + kd_customer);
        System.out.println("Customer: " + customer);
        System.out.println("Kode Kota: " + kd_kota);
        System.out.println("Telepon: " + telp);
        System.out.println("Email: " + email);
        System.out.println("Gabung: " + gabung);
        System.out.println("Jenis Kelamin: " + jenkel);
        System.out.println("----------------------------------------");
    }
}


