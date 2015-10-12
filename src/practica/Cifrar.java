/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Arrays;

/**
 *
 * @author Oswaldo
 */
public class Cifrar {

    public Cifrar() {

    }

    public Cifrar(String texto, String clave) {
        for (int x = 0; x < texto.length(); x++) {
            int i = texto.codePointAt(x);
            byte[] y = String.valueOf(texto.charAt(x)).getBytes();
            System.out.println(texto.charAt(x) + " = " + texto.codePointAt(x));;
            System.out.println(texto.codePointAt(x) % 128);
            System.out.println(y.length);

        }
    }

    public void agregarCeros(int i) {
       // if (Integer.toBinaryString(i).length() < 8) {
            String original = Integer.toBinaryString(i);
            char c = '0';
            int number = 8 - Integer.toBinaryString(i).length();
            char[] repeat = new char[number];
            Arrays.fill(repeat, c);
            original = new String(repeat) + original;
            System.out.println("ORGINAL " + original);
        /*} else {
            String original = Integer.toBinaryString(i);
            System.out.println("ORGINAL " + original);
        }*/
    }

    public char[] mueve_clave(char[] clave){
        char[] clavenueva=new char[64];
        
        for (int i=1;i<64;i++){
            clavenueva[i]=clave[i+1];
        }
        clavenueva[0]=clave[64];
        
        return clavenueva;
    }
    public void toascii(){
        System.out.println("PASA A ASCII ");
    }
    public static void main(String args[]) {
        Cifrar c = new Cifrar();
        c.agregarCeros(255);
    }
}
