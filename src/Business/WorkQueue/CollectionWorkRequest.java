/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import Business.Util.Request.RequestItem;

import java.util.ArrayList;

/**
 *
 * @author siri chowdhary
 */
public class CollectionWorkRequest extends WorkRequest {

    private UserAccount raisedBy;
    private UserAccount deliverTo;
    private UserAccount deliveredBy;
    private String raisedByEvents;
    private String deliverToNGO;
    private String deliveredByTransportation;
    private ArrayList<RequestItem> requestItems;
    private double totalQuantity;
    private double deliveryCost;
    private boolean paid;
    private boolean invoiceGenerated;

    public CollectionWorkRequest() {
        requestItems = new ArrayList();
    }

    public UserAccount getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(UserAccount raisedBy) {
        this.raisedBy = raisedBy;
    }

    public UserAccount getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(UserAccount deliverTo) {
        this.deliverTo = deliverTo;
    }

    public UserAccount getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(UserAccount deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public String getRaisedByEvents() {
        return raisedByEvents;
    }

    public void setRaisedByEvents(String raisedByEvents) {
        this.raisedByEvents = raisedByEvents;
    }

    public String getDeliverToNGO() {
        return deliverToNGO;
    }

    public void setDeliverToNGO(String deliverToNGO) {
        this.deliverToNGO = deliverToNGO;
    }

    public String getDeliveredByTransportation() {
        return deliveredByTransportation;
    }

    public void setDeliveredByTransportation(String deliveredByTransportation) {
        this.deliveredByTransportation = deliveredByTransportation;
    }

    

    public ArrayList<RequestItem> getRequestItems() {
        return requestItems;
    }

    public void setRequestItems(ArrayList<RequestItem> requestItems) {
        this.requestItems = requestItems;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean getInvoiceGenerated() {
        return invoiceGenerated;
    }

    public void setInvoiceGenerated(boolean invoiceGenerated) {
        this.invoiceGenerated = invoiceGenerated;
    }
    
    
    

    public void addRequestItem(String food, int quantity) {
        RequestItem ri = new RequestItem(food, quantity);
        requestItems.add(ri);
    }

    /*public void updatePerishable() {
        for (RequestItem ri : requestItems) {
            if ( ri.getQuantity() > 0) {
                System.out.println(ri.getFoodName());
            }
        }
    }*/
}
