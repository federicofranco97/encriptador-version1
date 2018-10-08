/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Fede
 */
public class encriptador extends javax.swing.JFrame {

  
    public encriptador() {
        initComponents();
        definirAbc();
        definirAbc1();
        this.setLocationRelativeTo(null);
        mensajeO="";
        mensajeE="";
        clave=0;
    }

    //VARIABLES
    static String mensajeO="";
    static String mensajeE="";
    static String [] abc=new String [36];//abc normal
    static String [] abc1=new String [36];//abc desor
    static int clave=0;
    //VARIABLES
    
    //DEFINO ABECEDARIOS
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
    //DEFINO ABECEDARIOS
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtO = new javax.swing.JTextArea();
        btnEncriptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtE = new javax.swing.JTextArea();
        fieldClave = new javax.swing.JTextField();
        btnClave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        txtO.setColumns(20);
        txtO.setRows(5);
        jScrollPane1.setViewportView(txtO);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(43, 93, 320, 140);

        btnEncriptar.setText("Encriptar");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncriptar);
        btnEncriptar.setBounds(90, 250, 82, 32);

        txtE.setColumns(20);
        txtE.setRows(5);
        jScrollPane2.setViewportView(txtE);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(43, 293, 320, 130);
        getContentPane().add(fieldClave);
        fieldClave.setBounds(200, 44, 110, 30);

        btnClave.setText("Clave");
        btnClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnClave);
        btnClave.setBounds(110, 40, 61, 32);

        jButton1.setText("Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 250, 114, 32);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enc.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 410, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enc.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 280, 410, 200);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/enc.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 130, 410, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed
        mensajeO=txtO.getText();
        
        
        String [] mensajePartido=mensajeO.split(" ");
        //recorro por cada palabra
        for (int i= 0;i<mensajePartido.length;i++){
            String palabra=mensajePartido[i];
            //recorro la palabra.
            String [] pal=palabra.split("");
            for (int h=0;h<pal.length;h++){
                int pos=0;
                //recorro el abc buscando la letra y traigo la posicion.
                for(int j=0;j<abc.length;j++){
                    if (abc[j].equals(pal[h])){
                        //guardo la posicion de la letra en el abecedario
                        pos=j;
                        int movi=pos;
                       
                        
                        mensajeE=mensajeE+abc1[movi];
                    }//fin if
                }//fin recorrer abc
            }//fin recorrer palabra
            mensajeE=mensajeE+" ";//agrego un espacio despues de concatenar la palabra
            
        }//fin recorrer mensaje
       
        txtE.setText(mensajeE);
    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaveActionPerformed
        int n1 = (int) (Math.random()*35);
        int n2 = (int) (Math.random()*35);
        int n3 = (int) (Math.random()*35);
        int n4 = (int) (Math.random()*35);
        int n5 = (int) (Math.random()*35);
        String key = abc1[n1]+abc1[n2]+abc1[n3]+abc1[n4]+abc1[n5];
        String ht=n1+"-"+n2+"-"+n3+"-"+n4+"-"+n5;
        fieldClave.setText(ht);
        btnClave.setEnabled(false);
        mensajeE=mensajeE+key+" ";
    }//GEN-LAST:event_btnClaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        ventanaPrincipal ventanaPrincipal1 = new ventanaPrincipal();
        ventanaPrincipal1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(encriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encriptador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encriptador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClave;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JTextField fieldClave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtE;
    private javax.swing.JTextArea txtO;
    // End of variables declaration//GEN-END:variables
}
