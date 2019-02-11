/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util.Request;

/**
 *
 * @author siri chowdhary
 */
public class RequestItem {
    
    private String foodName;
    private int quantity;

    public RequestItem(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }
    
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    @Override
    public String toString(){
        return foodName;
    }
    
}
