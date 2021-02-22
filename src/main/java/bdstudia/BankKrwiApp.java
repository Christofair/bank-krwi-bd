/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author krystofair
 */
public class BankKrwiApp extends javax.swing.JFrame {
    
    SessionFactory FactoryObj;
    Osoba InnerPerson;

    /**
     * Creates new form BankKrwiApp
     */
    public BankKrwiApp() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        this.FactoryObj = meta.getSessionFactoryBuilder().build();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddPersonBtn = new javax.swing.JButton();
        EditPersonBtn = new javax.swing.JButton();
        AddBankBtn = new javax.swing.JButton();
        EditBankBtn = new javax.swing.JButton();
        ZamowieniaBtn = new javax.swing.JButton();
        RealizacjeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK KRWI");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Program zarz�dzania bankami krwi");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddPersonBtn.setText("Dodaj osob�");
        AddPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonBtnActionPerformed(evt);
            }
        });

        EditPersonBtn.setText("Edytuj osob�");
        EditPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPersonBtnActionPerformed(evt);
            }
        });

        AddBankBtn.setText("Dodaj bank");
        AddBankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBankBtnActionPerformed(evt);
            }
        });

        EditBankBtn.setText("Edytuj bank");
        EditBankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBankBtnActionPerformed(evt);
            }
        });

        ZamowieniaBtn.setText("Zam�wienia");

        RealizacjeBtn.setText("Realizacje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddPersonBtn)
                    .addComponent(AddBankBtn)
                    .addComponent(ZamowieniaBtn))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RealizacjeBtn)
                    .addComponent(EditBankBtn)
                    .addComponent(EditPersonBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddBankBtn, AddPersonBtn, EditBankBtn, EditPersonBtn, RealizacjeBtn, ZamowieniaBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPersonBtn)
                    .addComponent(EditPersonBtn))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBankBtn)
                    .addComponent(EditBankBtn))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZamowieniaBtn)
                    .addComponent(RealizacjeBtn))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonBtnActionPerformed
        OsobaJFrame ojf = new OsobaJFrame(FactoryObj);
        ojf.showAddForm();
    }//GEN-LAST:event_AddPersonBtnActionPerformed

    private void EditPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPersonBtnActionPerformed
        PobranieForm pf = new PobranieForm(FactoryObj);
        pf.showEditForm();
    }//GEN-LAST:event_EditPersonBtnActionPerformed

    private void AddBankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBankBtnActionPerformed
        BankJFrame bjf = new BankJFrame(FactoryObj);
        bjf.showAddForm();
    }//GEN-LAST:event_AddBankBtnActionPerformed

    private void EditBankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBankBtnActionPerformed
        PobranieForm pf = new PobranieForm(FactoryObj);
        pf.showEditBankForm();
    }//GEN-LAST:event_EditBankBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BankKrwiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankKrwiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankKrwiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankKrwiApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankKrwiApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBankBtn;
    private javax.swing.JButton AddPersonBtn;
    private javax.swing.JButton EditBankBtn;
    private javax.swing.JButton EditPersonBtn;
    private javax.swing.JButton RealizacjeBtn;
    private javax.swing.JButton ZamowieniaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
