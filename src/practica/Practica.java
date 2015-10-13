/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cifrar c = new Cifrar();
       /*char[] clav=new char[64] ;
       for(int i=0;i<64;i++){
           int letra=(int)(Math.random()*2);
           clav[i]=Integer.toBinaryString(letra).toCharArray()[0];
         //  System.out.print(Integer.toString(letra)+"--");
       }*/
       //clav=c.mueveClave(clav);
       //clav=c.mueveClave(clav);
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       arr.add(6);
       arr.add(7);
       arr.add(8);
       c.rotacionCircular((arr));
    }
    
}
