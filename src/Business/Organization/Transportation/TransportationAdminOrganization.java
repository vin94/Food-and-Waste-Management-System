/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Transportation;

import Business.Organization.Organization;
import Business.Role.Transportation.TransportationAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class TransportationAdminOrganization extends Organization{
    
     public TransportationAdminOrganization() {
        super(Type.TransportationAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportationAdminRole());
        return roles;
    }
    
}
