/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.NGO;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.NGO.NGOWorkerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class NGOWorkerOrganization extends Organization{
    
    
    public NGOWorkerOrganization() {
        super(Type.NGOWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOWorkerRole());
        return roles;
    }

    
}
