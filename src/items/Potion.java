/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import App.Player;

/**
 *
 * @author jonas
 */
public class Potion implements Iitem{
    String name, description;
    private int hpRestore;
    private boolean usable = true;

    public Potion(String name, String description, int type) {
        this.name = name;
        this.description = description;
                    
        switch(type){
            case 1: this.hpRestore = 10;
                    break;
            case 2: this.hpRestore = 20;
                    break;
            case 3: this.hpRestore = 30;
                    break;
             }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return "Potion >" +"\""+name+"\"" + " Restores "+hpRestore+"HP " + "Description: \""+getDescription()+"\"";
    }

    public int getHpRestore() {
        return hpRestore;
    }

    public void setHpRestore(int hpRestore) {
        this.hpRestore = hpRestore;
    }

    @Override
    public boolean getUsable() {
        return this.usable;
    }

    @Override
    public void setUsable(boolean usable) {
        this.usable = usable;
    }
    @Override
    public void use(Player player){
        player.setHp(hpRestore);
        
    }
            
}