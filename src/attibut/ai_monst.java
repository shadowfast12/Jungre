package attibut;

public class ai_monst {
    public static String[] inventory;
    public static int[] level,energy;
    public static double[] health,ap,ad,ap_ar,ad_ar;

    public ai_monst(){
        inventory= new String[4];
        health=new double[4];
        level=new int[4];
        ad=new double[4];
        ap=new double[4];
        ad_ar=new double[4];
        ap_ar=new double[4];
        energy=new int[4];
    }
    public void set(int id,String s,int l){
        inventory[id]=s;
        health[id]=monster.health[monster.id(s,monster.champs)];
        level[id]=l;
        ap[id]=l*3;
        ad[id]=l*3;
        ad_ar[id]=monster.ad_ar[monster.id(s,monster.champs)];
        ap_ar[id]=monster.ap_ar[monster.id(s,monster.champs)];
    }

}
