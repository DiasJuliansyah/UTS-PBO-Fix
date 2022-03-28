/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagram;

/**
 *
 * @author ASUS
 */
public class Sender {
    String receiver,subject,message;
    public Sender(String receiver,String subject,String message){
        this.receiver=receiver;
        this.subject=subject;
        this.message=message;
    }
    public void info(){
        System.out.println("Penerima \t:"+receiver);
        System.out.println("Subjek \t:" +subject);
        System.out.println("Pesan \t:"+message);
    }
    void setReceiver(String receiver){
        receiver=receiver;
    }
    void setSubject(String subject){
        subject=subject;
    }
    void setMessage(String message){
    message=message;
    }
    String getReceiver(){
        return receiver;
    }
    String getSubject(){
        return subject;
    }
    String getMessage(){
        return message;
    }        
}
