/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise>enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList= new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise addEnterprise(String name,EnterpriseType type){
       
        Enterprise enterprise = null;
        
        if(type == EnterpriseType.Events){
           enterprise = new EventsEnterprise(name); 
        }
        else if(type == EnterpriseType.Transportation){
        enterprise = new TransportationEnterprise(name);
    }
        else if(type == EnterpriseType.NGO){
        enterprise = new NGOEnterprise(name);
    }
           
           enterpriseList.add(enterprise);
           return enterprise;
            
    }
    
    public void removeEnterprise(Enterprise ent){
        
        enterpriseList.remove(ent);
    }
    
    public boolean checkIfEnterpriseExists(String enterpriseName,EnterpriseType type){
        
        for(Enterprise ent:enterpriseList){
            if(ent.getEnterpriseType() == type && (ent.getName().equals(enterpriseName))){
                return true;
            }
        }
        return false;
    }
    
}
