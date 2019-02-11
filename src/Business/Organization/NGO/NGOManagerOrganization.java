/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.NGO;

import Business.Organization.Organization;
import Business.Role.NGO.NGOManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class NGOManagerOrganization extends Organization{
    
     public NGOManagerOrganization() {
        super(Type.NGOManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOManagerRole());
        return roles;
    }
    
}
