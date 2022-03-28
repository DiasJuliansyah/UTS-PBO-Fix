/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagram;

/**
 *
 * @author ASUS
 */
public class MaiMesssenger extends Sender{
    String connect,disconnect;
    public MaiMesssenger(String connect, String disconnect){
        this.connect = connect;
        this.disconnect = disconnect;
        this.receiver=receiver;
        this.subject=subject;
        this.message=message;
    }
    @Override
    public void info(){
        System.out.println("Terhubung \t:"+connect);
        System.out.println("Tidak Terhubung:"+disconnect);
        System.out.println("Penerima \t:"+receiver);
        System.out.println("Subjek \t:" +subject);
        System.out.println("Pesan \t:"+message);
    }
}
