/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Events.EventsWorker;

import Business.Util.Request.RequestItem;
import Business.WorkQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alves
 */

public class EventsWorkerViewLogItemJPanel extends javax.swing.JPanel   {
    

    private JPanel userProcessContainer;
    private CollectionWorkRequest collectionWorkRequest;

    /**
     * Creates new form EventsWorkerViewLogItemJPanel
     */
    
    public EventsWorkerViewLogItemJPanel ( JPanel userProcessContainer , CollectionWorkRequest collectionWorkRequest)   {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.collectionWorkRequest  =  collectionWorkRequest;
        populateItemTable();
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
        jScrollPane = new javax.swing.JScrollPane();
        foodItemsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        requestStatusLabel = new javax.swing.JLabel();
        ngoValueLabel = new javax.swing.JLabel();
        quantityValueLabel = new javax.swing.JLabel();
        ngoLabel = new javax.swing.JLabel();
        requestStatusValueLabel = new javax.swing.JLabel();
        transportationLabel = new javax.swing.JLabel();
        requestDateValueLabel = new javax.swing.JLabel();
        transportationValueLabel = new javax.swing.JLabel();
        requestDateLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("Events Worker Work Area - Collection Request");

        foodItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(foodItemsTable);
        if (foodItemsTable.getColumnModel().getColumnCount() > 0) {
            foodItemsTable.getColumnModel().getColumn(0).setResizable(false);
            foodItemsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        requestStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestStatusLabel.setText("Request status:");

        ngoValueLabel.setText("ngo");

        quantityValueLabel.setText("quantity");

        ngoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ngoLabel.setText("NGO delivered to:");

        requestStatusValueLabel.setText("request_status");

        transportationLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        transportationLabel.setText("Transportation");

        requestDateValueLabel.setText("request_date");

        transportationValueLabel.setText("Transportation");

        requestDateLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestDateLabel.setText("Request Date:");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quantityLabel.setText("Food Quantity:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(requestStatusValueLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ngoLabel)
                            .addComponent(transportationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transportationValueLabel)
                            .addComponent(ngoValueLabel))))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(headerLabel)
                .addGap(48, 48, 48)
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
                    .addComponent(ngoLabel)
                    .addComponent(ngoValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transportationLabel)
                    .addComponent(transportationValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    
    
    public void populateData()  {

        requestDateValueLabel.setText(collectionWorkRequest.getRequestDate() + "");
        
        requestStatusValueLabel.setText(collectionWorkRequest.getStatus());
        
        quantityValueLabel.setText(collectionWorkRequest.getTotalQuantity() + " pounds");

        String ngo  =  collectionWorkRequest.getDeliverToNGO()  ==  null ? "Undelivered"  :  collectionWorkRequest.getDeliverToNGO();
        ngoValueLabel.setText(ngo);

        String transportation  =  collectionWorkRequest.getDeliveredByTransportation()  ==  null ? "Undelivered"  :  collectionWorkRequest.getDeliveredByTransportation();
        transportationValueLabel.setText(transportation);

    }
    
    public void populateItemTable()   
    {
        
        DefaultTableModel dtm  =  (DefaultTableModel) foodItemsTable.getModel();
        dtm.setRowCount(0);

        for(RequestItem ri  :  collectionWorkRequest.getRequestItems())   
        {
            Object row[]  =  new Object[2];
            row[0]  =  ri;
            row[1]  =  ri.getQuantity();

            dtm.addRow(row);
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable foodItemsTable;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel ngoLabel;
    private javax.swing.JLabel ngoValueLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel quantityValueLabel;
    private javax.swing.JLabel requestDateLabel;
    private javax.swing.JLabel requestDateValueLabel;
    private javax.swing.JLabel requestStatusLabel;
    private javax.swing.JLabel requestStatusValueLabel;
    private javax.swing.JLabel transportationLabel;
    private javax.swing.JLabel transportationValueLabel;
    // End of variables declaration//GEN-END:variables
}
