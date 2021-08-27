package funct;

import attibut.ai_monst;
import attibut.monster;
import attibut.user;

public class attack {

    public static boolean block=false;
    damage d=new damage();
    input in=new input();
    public String insights(int i){
        String s="";
        for(int x=1;x<=3;x++){
            s+=("Ability "+x+" : "+monster.abilities[(monster.id(
                    user.inventory[i], monster.champs)*3)+(x-1)]+" : "+x*20+"\n");
        }
        return ("Name : "+user.inventory[i]+"\nHealth : "+user.health[i]+
                "/"+user.tot_health[i]+ "\nEnergy : "+user.energy[i]+"\n"+s);
    }

    public int use_abi(int e,int cost){
        if(e>=cost){
            return cost;
        }
        return -1;
    }

    public void ai_move(String mc,String uc){
        int m_id=monster.id(mc,ai_monst.inventory);
        int u_id=monster.id(uc, user.inventory);
        for(int i=60;i>=0;i-=20){
            if(ai_monst.energy[m_id]>=i){
                user.health[u_id]-=d.damg_put(mc,d.ability_out(mc,
                                i/20,ai_monst.ap[monster.id(mc,ai_monst.
                                        inventory)],monster.ap_d),
                        d.ability_out(mc,
                                i/20,ai_monst.ad[monster.id(mc,
                                        ai_monst.inventory)],monster.
                                        ad_d), user.ad_ar[u_id],
                        user.ad_ar[u_id]);
                break;
            }
            else{
                block=true;
            }

        }
    }
    public void p_move(String uc,String mc){
        String get=in.u_input("Ability : ");
        if(in.u_input("").equals("1")){

        }
    }
}
