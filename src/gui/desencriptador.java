/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.encriptador.abc;
import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class desencriptador extends javax.swing.JFrame {

   
    public desencriptador() {
        initComponents();
        definirAbc();
        definirAbc1();
        this.setLocationRelativeTo(null);
        mensajeEncriptado="";
        mensajeDesencriptado="";
        key="";
        clave=0;
        klave="";
    }

   
    //VARIABLES
    static String key="";
    static String mensajeEncriptado="";
    static String mensajeDesencriptado="";
    static String [] abc=new String [36];//abc normal
    static String [] abc1=new String [36];//abc desor
    static int clave=0;
    static String klave="";
    //VARIABLES
    
    //ABCs
    public void definirAbc(){
        abc[0]="a";
        abc[1]="b";
        abc[2]="c";
        abc[3]="d";
        abc[4]="e";
        abc[5]="f";
        abc[6]="g";
        abc[7]="h";
        abc[8]="i";
        abc[9]="j";
        abc[10]="k";
        abc[11]="l";
        abc[12]="m";
        abc[13]="n";
        abc[14]="o";
        abc[15]="p";
        abc[16]="q";
        abc[17]="r";
        abc[18]="s";
        abc[19]="t";
        abc[20]="u";
        abc[21]="v";
        abc[22]="w";
        abc[23]="x";
        abc[24]="y";
        abc[25]="z";
        abc[26]="0";
        abc[27]="1";
        abc[28]="2";
        abc[29]="3";
        abc[30]="4";
        abc[31]="5";
        abc[32]="6";
        abc[33]="7";
        abc[34]="8";
        abc[35]="9";
    }
    
    public void definirAbc1(){
        abc1[5]="a";
        abc1[4]="b";
        abc1[3]="$";
        abc1[2]="d";
        abc1[1]="e";
        abc1[0]="f";
        abc1[6]="g";
        abc1[10]="h";
        abc1[8]="i";
        abc1[17]="j";
        abc1[7]="k";
        abc1[11]="l";
        abc1[12]="!";
        abc1[13]="#";
        abc1[14]="o";
        abc1[15]="p";
        abc1[16]="&";
        abc1[9]="r";
        abc1[18]="s";
        abc1[21]="t";
        abc1[22]="%";
        abc1[19]="v";
        abc1[20]="w";
        abc1[23]="/";
        abc1[24]="y";
        abc1[25]="=";
        abc1[26]="0";
        abc1[27]="+";
        abc1[28]="2";
        abc1[29]="-";
        abc1[30]="4";
        abc1[31]=":";
        abc1[32]="6";
        abc1[33]=";";
        abc1[34]="8";
        abc1[35]="9";
    }
    //ABCs
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtEncriptado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesencriptado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        txtEncriptado.setColumns(20);
        txtEncriptado.setRows(5);
        txtEncriptado.setAutoscrolls(false);
        jScrollPane1.setViewportView(txtEncriptado);
        txtEncriptado.setLineWrap(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(42, 59, 330, 150);

        txtDesencriptado.setColumns(20);
        txtDesencriptado.setRows(5);
        jScrollPane2.setViewportView(txtDesencriptado);
        txtDesencriptado.setLineWrap(true);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 273, 330, 130);

        jButton1.setText("Desentciptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 230, 103, 32);
        getContentPane().add(txtClave);
        txtClave.setBounds(79, 25, 82, 24);

        jButton2.setText("Guardar clave");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(193, 21, 109, 32);

        jButton3.setText("Menu Principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(240, 230, 114, 32);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enc.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 290, 400, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enc.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 170);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enc.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 130, 400, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        key=txtClave.getText();
        String [] cla= key.split("-");
        int num1=Integer.parseInt(cla[0]);
        int num2=Integer.parseInt(cla[1]);
        int num3=Integer.parseInt(cla[2]);
        int num4=Integer.parseInt(cla[3]);
        int num5=Integer.parseInt(cla[4]);
        klave= abc1[num1]+abc1[num2]+abc1[num3]+abc1[num4]+abc1[num5];
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mensajeEncriptado=txtEncriptado.getText();
        String [] mensaje= mensajeEncriptado.split(" "); //separo el mensaje por espacios 
        //por cada palabra reviso
        //chekeo la clave
        if(mensaje[0].equals(klave)){
        
            for (int i = 1 ; i<mensaje.length;i++){
                String palabra = mensaje[i];
                String [] pal = palabra.split("");
                for (int j = 0 ; j<pal.length; j++){
                    //por cada letra de la palabra
                    int pos=0;
                    for(int k=0;k<abc1.length;k++){
                        if(abc1[k].equals(pal[j])){
                            pos=k;
                            
                            mensajeDesencriptado=mensajeDesencriptado+abc[pos];
                        }//fin if
                    }//fin recorrer el abc1
                }//fin recorrer palabra
                mensajeDesencriptado=mensajeDesencriptado+" ";
            }//fin recorrer mensaje

            txtDesencriptado.setText(mensajeDesencriptado);
        }else{
            JOptionPane.showMessageDialog(null, "La clave ingresada no es correcta");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ventanaPrincipal ventanaPrincipal1 = new ventanaPrincipal();
        ventanaPrincipal1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(desencriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desencriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desencriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desencriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desencriptador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextArea txtDesencriptado;
    private javax.swing.JTextArea txtEncriptado;
    // End of variables declaration//GEN-END:variables
}
