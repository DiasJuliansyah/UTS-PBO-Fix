/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagram;

/**
 *
 * @author ASUS
 */
public class StdMessenger extends Sender{
    String pernyataan;
    public StdMessenger(String pernyataan){
        this.pernyataan=pernyataan;
        this.receiver=receiver;
        this.subject=subject;
        this.message=message;
    }
    @Override
    public void info(){
        System.out.println("Tidak Terhubung :"+pernyataan);
        System.out.println("Penerima \t:"+receiver);
        System.out.println("Subjek \t:" +subject);
        System.out.println("Pesan \t:"+message);
    }
}
