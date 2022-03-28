/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class LaptopApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama :");
        String nama = input.nextLine();
        
        System.out.println("Masukkan Brand :");
        String brand = input.nextLine();
        
        System.out.println("Masukkan jenis Sistem Operasi :");
        String sistemOperasi = input.nextLine();
        
        System.out.println("Masukkan Nama Processor :");
        String namaProcessor = input.nextLine();
        
        System.out.println("Masukkan jenis Storage :");
        String jenisStorage = input.nextLine();
        
        System.out.println("Masukkan Jumlah Core pada Processor :");
        int jumlahCore = input.nextInt();
        
        System.out.println("Masukkan ukuran RAM dalam GB :");
        int ukuranRam = input.nextInt();
        
        System.out.println("Masukkan jumlah Stok :");
        int stok = input.nextInt();
        
                String pernyataan;
        if(jumlahCore<=0){
            pernyataan ="tidak valid";
        }else{
            pernyataan ="valid";
        }
        if(ukuranRam<=0){
            pernyataan ="tidak valid";
        }
        if(stok<=0){
            pernyataan ="tidak valid";
        }else{
            pernyataan ="valid";
        }
        System.out.println("Masukkan Tipe Storage \t:");
        System.out.println("1 = SSD M.2 | 2 = SSD SATA | 3 = HDD");
        int tipe = input.nextInt();
        String posisi;
        if(tipe <=1){
            posisi = "Best";
        }else if(tipe <=2){
            posisi = "Good";
        }else{
            posisi = "Middle";
        }
        System.out.println("Tipe \t\t\t:"+ posisi);
        
        System.out.println("Laptop \t \t \t:");
        System.out.println("Nama \t \t \t:" +nama); 
        System.out.println("Brand \t \t \t:" +brand);
        System.out.println("Nama Processor \t \t:" + namaProcessor);
        System.out.println("Jumlah Core Processor \t:" + jumlahCore);
        System.out.println("Sistem Operasi \t \t:" + sistemOperasi);
        System.out.println("Ukuran RAM dalam GB \t:" + ukuranRam);
        System.out.println("Jenis Storage \t \t:" + jenisStorage );
        System.out.println("Jumlah Stok \t \t:" + stok );

    }
    
}
