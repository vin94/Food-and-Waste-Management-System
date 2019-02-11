/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Events.EventsAdminOrganization;
import Business.Organization.Events.EventsManagerOrganization;
import Business.Organization.Events.EventsWorkerOrganization;
import Business.Organization.Transportation.TransportationAdminOrganization;
import Business.Organization.Transportation.TransportationManagerOrganization;
import Business.Organization.Transportation.TransportationWorkerOrganization;
import Business.Organization.NGO.NGOAdminOrganization;
import Business.Organization.NGO.NGOManagerOrganization;
import Business.Organization.NGO.NGOWorkerOrganization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization>organizationList;

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
   
    
    public OrganizationDirectory(){
        
        organizationList = new ArrayList();
    }
    
     public Organization addOrganization(Type type)   {
         
        Organization organization = null;
        
        if( type.getValue().equals(Type.NGOAdmin.getValue()))  
        {
            organization = new NGOAdminOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.NGOManager.getValue()))   
        {
            organization = new NGOManagerOrganization();
            
            organizationList.add(organization);
        
        }
        else if( type.getValue().equals(Type.NGOWorker.getValue()))   
        {
            organization = new NGOWorkerOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.EventsAdmin.getValue()))   
        {
            organization = new EventsAdminOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.EventsManager.getValue()))  
        {
            organization = new EventsManagerOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.EventsWorker.getValue()))   
        {
            organization = new EventsWorkerOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.TransportationAdmin.getValue()))   
        {
            organization = new TransportationAdminOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.TransportationManager.getValue()))   
        {
            organization = new TransportationManagerOrganization();
            
            organizationList.add(organization);
        
        } 
        else if( type.getValue().equals(Type.TransportationWorker.getValue()))    
        {
            organization = new TransportationWorkerOrganization();
            
            organizationList.add(organization);
        
        }
        return organization;
    }
    
    public void remoeOrganization ( Organization o)   {
        
        organizationList.remove(o);
    }

    
}
