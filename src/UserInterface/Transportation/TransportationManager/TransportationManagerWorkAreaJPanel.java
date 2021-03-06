/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Transportation.TransportationManager;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author thiag
 */
public class TransportationManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportationManagerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    

    public TransportationManagerWorkAreaJPanel ( JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.account  =  account;
        this.organization  =  organization;
        this.enterprise  =  enterprise;
        this.network  =  network;
        
        nameValueLabel.setText(account.getEmployee().getName());
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
        nameLabel = new javax.swing.JLabel();
        nameValueLabel = new javax.swing.JLabel();
        eventsRequestButton = new javax.swing.JButton();
        generateInvoicesButton = new javax.swing.JButton();
        workLogButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("Transportation Manager Work Area");
        add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 438, -1));

        nameLabel.setText("Welcome: ");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        nameValueLabel.setText("View Name");
        add(nameValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        eventsRequestButton.setText("View Work Requests");
        eventsRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsRequestButtonActionPerformed(evt);
            }
        });
        add(eventsRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        generateInvoicesButton.setText("Generate Invoices");
        generateInvoicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateInvoicesButtonActionPerformed(evt);
            }
        });
        add(generateInvoicesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 151, -1));

        workLogButton.setText("View Work Log");
        workLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workLogButtonActionPerformed(evt);
            }
        });
        add(workLogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 151, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void eventsRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsRequestButtonActionPerformed
        // TODO add your handling code here:
        
        TransportationManagerViewRequestsJPanel transportationManagerViewRequestsJPanel  =  new TransportationManagerViewRequestsJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("TransportationManagerViewRequestsJPanel", transportationManagerViewRequestsJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_eventsRequestButtonActionPerformed

    private void generateInvoicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateInvoicesButtonActionPerformed
        
        TransportationManagerGenerateInvoicesJPanel transportationManagerGenerateInvoicesJPanel  =  new TransportationManagerGenerateInvoicesJPanel(userProcessContainer, account, network);
        userProcessContainer.add("TransportationManagementManagerGenerateInvoicesJPanel", transportationManagerGenerateInvoicesJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_generateInvoicesButtonActionPerformed

    private void workLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workLogButtonActionPerformed
        // TODO add your handling code here:
        
        TransportationManagerViewWorkLogJPanel transportationManagerViewWorkLogJPanel  =  new TransportationManagerViewWorkLogJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("TransportationManagerViewWorkLogJPanel", transportationManagerViewWorkLogJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_workLogButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eventsRequestButton;
    private javax.swing.JButton generateInvoicesButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameValueLabel;
    private javax.swing.JButton workLogButton;
    // End of variables declaration//GEN-END:variables
}
