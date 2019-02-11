/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Events;

import Business.Organization.Organization;
import Business.Role.Events.EventsAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class EventsAdminOrganization extends Organization{
    
     public EventsAdminOrganization() {
        super(Type.EventsAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventsAdminRole());
        return roles;
    }
    
}
