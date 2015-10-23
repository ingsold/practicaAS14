/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Oswaldo
 */
public class Cifrar {
    
    private Principal principal;

    public Cifrar() {

    }
    
    public Cifrar(Principal principal){
        this.principal = principal;
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

    public ArrayList<Integer> convertirAscii(String v) {
        ArrayList<Integer> salida = new ArrayList<>();
        for (int i = 0; i < v.length(); i++) {
            salida.add(v.codePointAt(i));
            //System.out.println("Codigo "+i+" es "+v.codePointAt(i));
        }
        return salida;
    }

    public String agregarCeros(int i) {
        String original = Integer.toBinaryString(i);
        if (original.length() < 8) {
            char c = '0';
            int number = 8 - Integer.toBinaryString(i).length();
            char[] repeat = new char[number];
            Arrays.fill(repeat, c);
            original = new String(repeat) + original;
            //System.out.println("ORGINAL " + original);
        }
        return original;
    }

    public String agregarEspacios(String entrada, int cantidad) {
        char c = ' ';
        int number = cantidad - entrada.length();
        char[] repeat = new char[number];
        Arrays.fill(repeat, c);
        entrada += new String(repeat);
        return entrada;
    }

    public ArrayList<Integer> rotacionCircular(ArrayList<Integer> entrada, boolean cifra) {
        ArrayList<Integer> salida = new ArrayList<>();
        char[] mover = new char[64];
        for (int k = 0; k < entrada.size(); k++) {
            String a = agregarCeros(entrada.get(k));
            char[] carac = a.toCharArray();
            System.arraycopy(carac, 0, mover, k * 8, 8);
            //System.out.println("CLAVE COPIADA "+Arrays.toString(mover));
        }

        //System.out.println("CLAVE ANTES  "+Arrays.toString(mover));
        mover = mueveClave(mover, cifra);
        //System.out.println("CLAVE DESPUES"+Arrays.toString(mover));
        String convierte = "";
        for (int i = 0; i < 64; i++) {
            if (convierte.length() > 7) {
                salida.add(Integer.parseInt(convierte, 2));
                //System.out.println("salida: " + convierte);
                convierte = String.valueOf(mover[i]);
            } else if (i == 63) {
                convierte = convierte + String.valueOf(mover[i]);
                salida.add(Integer.parseInt(convierte, 2));
                //System.out.println("salida: " + convierte);
                //System.out.println("salida: " + convierte);
                //convierte=String.valueOf(mover[i]);
            } else {
                convierte = convierte + String.valueOf(mover[i]);
            }
        }
        //System.out.println("salida size: " + salida.size());
        return salida;
    }

    public char[] mueveClave(char[] clave, boolean cifra) {
        char[] clavenueva = new char[64];
        if (cifra) {
            for (int i = 0; i < 63; i++) {
                clavenueva[i] = clave[i + 1];
            }
            clavenueva[63] = clave[0];
            //System.out.println("clave anterior:" + Arrays.toString(clave).replace(" ", ""));
            //System.out.println("clave nueva   :" + Arrays.toString(clavenueva).replace(" ", ""));
            return clavenueva;
        } else {
            for (int i = 1; i <= 63; i++) {
                clavenueva[i] = clave[i - 1];
            }
            clavenueva[0] = clave[63];
            //System.out.println("clave anterior:" + Arrays.toString(clave).replace(" ", ""));
            //System.out.println("clave nueva   :" + Arrays.toString(clavenueva).replace(" ", ""));
            return clavenueva;
        }
    }

    public void toascii() {
        System.out.println("PASA A ASCII ");
    }

    public static String ReadFromFile(String FileName, String Encoding)throws IOException {
        StringBuilder text = new StringBuilder();
        String NL = System.getProperty("line.separator");
        Scanner scanner = new Scanner(new FileInputStream(FileName), Encoding);
        try {
          while (scanner.hasNextLine()){
            text.append(scanner.nextLine() + NL);
          }
        }
        finally{
          scanner.close();
        }
        return text.toString();
    }
    
    /*public static void main(String args[]) {
        Cifrar c = new Cifrar();
        c.agregarCeros(255);
    }*/
    
    public static String ReadFromFile(String FileName, String Encoding)throws IOException {
       StringBuilder text = new StringBuilder();
       String NL = System.getProperty("line.separator");
       Scanner scanner = new Scanner(new FileInputStream(FileName), Encoding);
       try {
         while (scanner.hasNextLine()){
           text.append(scanner.nextLine() + NL);
         }
       }
       finally{
         scanner.close();
       }
       return text.toString();
   }
}
