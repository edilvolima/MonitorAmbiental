/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import br.ufrn.interfaces.AtualizacoesBombeiros;
import java.awt.Color;

/**
 *
 * @author Residentes
 */
public class Bombeiros extends javax.swing.JFrame implements AtualizacoesBombeiros {

    /**
     * Creates new form Bombeiros
     */
    private static final Bombeiros bombeiros = new Bombeiros();
    
    public static Bombeiros getInstance(){
        return bombeiros;
    }
    
    private  Bombeiros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelArea2 = new javax.swing.JPanel();
        jLarea2 = new javax.swing.JLabel();
        jPanelArea1 = new javax.swing.JPanel();
        jLarea1 = new javax.swing.JLabel();
        jPanelArea3 = new javax.swing.JPanel();
        jLarea3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOMBEIROS");

        jPanelArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 2"));

        jLarea2.setText("jLabel2");

        javax.swing.GroupLayout jPanelArea2Layout = new javax.swing.GroupLayout(jPanelArea2);
        jPanelArea2.setLayout(jPanelArea2Layout);
        jPanelArea2Layout.setHorizontalGroup(
            jPanelArea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLarea2)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelArea2Layout.setVerticalGroup(
            jPanelArea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLarea2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        jLarea1.setText("jLabel1");

        javax.swing.GroupLayout jPanelArea1Layout = new javax.swing.GroupLayout(jPanelArea1);
        jPanelArea1.setLayout(jPanelArea1Layout);
        jPanelArea1Layout.setHorizontalGroup(
            jPanelArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLarea1)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelArea1Layout.setVerticalGroup(
            jPanelArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLarea1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelArea3.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 3"));

        jLarea3.setText("jLabel3");

        javax.swing.GroupLayout jPanelArea3Layout = new javax.swing.GroupLayout(jPanelArea3);
        jPanelArea3.setLayout(jPanelArea3Layout);
        jPanelArea3Layout.setHorizontalGroup(
            jPanelArea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLarea3)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelArea3Layout.setVerticalGroup(
            jPanelArea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArea3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLarea3)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelArea1, jPanelArea2, jPanelArea3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelArea3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Bombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bombeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bombeiros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLarea1;
    private javax.swing.JLabel jLarea2;
    private javax.swing.JLabel jLarea3;
    private javax.swing.JPanel jPanelArea1;
    private javax.swing.JPanel jPanelArea2;
    private javax.swing.JPanel jPanelArea3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void atualizar(int area, boolean incendio) {

        if (area == 1) {
            if (incendio) {
                jLarea1.setText("incendio");
                jPanelArea1.setBackground(new Color(255, 0, 51));
            } else {
                jLarea1.setText("sem incendio");
                jPanelArea1.setBackground(new Color(240, 240, 240));
            }
        }
        
        else if(area == 2){
            if (incendio) {
                jLarea2.setText("incendio");
                jPanelArea2.setBackground(new Color(255, 0, 51));
            } else {
                jLarea2.setText("sem incendio");
                jPanelArea2.setBackground(new Color(240, 240, 240));
            }
        }
        
        else if (area == 3){
             if (incendio) {
                jLarea3.setText("incendio");
                jPanelArea3.setBackground(new Color(255, 0, 51));
            } else {
                jLarea3.setText("sem incendio");
                jPanelArea3.setBackground(new Color(240, 240, 240));
            }
        }
    }
}