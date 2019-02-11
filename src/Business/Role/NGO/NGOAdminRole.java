/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.NGO;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoAdmin.NGOAdminWorkAreaJPanel;

/**
 *
 * @author siri chowdhary
 */
public class NGOAdminRole extends Role  {
    
    public NGOAdminRole() {
        super(RoleType.NGOMAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NGOAdminWorkAreaJPanel(userProcessContainer,enterprise,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
