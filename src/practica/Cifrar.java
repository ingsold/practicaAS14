/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;
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
            System.out.println(texto.charAt(x) + " = " + texto.codePointAt(x));
            System.out.println(texto.codePointAt(x) % 128);
            System.out.println(y.length);
        }
    }

    public ArrayList<Integer> convertirAscii(String v){
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < v.length(); i++) {
            salida.add(v.codePointAt(i));
            //System.out.println("Codigo "+i+" es "+v.codePointAt(i));
        }
        return salida;
    }
    
    public String agregarCeros(int i) {
        String original = Integer.toBinaryString(i);
        char c = '0';
        int number = 8 - Integer.toBinaryString(i).length();
        char[] repeat = new char[number];
        Arrays.fill(repeat, c);
        original = new String(repeat) + original;
        //System.out.println("ORGINAL " + original);
        return original;
    }

    public String agregarEspacios(String entrada, int cantidad) {
        char c = '_';
        int number = cantidad - entrada.length();
        char[] repeat = new char[number];
        Arrays.fill(repeat, c);
        entrada += new String(repeat);
        return entrada;
    }
    
    public ArrayList<Integer> rotacionCircular(ArrayList<Integer> entrada){
        ArrayList<Integer> salida = new ArrayList<>();
        char[] mover = new char[64];
        for (int k = 0; k < entrada.size(); k++) {
            String a =agregarCeros(entrada.get(k));
            char[] carac =a.toCharArray();
            System.arraycopy(carac, 0, mover, k*8, 8);
            //System.out.println("CLAVE COPIADA "+Arrays.toString(mover));
        }
        
        //System.out.println("CLAVE ANTES"+Arrays.toString(mover));
        mover=mueveClave(mover);
        int parcial=0;
        for (int i = 0; i < 64; i++) {
            parcial+=(Integer.valueOf(String.valueOf(mover[i])))*2;
            //System.out.println("conversion parcial: "+parcial+" "+mover[i]);
            if (i%7==0){
                salida.add(parcial);
                System.out.println("conversion parcial: "+parcial);
                parcial=(Integer.valueOf(String.valueOf(mover[i])));
            }
            
        }
        return null;
    }
    public char[] mueveClave(char[] clave) {
        char[] clavenueva = new char[64];
        //System.arraycopy(clavenueva, 63, clave, 1, 63);
        //System.arraycopy(this, srcPos, this, destPos, length);
        
        for (int i = 0; i < 63; i++) {
            clavenueva[i] = clave[i+1];
        }
        clavenueva[63]=clave[0];
        System.out.println("clave anterior:" + Arrays.toString(clave).replace(" ", ""));
        System.out.println("clave nueva   :" + Arrays.toString(clavenueva).replace(" ", ""));
        return clavenueva;
    }

    public void toascii() {
        System.out.println("PASA A ASCII ");
    }

    public static void main(String args[]) {
        Cifrar c = new Cifrar();
        c.agregarCeros(255);
    }
}
