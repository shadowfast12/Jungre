package funct;

import attibut.monster;

public class damage {

    //damage output with armor
    public double damg_put(int id, double ap,double ad,double ap_arm,double ad_arm){
        double ap_ar=ap_arm/200;
        double ad_ar=ad_arm/200;
        double base_dm= monster.damg_base[id];

        return (ap*(ap_ar))+(ad*(ad_ar))+(base_dm*(ap_ar))+(base_dm*(ad_ar));
    }
}
