/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Rodrigo
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cifrar c = new Cifrar("uno","dos");
       char[] clav=new char[64] ;
       for(int i=0;i<64;i++){
           int letra=(int)(Math.random()*2);
           clav[i]=Integer.toBinaryString(letra).toCharArray()[0];
         //  System.out.print(Integer.toString(letra)+"--");
       }
       clav=c.mueve_clave(clav);
       clav=c.mueve_clave(clav);
    }
    
}
