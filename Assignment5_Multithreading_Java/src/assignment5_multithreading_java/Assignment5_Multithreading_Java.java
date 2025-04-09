/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5_multithreading_java;

/**
 *
 * @author jamal
 */
public class Assignment5_Multithreading_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //  FilePlayer fp = new FilePlayer();
     //   fp.play("C:\\Users\\jamal\\OneDrive\\DesktopINFO5100LAB\\Assignment5_Multithreading_Java\\src\\assignment5_multithreading_java\\Sounds\\do.wav");
    
       Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    
    t1.start();
    t2.start();
    }
    

}