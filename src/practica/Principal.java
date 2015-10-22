/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ButtonGroup;

/**
 *
 * @author Oswaldo
 */
public class Principal extends javax.swing.JFrame {

    String parse;
    ArrayList<String> datos = new ArrayList<>();
    String claveEntrada = "";
    boolean cifrar = true;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(rboCifrado);
        group.add(rboDescifrado);
        inicializaFiles();
    }
    public void inicializaFiles(){
        try{
            File f = new File("salidatrue.txt");
            if(f.exists())
                f.delete();
            f=new File("salidafalse.txt");
            if(f.exists())
                f.delete();
        }catch(Exception e){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rboCifrado = new javax.swing.JRadioButton();
        rboDescifrado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEntrada = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSalida = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtClaveSalida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cifrado de Feistel");

        rboCifrado.setSelected(true);
        rboCifrado.setText("Cifrado");
        rboCifrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboCifradoActionPerformed(evt);
            }
        });

        rboDescifrado.setText("Descifrado");

        jLabel2.setText("Texto a Cifrar \\n o Descifrar");

        txtAreaEntrada.setColumns(20);
        txtAreaEntrada.setRows(5);
        jScrollPane1.setViewportView(txtAreaEntrada);

        jLabel3.setText("Clave");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        jButton1.setText("Cifrar o Descifrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Texto Cifrado");

        txtAreaSalida.setEditable(false);
        txtAreaSalida.setColumns(20);
        txtAreaSalida.setRows(5);
        jScrollPane2.setViewportView(txtAreaSalida);

        jLabel5.setText("Clave Salida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(rboDescifrado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rboCifrado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(61, 61, 61)
                                .addComponent(txtClave))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(txtClaveSalida)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboDescifrado)
                    .addComponent(rboCifrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClaveSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rboCifradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboCifradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboCifradoActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Cifrar c = new Cifrar();
        datos.clear();
        datos = dividirTexto(txtAreaEntrada.getText());
        System.out.println(datos.size());
        if (rboDescifrado.isSelected()) {
            cifrar = false;
        } else {
            cifrar = true;
        }
        //Revisar clave
        if (txtClave.getText().length() == 8) {
            claveEntrada = txtClave.getText();
        } else if (txtClave.getText().length() < 8) {
            claveEntrada = c.agregarEspacios(txtClave.getText(), 8);
        } else {
            claveEntrada = txtClave.getText().substring(0, 8);
        }
        System.out.println("Clave Entrada: " + claveEntrada);
        ArrayList<Integer> cifrado = new ArrayList<>();
        for (int i = 0; i < datos.size(); i++) {
            String dato = datos.get(i);
            //Paso 0. Agregar espacios si es necesario al texto
            if (dato.length() < 16) {
                //datos.remove(i);
                datos.set(i, c.agregarEspacios(dato, 16));
            }

            //Paso 1. Texto a Ascii
            ArrayList<Integer> asciisTexto = c.convertirAscii(datos.get(i));
            ArrayList<Integer> asciisClave = c.convertirAscii(claveEntrada);
            //System.out.println("SIZES: "+asciisClave.size()+" "+ asciisTexto.size());
            //ArrayList<Integer> cifrado=new ArrayList<>(datos.size()*16);
            //Paso 2. Ascii operaciones
            int pasos = 8;
            while (pasos > 0) {
                for (int j = 8; j < asciisTexto.size(); j++) {
                    Integer td = asciisTexto.get(j);
                    Integer cl = asciisClave.get(j - 8);
                    Integer ti = asciisTexto.get(j - 8);
                    //System.out.println("Asciis " + td + " " + cl);
                    //Paso 3. Derecha con clave
                    Integer result;
                    if (cifrar) {
                        result = td ^ cl;
                        if(result>=256)
                            result=result-256;
                    } else {
                        result = ti ^ cl;
                        if(result>=256)
                            result=result-256;
                    }

                    //System.out.println("Resultado: " + result);
                    //System.out.println("Asciis " + result + " " + ti);
                    //Paso 4. Resultado con Izquierda
                    if (cifrar) {
                        result = result ^ ti;
                        if(result>=256)
                            result=result-256;
                    } else {
                        result = result ^ td;
                        if(result>=256)
                            result=result-256;
                    }

                    //System.out.println("Resultado: " + result);
                    if (cifrar) {
                        cifrado.add((j - 8) /*+ ((j - 8) * i)*/, result);
                    } else {
                        for (int k = 8; k < 16; k++) {
                            Integer td2 = asciisTexto.get(k);
                            if (cifrado.size() >= 8) {
                                break;
                            } else {
                                cifrado.add((k - 8), td2);
                            }
                        }
                        if (cifrado.size() >= 16) {
                            cifrado.set(j, result);
                        } else {
                            cifrado.add(j, result);
                        }
                    }

                }
                //Paso 5. Resultado a izquierda y el otro a derecha
                for (int j = 8; j < asciisTexto.size(); j++) {
                    Integer ti;
                    if (cifrar) {
                        ti = asciisTexto.get(j - 8);
                        cifrado.add(j /*+ (j * i)*/, ti);
                    }
                }

                
                escribirArchivo(cifrar, "=======================================");
                System.out.println("=======================================");
                System.out.println("Paso " + (9 - pasos) + ":  ");
                escribirArchivo(cifrar, "Paso " + (9 - pasos) + ":  ");
                System.out.println("=======================================");
                escribirArchivo(cifrar, "=======================================");
                escribirArchivo(cifrar, "Texto Entrada: ");
                System.out.println("Texto Entrada: ");
                imprimirParte(asciisTexto);
                //System.out.println(asciisTexto.toString());
                escribirArchivo(cifrar, asciisTexto.toString());
                System.out.println("Clave paso: ");
                escribirArchivo(cifrar, "Clave paso: ");
                imprimirParte(asciisClave);
                //System.out.println(asciisClave.toString());
                escribirArchivo(cifrar, asciisClave.toString());
                
                asciisTexto.clear();
                asciisTexto = new ArrayList<Integer>(cifrado);
                
                escribirArchivo(cifrar, "Texto Cifrado:");
                System.out.println("Texto Cifrado:");
                imprimirParte(cifrado);
                //System.out.println(cifrado.toString());
                escribirArchivo(cifrar, cifrado.toString());
                
                
                
                pasos--;
                if (pasos == 0) {
                    txtAreaSalida.setText("");
                    txtClaveSalida.setText("");
                    for (Integer cifrado1 : cifrado) {
                        txtAreaSalida.setText(txtAreaSalida.getText()+ Character.toChars(cifrado1)[0]);
                    }
                    for (Integer asciisClave1 : asciisClave) {
                        txtClaveSalida.setText(txtClaveSalida.getText()+Character.toChars(asciisClave1)[0]);
                    }
                    if(!cifrar){
                        txtAreaSalida.setText(txtAreaSalida.getText().trim());
                    }
                    break;
                }else{
                    cifrado.clear();
                    //Paso 6. Mover circularmente la clave
                    asciisClave = c.rotacionCircular(asciisClave, cifrar);
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void imprimirParte(ArrayList<Integer> entrada) {
        for (Integer entrada1 : entrada) {
            System.out.print(Character.toChars(entrada1)[0]);
        }
        System.out.println("");

    }

    public static ArrayList<String> dividirTexto(String text) {
        // Give the list the right capacity to start with. You could use an array
        // instead if you wanted.
        ArrayList<String> ret = new ArrayList<>((text.length() + 16 - 1) / 16);
        for (int start = 0; start < text.length(); start += 16) {
            ret.add(text.substring(start, Math.min(text.length(), start + 16)));
        }
        return ret;
    }

    public void escribirArchivo(boolean cifra, String texto){
        try {
            File f = new File("salida" + cifra + ".txt");
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(texto);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rboCifrado;
    private javax.swing.JRadioButton rboDescifrado;
    private javax.swing.JTextArea txtAreaEntrada;
    private javax.swing.JTextArea txtAreaSalida;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClaveSalida;
    // End of variables declaration//GEN-END:variables
}
