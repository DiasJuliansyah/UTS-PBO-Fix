/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Dell extends Laptop{
    String negaraPembuat;
    
    public Dell(String negaraPembuat){
        this.negaraPembuat=negaraPembuat;
    }
    @Override
    public void info(){
        System.out.println("Harga \t\t\t:"+negaraPembuat);
        System.out.println("Nama \t\t\t:"+nama);
        System.out.println("Brand \t\t\t:"+brand);
        System.out.println("Nama Processor \t:"+namaProcessor);
        System.out.println("Jumlah Core \t:"+jumlahCore);
        System.out.println("Sistem Operasi \t:"+sistemOperasi);
        System.out.println("Ukuran RAM \t\t:"+ukuranRam);
        System.out.println("Jenis Storage \t:"+jenisStorage);
        System.out.println("Stok \t\t\t:"+stok);
    }
    void setHarga(int harga){
        harga=harga;
    }
    int getHarga(){
        return harga;
    }
}
