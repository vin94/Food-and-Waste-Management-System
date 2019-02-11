/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoManager;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Transportation.TransportationManagerOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Util.Request.RequestStatus;
import Business.WorkQueue.CollectionWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siri chowdhary
 */
public class NGOEventsRequestJPanel extends javax.swing.JPanel  {

    /**
     * Creates new form NGOEventsRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    
    
    public NGOEventsRequestJPanel ( JPanel userProcessContainer , UserAccount account , Organization organization , Enterprise enterprise , Network network) {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.network  =  network;
        this.account  =  account;
        this.organization  =  organization;
        this.enterprise  =  enterprise;
        
        populateTable();
        populateComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        eventsRequestsTable = new javax.swing.JTable();
        headerLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        assignToEmployeeJPanel = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        workerLabel = new javax.swing.JLabel();
        workerComboBox = new javax.swing.JComboBox();
        assignButton = new javax.swing.JButton();
        redirectToNGOJPanel = new javax.swing.JPanel();
        assignNGOButton = new javax.swing.JButton();
        messageRedirectLabel = new javax.swing.JLabel();
        messageRedirectTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 255, 204));

        eventsRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Events Name", "Recieved Date", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(eventsRequestsTable);
        if (eventsRequestsTable.getColumnModel().getColumnCount() > 0) {
            eventsRequestsTable.getColumnModel().getColumn(0).setResizable(false);
            eventsRequestsTable.getColumnModel().getColumn(1).setResizable(false);
            eventsRequestsTable.getColumnModel().getColumn(2).setResizable(false);
            eventsRequestsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("NGO Manager - Events Requests");

        viewButton.setText("View Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        assignToEmployeeJPanel.setBackground(new java.awt.Color(204, 255, 204));
        assignToEmployeeJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Assign to Employee"));

        messageLabel.setText("Message:");

        workerLabel.setText("Worker:");

        workerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerComboBoxActionPerformed(evt);
            }
        });

        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout assignToEmployeeJPanelLayout = new javax.swing.GroupLayout(assignToEmployeeJPanel);
        assignToEmployeeJPanel.setLayout(assignToEmployeeJPanelLayout);
        assignToEmployeeJPanelLayout.setHorizontalGroup(
            assignToEmployeeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignToEmployeeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignToEmployeeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignToEmployeeJPanelLayout.createSequentialGroup()
                        .addComponent(messageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(assignToEmployeeJPanelLayout.createSequentialGroup()
                        .addComponent(workerLabel)
                        .addGap(17, 17, 17)))
                .addGroup(assignToEmployeeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workerComboBox, 0, 176, Short.MAX_VALUE)
                    .addComponent(messageTextField))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignToEmployeeJPanelLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(assignButton)
                .addContainerGap())
        );
        assignToEmployeeJPanelLayout.setVerticalGroup(
            assignToEmployeeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignToEmployeeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignToEmployeeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assignToEmployeeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addGap(38, 38, 38)
                .addComponent(assignButton)
                .addGap(11, 11, 11))
        );

        redirectToNGOJPanel.setBackground(new java.awt.Color(204, 255, 204));
        redirectToNGOJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Redirect to other NGO"));

        assignNGOButton.setText("Redirect");
        assignNGOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignNGOButtonActionPerformed(evt);
            }
        });

        messageRedirectLabel.setText("Message:");

        javax.swing.GroupLayout redirectToNGOJPanelLayout = new javax.swing.GroupLayout(redirectToNGOJPanel);
        redirectToNGOJPanel.setLayout(redirectToNGOJPanelLayout);
        redirectToNGOJPanelLayout.setHorizontalGroup(
            redirectToNGOJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redirectToNGOJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redirectToNGOJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redirectToNGOJPanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(assignNGOButton))
                    .addGroup(redirectToNGOJPanelLayout.createSequentialGroup()
                        .addComponent(messageRedirectLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(messageRedirectTextField)))
                .addContainerGap())
        );
        redirectToNGOJPanelLayout.setVerticalGroup(
            redirectToNGOJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redirectToNGOJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redirectToNGOJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageRedirectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageRedirectLabel))
                .addGap(59, 59, 59)
                .addComponent(assignNGOButton)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(redirectToNGOJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(assignToEmployeeJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(headerLabel)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(viewButton)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignToEmployeeJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redirectToNGOJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(backButton)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow  =  eventsRequestsTable.getSelectedRow();
        
        if( selectedRow < 0)   
        {
            JOptionPane.showMessageDialog ( null, "Please select a request item to view details" , "Information" ,JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        else 
        {
            CollectionWorkRequest cwr  =  (CollectionWorkRequest)eventsRequestsTable.getValueAt(selectedRow, 3);
            
            NGOEventsRequestViewJPanel eventsWorkerViewLogItemJPanel  =  new NGOEventsRequestViewJPanel ( userProcessContainer , cwr);
            CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
            
            userProcessContainer.add("eventsWorkerViewLogItemJPanel", eventsWorkerViewLogItemJPanel);
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:

        
        int selectedRow  =  eventsRequestsTable.getSelectedRow();
        if(selectedRow < 0) 
        {
            JOptionPane.showMessageDialog(null,"Please select a request item to view details","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else 
        {
            CollectionWorkRequest request  =  (CollectionWorkRequest)eventsRequestsTable.getValueAt(selectedRow, 3);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(1))) 
            {
                
                int selectedEmployee  =  workerComboBox.getSelectedIndex();
                if(selectedEmployee < 0) 
                {
                    JOptionPane.showMessageDialog ( null , "Please select an employee to assign the request to" , "Warning" , JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                request.setSender(account);
                
                request.setStatus(RequestStatus.getPickupStatusMessage(2));
                
                request.setMessage(messageTextField.getText());
                
                request.setDeliverToNGO(enterprise.getName());
                
                UserAccount acc  =  (UserAccount) workerComboBox.getSelectedItem();
                
                request.setDeliverTo(acc);

                // Adding to own queue
                account.getWorkQueue().getWorkRequestList().add(request);

                // Adding to Transportation Manager Organization queue
                for( Enterprise e  :  network.getEnterpriseDirectory().getEnterpriseList())   
                {
                    for( Organization o  :  e.getOrganizationDirectory().getOrganizationList())  
                    {
                        if( o instanceof TransportationManagerOrganization)   
                        {
                            o.getWorkQueue().getWorkRequestList().add(request);
                            break;
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Request approved and forwarded to transportation", "Information", JOptionPane.INFORMATION_MESSAGE);
                populateTable();
                messageTextField.setText("");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"Request already processed by you","Warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_assignButtonActionPerformed

    private void workerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workerComboBoxActionPerformed

    private void assignNGOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignNGOButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow  =  eventsRequestsTable.getSelectedRow();
        if(selectedRow < 0)  {
            
            JOptionPane.showMessageDialog(null , "Please select a request item to view details" , "Warning" , JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else 
        {
            CollectionWorkRequest request  =  (CollectionWorkRequest)eventsRequestsTable.getValueAt(selectedRow, 3);
            String message  =  messageRedirectTextField.getText();
            
            NGOOtherRegionsRequestJPanel ngoOtherRegionsRequestJPanel  =  new NGOOtherRegionsRequestJPanel( userProcessContainer , request, organization, account, network,message);
            userProcessContainer.add("NGOOtherRegionsRequestJPanel", ngoOtherRegionsRequestJPanel);
            
            CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
            messageRedirectTextField.setText("");
        }
        

    }//GEN-LAST:event_assignNGOButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton assignNGOButton;
    private javax.swing.JPanel assignToEmployeeJPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JTable eventsRequestsTable;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel messageRedirectLabel;
    private javax.swing.JTextField messageRedirectTextField;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JPanel redirectToNGOJPanel;
    private javax.swing.JButton viewButton;
    private javax.swing.JComboBox workerComboBox;
    private javax.swing.JLabel workerLabel;
    // End of variables declaration//GEN-END:variables

    
    
     private void populateComboBox()   {
        
         workerComboBox.removeAllItems();
        
         for( Organization org  :  enterprise.getOrganizationDirectory().getOrganizationList())  
         {
            for( UserAccount user  :  org.getUserAccountDirectory().getUserAccountList())   
            {
                if( user.getRole().getRoleType().getValue().equals(Role.RoleType.NGOWorker.getValue()))   
                {
                    workerComboBox.addItem(user);
                }
            }
        }
    }
     
    public void populateTable()   
    {
        
        DefaultTableModel dtm  =  (DefaultTableModel) eventsRequestsTable.getModel();
        dtm.setRowCount(0);
        
        for( WorkRequest workRequest:organization.getWorkQueue().getWorkRequestList())   
        {
            if( workRequest instanceof CollectionWorkRequest)   
            {
                CollectionWorkRequest cwr  =  (CollectionWorkRequest) workRequest;

                // View only newly raised requests
                if( cwr.getStatus().equals(RequestStatus.getPickupStatusMessage(1)))   
                {
                    Object row[]  =  new Object[4];
                    
                    row[0]  =  cwr.getRaisedByEvents();
                    row[1]  =  cwr.getRequestDate();
                    row[2]  =  cwr.getMessage();
                    row[3]  =  cwr;
                    
                    dtm.addRow(row);
                }
            }
        }
    }
    
   
}
