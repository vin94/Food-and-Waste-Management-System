/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Transportation;

import Business.Organization.Organization;
import Business.Role.Transportation.TransportationWorkerRole;
import Business.Role.NGO.NGOAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class TransportationWorkerOrganization extends Organization{
    
     public TransportationWorkerOrganization() {
        super(Type.TransportationWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportationWorkerRole());
        return roles;
    }
    
}
