/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Transportation;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.Transportation.TransportationAdmin.TransportationAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author siri chowdhary
 */
public class TransportationAdminRole extends Role {

    
     public TransportationAdminRole() {
        super(RoleType.TransportationAdmin);
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new TransportationAdminWorkAreaJPanel(userProcessContainer,enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
}
