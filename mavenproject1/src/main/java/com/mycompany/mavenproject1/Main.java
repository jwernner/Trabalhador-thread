/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Jorge
 */
public class Main {
  public static void main(String args[]) {
      Trabalhador severino = new Trabalhador("sapato", 100);
      Trabalhador raimundo = new Trabalhador("bota", 500);
    
      severino.start();
      raimundo.start();
      
//     Runnable biu = new Operario ("chinelo", 100);
//     Runnable rai = new Operario ("sandalia", 500);
//     Thread t1 = new Thread(biu);
//    Thread t2 = new Thread(rai);
//     t1.start();
//     t2.start();

   }
}
