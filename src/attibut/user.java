package attibut;

public class user {
    public static String[] inventory;
    public static double[] tot_health,health,exp,ap,ad,ap_ar,ad_ar;
    public static int[] level,energy;

    public user(){
        inventory=new String[4];
        health=new double[4];
        tot_health=new double[4];
        level=new int[4];
        exp=new double[4];
        ad=new double[4];
        ap=new double[4];
        ap_ar=new double[4];
        ad_ar=new double[4];
        energy=new int[4];
    }

    public double health(int id){
        return health[id];
    }

}
