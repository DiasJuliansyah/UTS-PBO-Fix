/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Laptop {
    String nama, brand, namaProcessor,sistemOperasi,jenisStorage;
    int jumlahCore, ukuranRam, stok;
    public Laptop(String nama,String brand,String namaProcessor,String sistemOperasi,String jenisStorage, int jumlahCore, int ukuranRam, int stok){
        this.nama = nama;
        this.brand = brand;
        this.namaProcessor = namaProcessor;
        this.jumlahCore = jumlahCore;
        this.sistemOperasi = sistemOperasi;
        this.ukuranRam = ukuranRam;
        this.jenisStorage = jenisStorage;
        this.stok = stok;
    }
    public Laptop(String nama,String brand,String namaProcessor,String sistemOperasi,String jenisStorage){
        this.nama = nama;
        this.brand = brand;
        this.namaProcessor = namaProcessor;
        this.sistemOperasi = sistemOperasi;
        this.jenisStorage = jenisStorage;
    }
    public Laptop(int jumlahCore, int ukuranRam, int stok){
        this.jumlahCore = jumlahCore;
        this.ukuranRam = ukuranRam;
        this.stok = stok;
    }
    public void info(){
        System.out.println("Nama \t\t\t:"+nama);
        System.out.println("Brand \t\t\t:"+brand);
        System.out.println("Nama Processor \t:"+namaProcessor);
        System.out.println("Jumlah Core \t:"+jumlahCore);
        System.out.println("Sistem Operasi \t:"+sistemOperasi);
        System.out.println("Ukuran RAM \t\t:"+ukuranRam);
        System.out.println("Jenis Storage \t:"+jenisStorage);
        System.out.println("Stok \t\t\t:"+stok);
    }
    void setNama(String nama){
        nama=nama;
    }
    void setBrand(String brand){
        brand=brand;
    }
    void setNamaProcessor(String namaProcessor){
        namaProcessor=namaProcessor;
    }
    void setJumlahCore(int jumlahCore){
        jumlahCore=jumlahCore;
    }
    void setSistemOperasi(String sistemOperasi){
        sistemOperasi=sistemOperasi;
    }
    void setUkuranRam(int ukuramRam){
        ukuranRam=ukuranRam;
    }
    void setJenisStorage(String jenisStorage){
        jenisStorage=jenisStorage;
    }
    void setStok(int stok){
        stok=stok;
    }
        String getNama(){
        return nama;
    }
        String getBrand(){
        return brand;
    }
        String getNamaProcessor(){
        return namaProcessor;
    }
        int getJumlahCore(){
        return jumlahCore;
    }
        String getSistemOperasi(){
        return sistemOperasi;
    }
        int getUkuranRam(){
        return ukuranRam;
    }
        String getJenisStorage(){
        return jenisStorage;
    }
        int getStok(){
        return stok;
    }
}
