package funct;

import attibut.ai_monst;
import attibut.monster;

public class attack {

    public int use_abi(int e,int cost){
        if(e>=cost){
            return cost;
        }
        return -1;
    }

    public double block(double d){
        return d/2;
    }

    public void ai_move(String s){
        if(ai_monst.energy[monster.id(s,ai_monst.inventory)]>=60){

        }
    }

}
