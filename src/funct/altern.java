package funct;

import attibut.monster;
import attibut.user;

public class altern {

    public void add(String s,int i){
        user.inventory[i-1]=s;
        user.damage[i-1]= monster.Damage[user.id(s)];
        user.health[i-1]= monster.Health[user.id(s)];
    }
    public int c_health(String s,int d){
        user.health[user.ii_id(s)]+=d;
        return user.health[user.ii_id(s)];
    }
}
