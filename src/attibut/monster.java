package attibut;

public class monster {
    //todo add special abilities (stuns, sleep, armor up, etc)
    public static String[] champs,abilities;
    public static double[] ap_d,ad_d, health,damg_base,ap_ar,ad_ar;

    public monster(){
        champs= new String[]{"Drago", "Yargo","Electroid","Gaswart"};
        abilities=new String[]
                {"Punch","Fire Spit","Fire Dash",
                        "Kick","Rock Clap","Ground Slam",
                "Punch","Spark","Thunderbolt",
                "Expand","Cough","Atomic Burst"};
        health= new double[]{50d,43d,45d};
        ap_d=new double[]{.1,1,.8,.1,.7,.2,.1,.8,.9};
        ad_d=new double[]{.9,0,.2,.9,.3,.8,.9,.2,.1};
        damg_base=new double[]{6,8,13,7,9,11,6,10,15};
        //out of the base 200 armor ap/ad
        ap_ar=new double[]{18,22,16};
        ad_ar=new double[]{24,24,17};
    }
    // id finder
    public static int id(String s,String[] ar){
        for(int i=0;i<ar.length;i++){
            if(ar[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

}
