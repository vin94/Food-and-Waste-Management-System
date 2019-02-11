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
import userInterface.ngo.ngoWorker.NGOWorkerWorkAreaJPanel;

/**
 *
 * @author siri chowdhary
 */
public class NGOWorkerRole extends Role {
    
     public NGOWorkerRole() {
        super(RoleType.NGOWorker);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NGOWorkerWorkAreaJPanel(userProcessContainer,account,organization,enterprise,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
