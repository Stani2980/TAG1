/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author jonas
 */
public class Armor implements Iitem{
    String name, description;
    private int defense;
    boolean usable = false;
    
    Armor() {
       
    }    

    public Armor(String name, String description, int defense) {
        this.name = name;
        this.description = description;
        this.defense = defense;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Armor > " + "\""+name+"\"" + " Defense +"+defense + " Description: \""+getDescription()+"\"";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean getUsable() {
        return this.usable;
    }

    @Override
    public void setUsable(boolean usable) {
        this.usable = usable;
    }
}
