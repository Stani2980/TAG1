/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.ArrayList;

/**
 *
 * @author Stanislav
 */
public class Inventory {
    
    
    
    ArrayList<Iitem> inventory = new ArrayList<>();
    
    
    
    public void add(Iitem item){
        inventory.add(item);
    }
    
    public void remove(Iitem item){
        inventory.contains(item);
        inventory.remove(item);
        
    }
    
    public void show(){
        for (int i=0; i < inventory.size();i++) {
                System.out.println(inventory.get(i));
            }
    }
      public Iitem MoveFromInventoryToRoom(String item){
        Iitem temp;
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equalsIgnoreCase(item)) {
                temp = inventory.get(i);
                this.inventory.remove(i);
                
            return temp;
        }
    }return null;
        
    
    }
  
    
    
}
