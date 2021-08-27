package funct;

import attibut.monster;

public class damage {

    //damage output with armor
    public double damg_put(String s, double ap,double ad,double ap_arm,double ad_arm){
        double ap_ar=ap_arm/200;
        double ad_ar=ad_arm/200;
        double base_dm= monster.damg_base[monster.id(s,monster.abilities)];

        return (ap*(ap_ar))+(ad*(ad_ar))+(base_dm*(ap_ar))+(base_dm*(ad_ar));
    }

    public double ability_out(String c,int abil,double a,double[] ar){
        return (ar[(monster.id(c,monster.champs)*3)-(3-abil)])*a;
    }
}
