/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Transportation.TransportationAdmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author thiag
 */

public class TransportationAdminWorkAreaJPanel extends javax.swing.JPanel  {

    /**
     * Creates new form TransportationAdminWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public TransportationAdminWorkAreaJPanel ( JPanel userProcessContainer, Enterprise enterprise)   {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.enterprise  =  enterprise;
        
        valueLabel.setText(enterprise.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageOrganizationButton = new javax.swing.JButton();
        manageEmployeeButton = new javax.swing.JButton();
        manageUserButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("Transportation Adminstrative Work Area");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Event Name");

        valueLabel.setText("value");

        manageOrganizationButton.setText("Manage Organization");
        manageOrganizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationButtonActionPerformed(evt);
            }
        });

        manageEmployeeButton.setText("Manage Employee");
        manageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeButtonActionPerformed(evt);
            }
        });

        manageUserButton.setText("Manage User");
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageOrganizationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(headerLabel)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(34, 34, 34)
                .addComponent(manageOrganizationButton)
                .addGap(24, 24, 24)
                .addComponent(manageEmployeeButton)
                .addGap(24, 24, 24)
                .addComponent(manageUserButton)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationButtonActionPerformed

        
        TransportationManageOrganizationJPanel manageTransportationOrganizationJPanel  =  new  TransportationManageOrganizationJPanel ( userProcessContainer,enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageTransportationOrganizationJPanel", manageTransportationOrganizationJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageOrganizationButtonActionPerformed

    private void manageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeButtonActionPerformed

        
        TransportationManageEmployeeJPanel manageTransportationEmployeeJPanel  =  new TransportationManageEmployeeJPanel ( userProcessContainer,enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageTransportationEmployeeJPanel", manageTransportationEmployeeJPanel);

        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        

    }//GEN-LAST:event_manageEmployeeButtonActionPerformed

    private void manageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserButtonActionPerformed
        // TODO add your handling code here:
        TransportationManageUserAccountJPanel manageTransportationUserAccountJPanel = new TransportationManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageTransportationUserAccountJPanel", manageTransportationUserAccountJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton manageEmployeeButton;
    private javax.swing.JButton manageOrganizationButton;
    private javax.swing.JButton manageUserButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
