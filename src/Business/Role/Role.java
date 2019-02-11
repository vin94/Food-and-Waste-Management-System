/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author siri chowdhary
 */
public abstract class Role {
    
      public RoleType roleType;

    public enum RoleType {
        NGOMAdmin("NGO Admin"),
        NGOManager("NGO Manager"),
        NGOWorker("NGO Worker"),
        EventsAdmin("Events Admin"),
        EventsManager("Events Manager"),
        EventsWorker("Events Worker"),
        TransportationAdmin("Transportation Admin"),
        TransportationManager("Transportation Manager"),
        TransportationWorker("Transportation Worker");

        private String value;
        

        private RoleType(String value) {
            this.value = value;
        }
        

        public String getValue() {
            return value;
        }
        

        @Override
        public String toString() {
            return value;
        }
        
    }

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
    

    public RoleType getRoleType() {
        return roleType;
    }
    

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return roleType.getValue();
    }
 
}
