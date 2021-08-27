package main;

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
        a.add(0,"Yargo");
        a.add(1,"Electroid");
        System.out.println(at.insights(1));
    }

}
