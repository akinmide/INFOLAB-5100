/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5_multithreading_java;

/**
 *Thread 2 will play re, fa, la, do-octave.
 * @author jamal
 */
public class Thread2 extends Thread{
       
    String []tones = {"re.wav","fa.wav","la.wav","do-octave.wav"};
     FilePlayer fp = new FilePlayer();  
    
    @Override
    public void run(){
        for(String tone: tones){
            try{
                Thread.sleep(250);
            fp.play("\\Users\\jamal\\OneDrive\\DesktopINFO5100LAB\\Assignment5_Multithreading_Java\\src\\assignment5_multithreading_java\\Sounds\\"+tone);
           System.out.println("Thread2 played "+tone);
            Thread.sleep(500);
            }catch(Exception e){
          e.printStackTrace();
            }         
}
        
    }
}