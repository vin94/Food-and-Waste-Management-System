/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ngo.ngoAdmin;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siri chowdhary
 */
public class NGOManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManageOrganization
     */
    
    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    

    public NGOManageOrganizationJPanel ( JPanel userProcessContainer , OrganizationDirectory organizationDirectory)   {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.organizationDirectory  =  organizationDirectory;
        
        populateTable();
        populateCombo();
        
    }
    
    private void populateTable()   {
        
        DefaultTableModel model  =  (DefaultTableModel) organizationTable.getModel();

        model.setRowCount(0);

        for( Organization organization  :  organizationDirectory.getOrganizationList())    
        {
            Object[] row  =  new Object[2];
            row[0]  =  organization.getOrganizationID();
            row[1]  =  organization.getName();

            model.addRow(row);
        }
    }

    private void populateCombo()   {
        
        organizationComboBox.removeAllItems();
        
        for( Organization.Type type  :  Organization.Type.values())    
        {
            if(( !type.getValue().equals(Organization.Type.NGOAdmin.getValue()))  &&  (type.getValue().indexOf("NGO") >= 0)) 
            {
                organizationComboBox.addItem(type);
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addOrganizationButton = new javax.swing.JButton();
        headerLabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();
        jSeparator = new javax.swing.JSeparator();
        organizationTypeLabel = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        addOrganizationButton.setText("Add Organization");
        addOrganizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationButtonActionPerformed(evt);
            }
        });

        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setText("NGO Adminstrative Work Area - Manage Organization");

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(organizationTable);

        organizationTypeLabel.setText("Organization Type ");

        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(backButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(organizationTypeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(addOrganizationButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(headerLabel)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(headerLabel)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationTypeLabel))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrganizationButton)
                    .addComponent(backButton))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrganizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationButtonActionPerformed

        Type type  =  (Type)organizationComboBox.getSelectedItem();

        if( type  ==  null)   
        {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            return;
        }

        organizationDirectory.addOrganization(type);

        JOptionPane.showMessageDialog(null, "Organziation created successfully!");
        populateTable();
        
    }//GEN-LAST:event_addOrganizationButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrganizationButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable organizationTable;
    private javax.swing.JLabel organizationTypeLabel;
    // End of variables declaration//GEN-END:variables
}
