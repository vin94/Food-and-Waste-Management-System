
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Util.Request.RequestStatus;
import static Business.Util.Request.RequestStatus.pickupRequestStatusList;
import Business.WorkQueue.CollectionWorkRequest;
import Business.WorkQueue.PaymentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siri chowdhary
 */
public class NGOManagerPayInvoiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManagerPayInvoiceJPanel
     */
    
    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount account;

    public NGOManagerPayInvoiceJPanel ( JPanel userProcessContainer , UserAccount account, Organization organization)  {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.account = account;
        
        populateTable();
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
        jScrollPane = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        payInvoiceButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("NGO Manager - Pay Invoices");

        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transportation Company", "Job Completion Date", "Request Status", "Cost", "Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(detailsTable);
        if (detailsTable.getColumnModel().getColumnCount() > 0) {
            detailsTable.getColumnModel().getColumn(0).setResizable(false);
            detailsTable.getColumnModel().getColumn(1).setResizable(false);
            detailsTable.getColumnModel().getColumn(2).setResizable(false);
            detailsTable.getColumnModel().getColumn(3).setResizable(false);
            detailsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        payInvoiceButton.setText("Pay Invoice");
        payInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvoiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(512, 512, 512)
                                .addComponent(payInvoiceButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(headerLabel)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(payInvoiceButton))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void payInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvoiceButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow  =  detailsTable.getSelectedRow();
        if( selectedRow < 0)   
        {
            JOptionPane.showMessageDialog(null,"Please select an invoice to pay","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else 
        {

            PaymentWorkRequest pwr  =  (PaymentWorkRequest)detailsTable.getValueAt(selectedRow,0);
            
            if( pwr.getCollectionWorkRequest().getPaid())   
            {
                JOptionPane.showMessageDialog(null,"Invoice has already been paid","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            pwr.setStatus(RequestStatus.getInvoiceStatusMessage(2));
            pwr.getCollectionWorkRequest().setPaid(true);

            //Assign to own queue
            account.getWorkQueue().getWorkRequestList().add(pwr);
                    
            JOptionPane.showMessageDialog ( null, "Invoice Paid", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateTable();

        }
    }//GEN-LAST:event_payInvoiceButtonActionPerformed

    public void populateTable()   {

        DefaultTableModel dtm  =  (DefaultTableModel) detailsTable.getModel();
        dtm.setRowCount(0);
        
        for( WorkRequest wr  :  organization.getWorkQueue().getWorkRequestList())   
        {
            if( wr instanceof PaymentWorkRequest)    
            {
                PaymentWorkRequest pwr  =  (PaymentWorkRequest) wr;
                
                CollectionWorkRequest cwr  =  pwr.getCollectionWorkRequest();
                
                if((cwr.getStatus().equals(pickupRequestStatusList.get(5)))  ||  (cwr.getStatus().equals(pickupRequestStatusList.get(6))))  
                {

                    Object row[]  =  new Object[5];
                    row[0]  =  pwr;
                    row[1]  =  cwr.getResolveDate();
                    row[2]  =  pwr.getStatus();
                    row[3]  =  "$" + cwr.getDeliveryCost();
                    row[4]  =  cwr.getPaid() ? "Yes" : "No";

                    dtm.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton payInvoiceButton;
    // End of variables declaration//GEN-END:variables
}
