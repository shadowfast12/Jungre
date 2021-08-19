package funct;

import attibut.monster;
import attibut.user;

public class altern {

    //add monster to user inventory
    public void add(String s,int i){
        user.inventory[i]=s;
        user.health[i]= monster.Health[user.id(s)];
        user.tot_health[i]=monster.Health[user.id(s)];
        user.level[i]=1;
        user.exp[i]=0;
        user.ap[i]=0;
        user.ad[i]=0;
    }
    //alter the stats of the user monster
    public void change(){

    }

    public double c_health(String s,int d){
        user.health[user.ii_id(s)]+=d;
        return user.health[user.ii_id(s)];
    }
    public void level_up(int id){

    }
}
