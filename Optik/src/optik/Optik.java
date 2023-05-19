/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optik;

import Data.*;
import java.util.Date;

/**
 *
 * @author User
 */
public class Optik {

   
    public static void main(String[] args) {

        // Membuat objek dari class barang
        barang Barang = new barang (001, "B01", "GucciLatso", "Aksesoris", "GucciOfficial", new Date(123,9,19), "30", "unit", 350000, 400000);

        // Membuat objek dari class Customer
        customer Customer = new customer(002, "CS02", "Ria", "Banjarmasin", "087823788890", "ria1@gmail.com", "VIP", "Perempuan");

        // Membuat objek dari class Kategori
        kategori Kategori = new kategori(003, "KT03", "Aksesoris");

        // Membuat objek dari class Kirim
        kirim Kirim = new kirim(011, "KM04", "Sampit", "Terkirim", "13 jam", "-",new Date(123,9,19), "10000");
        
        // Membuat objek dari class Kota
        kota Kota = new kota(013, "TA01", "Sampit", "25000","13 jam");

        // Membuat objek dari class Pesanan
        pesanan Pesanan = new pesanan(045, "J012", "CS02", "2", "500000", new Date (123,9,19), "Diterima");

        // Membuat objek dari class Supplier
        supplier Supplier = new supplier(005, "SP345", "GucciOfficial", "081234567890", "Jalan Veteran");
        
        // Membuat objek dari class Transaksi
        transaksi Transaksi = new transaksi(043, "KM04", "CS02", new Date(123,9,19), "20", "400000", "23000", "500000", "-", "KT03", "Lunas", "PS02");

        // Menampilkan informasi objek
        Barang.tampilkanInfo();
        Customer.tampilkanInfo();
        Kategori.tampilkanInfo();
        Kirim.tampilkanInfo();
        Kota.tampilkanInfo();
        Pesanan.tampilkanInfo();
        Supplier.tampilkanInfo();
        Transaksi.tampilkanInfo();
    }
}

    
    
