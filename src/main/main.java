package main;

import attibut.ai_monst;
import attibut.monster;
import attibut.user;
import funct.altern;
import funct.attack;

public class main {
    public static void main(String[] args){
        monster m= new monster();
        user u= new user();
        altern a=new altern();
        attack at=new attack();
        ai_monst ai=new ai_monst();

        a.add(0,"Yargo");
        ai.set(0,"Electroid",1);
        at.battle("Yargo","Electroid");
    }

}
