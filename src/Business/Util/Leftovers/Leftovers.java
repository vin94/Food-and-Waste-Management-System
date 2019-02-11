/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util.Leftovers;

import java.util.HashMap;

/**
 *
 * @author siri chowdhary
 */
public class Leftovers {
    
       public static HashMap leftoversMap;

    public static void initializeFood()   {
        
        leftoversMap = new HashMap();
        leftoversMap.put("fruits", 1d);
        leftoversMap.put("Sandwich", 0.75d);
        leftoversMap.put("Chicken", 2d);
        leftoversMap.put("Pizza", 3d);
        leftoversMap.put("Eggs", 1d);
    }

    public static HashMap getLeftoversMap() {
        return leftoversMap;
    }

    public static double getLeftoversQuantityPerServing(String name) {
        return (double) leftoversMap.get(name);
        
    }
    
}
