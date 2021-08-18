package main;

import attibut.monster;
import attibut.user;
import funct.altern;

public class main {
    public static void main(String[] args){
        monster m = new monster();
        user u = new user();
        altern a=new altern();

        a.add("Drago",1);
        a.c_health("Drago",13);

        System.out.print(u.health(0));
    }

}
