/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterTypes;

import App.Player;

/**
 *
 * @author Stanislav
 */
public class Plants extends Monster{
    
    public Plants(String name, int hp, int dmg, int armor, int tier, int gold) {
        super(name, hp, dmg, armor, tier, gold);
    }
    
    public int monsterSpecialAttack(Player p) {
        int damage = 0;

        System.out.println("The Wier hisses at you and  release a powerfull electricfield"
                + "it hits you for a great amount of damage");
        damage = this.getMonsterDmg() * 2 - p.getDef();

        return damage;
    }
    
}