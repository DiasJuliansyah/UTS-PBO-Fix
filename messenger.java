/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagram;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class messenger{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sender sn = new Sender("Dias","pesan","halo");
        System.out.println(sn);
        sn.message="Halo";
        sn.subject="Pesan";
        sn.receiver="Dias Juliansyah";
        System.out.println("Pesan \t\t:"+sn.message);
        System.out.println("Subjek \t\t:"+sn.subject);
        System.out.println("Penerima \t\t:"+sn.receiver);
        
    }
}
