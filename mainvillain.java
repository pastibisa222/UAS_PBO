/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Windows 10 Pro
 */
public class mainvillain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    villain musuh=new villain();
    thanos ungu=new thanos();
    venom hitam=new venom();
    ultron perak=new ultron();
    
    System.out.println("Thanos merupakan karakter = "+ungu.name);
    musuh.name();
    
    System.out.println("Venom memiliki hitpoint = "+hitam.hitpoint);
    musuh.hitpoint();
    
    System.out.println("Ultron memiliki attack = "+perak.attack);
    musuh.attack();
    
    ungu.walk();
    hitam.jump();
    perak.fly();
    }
    
}
