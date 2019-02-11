/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

import Business.Organization.Organization;
import Business.WorkQueue.ShortageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siri chowdhary
 */
public class NGOViewShortageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOViewShortageRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private Organization organization;

    public NGOViewShortageRequestJPanel ( JPanel userProcessContainer , Organization organization) {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.organization  =  organization;
        
        populateShortageTable();
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
        backButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        shortageTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("NGO Worker - Shortage Requests");

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        shortageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "NGO Name", "Raised By(Manager Name)", "Assign to Employee", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(shortageTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(headerLabel)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(backButton)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateShortageTable()   {
        
        DefaultTableModel dtm  =  (DefaultTableModel) shortageTable.getModel();
        dtm.setRowCount(0);

        for( WorkRequest wr  :  organization.getWorkQueue().getWorkRequestList())  
        {
            if( wr instanceof ShortageWorkRequest)   
            {
                ShortageWorkRequest swr  =  (ShortageWorkRequest) wr;

                Object row[]  =  new Object[5];
                row[0]  =  swr.getRequestDate();
                row[1]  =  swr.getSender().getEmployee().getName();
                row[2]  =  swr.getNgoName();
                row[3]  =  swr.getAssignToEmployee();
                row[4]  =  swr;

                dtm.addRow(row);
            }
        }
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable shortageTable;
    // End of variables declaration//GEN-END:variables
}
