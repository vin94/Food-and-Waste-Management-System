/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

import Business.Util.Request.RequestItem;
import Business.WorkQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siri chowdhary
 */
public class NGOEventsRequestViewJPanel extends javax.swing.JPanel  {

    /**
     * Creates new form NGOEventsRequestViewJPanel
     */
      
    private JPanel userProcessContainer;
    private CollectionWorkRequest collectionWorkRequest;

    public NGOEventsRequestViewJPanel ( JPanel userProcessContainer, CollectionWorkRequest collectionWorkRequest) {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.collectionWorkRequest  =  collectionWorkRequest;
        
        populateTable();
        populateData();
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
        requestFromLabel = new javax.swing.JLabel();
        requestFromValueLabel = new javax.swing.JLabel();
        requestDateLabel = new javax.swing.JLabel();
        requestDateValueLabel = new javax.swing.JLabel();
        requestStatusLabel = new javax.swing.JLabel();
        requestStatusValueLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        quantityValueLabel = new javax.swing.JLabel();
        pickupCostLabel = new javax.swing.JLabel();
        pickupCostValueLabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        requestDetailsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("NGO Manager - View Request Details");

        requestFromLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestFromLabel.setText("Request from:");

        requestFromValueLabel.setText("request_from");

        requestDateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestDateLabel.setText("Request Date:");

        requestDateValueLabel.setText("request_date");

        requestStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestStatusLabel.setText("Request status:");

        requestStatusValueLabel.setText("request_status");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quantityLabel.setText("Food Quantity:");

        quantityValueLabel.setText("quantity");

        pickupCostLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pickupCostLabel.setText("Pickup Cost:");

        pickupCostValueLabel.setText("cost");

        requestDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(requestDetailsTable);
        if (requestDetailsTable.getColumnModel().getColumnCount() > 0) {
            requestDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            requestDetailsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(requestFromLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pickupCostLabel)
                                .addGap(47, 47, 47)
                                .addComponent(pickupCostValueLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(requestStatusLabel)
                                            .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(requestDateLabel)
                                            .addGap(35, 35, 35)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(quantityLabel)
                                        .addGap(33, 33, 33)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityValueLabel)
                                    .addComponent(requestDateValueLabel)
                                    .addComponent(requestStatusValueLabel)
                                    .addComponent(requestFromValueLabel)))
                            .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(headerLabel)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestFromLabel)
                    .addComponent(requestFromValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestDateLabel)
                    .addComponent(requestDateValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestStatusLabel)
                    .addComponent(requestStatusValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickupCostLabel)
                    .addComponent(pickupCostValueLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(backButton)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel pickupCostLabel;
    private javax.swing.JLabel pickupCostValueLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel quantityValueLabel;
    private javax.swing.JLabel requestDateLabel;
    private javax.swing.JLabel requestDateValueLabel;
    private javax.swing.JTable requestDetailsTable;
    private javax.swing.JLabel requestFromLabel;
    private javax.swing.JLabel requestFromValueLabel;
    private javax.swing.JLabel requestStatusLabel;
    private javax.swing.JLabel requestStatusValueLabel;
    // End of variables declaration//GEN-END:variables

   private void populateData()   {

        String status  =  collectionWorkRequest.getStatus();

        requestStatusValueLabel.setText(status);
        
        requestFromValueLabel.setText(collectionWorkRequest.getRaisedByEvents());
        
        requestDateValueLabel.setText(collectionWorkRequest.getRequestDate() +"");
        
        quantityValueLabel.setText(collectionWorkRequest.getTotalQuantity() +" pounds");

        String cost  =  collectionWorkRequest.getDeliveryCost()  ==  0 ? "Undelivered"  :  "$" + collectionWorkRequest.getDeliveryCost();
        pickupCostValueLabel.setText(cost);

    }
    
    private void populateTable()  {
        
        DefaultTableModel dtm  =  (DefaultTableModel) requestDetailsTable.getModel();
        dtm.setRowCount(0);

        for(RequestItem ri  :  collectionWorkRequest.getRequestItems())   
        {
            if( ri.getQuantity() > 0)   
            {
                Object row[]  =  new Object[3];
                row[0]  =  ri;
                row[1]  =  ri.getQuantity();
                

                dtm.addRow(row);
            }
        }
    }

    
}