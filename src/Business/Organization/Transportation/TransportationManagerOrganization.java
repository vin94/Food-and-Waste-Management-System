/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Transportation;

import Business.Organization.Organization;
import Business.Role.Transportation.TransportationManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class TransportationManagerOrganization extends Organization{
    
     public TransportationManagerOrganization() {
        super(Type.TransportationManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportationManagerRole());
        return roles;
    }
    
}
