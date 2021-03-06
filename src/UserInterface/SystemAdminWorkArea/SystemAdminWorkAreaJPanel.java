/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.systemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author siri chowdhary
 */

public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel  {

    
    private JPanel userProcessContainer;
    private EcoSystem business;

    /**
     * Creates new form SystemAdminAreaJPanel
     */
    
    public SystemAdminWorkAreaJPanel ( JPanel userProcessContainer, EcoSystem business)   {
        
        initComponents();
        
        this.userProcessContainer  =  userProcessContainer;
        this.business  =  business;
        populateTree();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        panelNetwork = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        treeNetwork = new javax.swing.JTree();
        workAreaPanel = new javax.swing.JPanel();
        nodeLabel = new javax.swing.JLabel();
        nodeValueLabel = new javax.swing.JLabel();
        ManageEnterpriseAdminButton = new javax.swing.JButton();
        ManageEnterpriseButton = new javax.swing.JButton();
        ManageNetworkButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        treeNetwork.setBackground(new java.awt.Color(204, 204, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("EcoSystem");
        treeNetwork.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeNetwork.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeNetworkValueChanged(evt);
            }
        });
        jScrollPane.setViewportView(treeNetwork);

        javax.swing.GroupLayout panelNetworkLayout = new javax.swing.GroupLayout(panelNetwork);
        panelNetwork.setLayout(panelNetworkLayout);
        panelNetworkLayout.setHorizontalGroup(
            panelNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
            .addGroup(panelNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelNetworkLayout.createSequentialGroup()
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelNetworkLayout.setVerticalGroup(
            panelNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
            .addGroup(panelNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(panelNetwork);

        workAreaPanel.setBackground(new java.awt.Color(204, 204, 255));

        nodeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nodeLabel.setText("Selected Node:");

        nodeValueLabel.setText("<view selected network>");

        ManageEnterpriseAdminButton.setText("Manage Enterprise Admin");
        ManageEnterpriseAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterpriseAdminButtonActionPerformed(evt);
            }
        });

        ManageEnterpriseButton.setText("Manage Enterprise");
        ManageEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterpriseButtonActionPerformed(evt);
            }
        });

        ManageNetworkButton.setText("Manage Network");
        ManageNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNetworkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaPanelLayout = new javax.swing.GroupLayout(workAreaPanel);
        workAreaPanel.setLayout(workAreaPanelLayout);
        workAreaPanelLayout.setHorizontalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManageEnterpriseAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageEnterpriseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageNetworkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(nodeLabel)
                        .addGap(35, 35, 35)
                        .addComponent(nodeValueLabel)))
                .addGap(73, 73, 73))
        );
        workAreaPanelLayout.setVerticalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nodeLabel)
                    .addComponent(nodeValueLabel))
                .addGap(37, 37, 37)
                .addComponent(ManageNetworkButton)
                .addGap(18, 18, 18)
                .addComponent(ManageEnterpriseButton)
                .addGap(18, 18, 18)
                .addComponent(ManageEnterpriseAdminButton)
                .addGap(439, 439, 439))
        );

        splitPane.setRightComponent(workAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void treeNetworkValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeNetworkValueChanged
        // TODO add your handling code here:
        
        DefaultMutableTreeNode selectedNode  =  (DefaultMutableTreeNode) treeNetwork.getLastSelectedPathComponent();
        if(selectedNode  !=  null)   
        {
            nodeValueLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_treeNetworkValueChanged

    private void ManageEnterpriseAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEnterpriseAdminButtonActionPerformed
        // TODO add your handling code here:
        
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel  =  new ManageEnterpriseAdminJPanel ( userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_ManageEnterpriseAdminButtonActionPerformed

    private void ManageEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        
        ManageEnterpriseJPanel manageEnterpriseJPanel  =  new ManageEnterpriseJPanel ( userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseJPanel", manageEnterpriseJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_ManageEnterpriseButtonActionPerformed

    private void ManageNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNetworkButtonActionPerformed
        // TODO add your handling code here:
        
        
        ManageNetworkJPanel manageNetworkJPanel  =  new ManageNetworkJPanel ( userProcessContainer, business);
        userProcessContainer.add("ManageNetworkJPanel", manageNetworkJPanel);
        
        CardLayout layout  =  (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_ManageNetworkButtonActionPerformed

    public void populateTree()   {
        
        DefaultTreeModel dtm  =  (DefaultTreeModel) treeNetwork.getModel();

        ArrayList<Network> networkList  =  business.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode root  =  (DefaultMutableTreeNode) dtm.getRoot();
        root.removeAllChildren();

        DefaultMutableTreeNode networks  =  new DefaultMutableTreeNode("Networks");
        root.insert(networks,0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for(int i = 0; i < networkList.size(); i++)   
        {
            network  =  networkList.get(i);
            networkNode  =  new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList  =  network.getEnterpriseDirectory().getEnterpriseList();

            for(int j = 0; j < enterpriseList.size(); j++)   
            {
                enterprise  =  enterpriseList.get(j);
                enterpriseNode  =  new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList  =  enterprise.getOrganizationDirectory().getOrganizationList();

                for(int k = 0; k < organizationList.size(); k++)   
                {
                    organization  =  organizationList.get(k);
                    organizationNode  =  new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }

        }
        
        dtm.reload();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageEnterpriseAdminButton;
    private javax.swing.JButton ManageEnterpriseButton;
    private javax.swing.JButton ManageNetworkButton;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel nodeLabel;
    private javax.swing.JLabel nodeValueLabel;
    private javax.swing.JPanel panelNetwork;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTree treeNetwork;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables
}
