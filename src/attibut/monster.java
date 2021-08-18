package attibut;

public class monster {

    public static String[] champs,abilities;
    public static double[] ap_d,ad_d, Health,damg_base,ap_ar,ad_ar;

    public monster(){
        champs= new String[]{"Drago", "Yargo"};
        abilities=new String[]
                {"Punch","Fire Spit","Fire Dash",
                        "Kick","Rock Clap","Ground Slam"};
        Health= new double[]{40d,33d};
        ap_d=new double[]{.1,1,.8,.1,.7,.2};
        ad_d=new double[]{.9,0,.2,.9,.3,.8};
        damg_base=new double[]{3,5,10,4,6,8};
        //out of the base 200 armor ap/ad
        ap_ar=new double[]{18,22};
        ad_ar=new double[]{24,24};
    }
    public double Health(int id){
        return Health[id];
    }
    public int abil_id(String s){
        for(int i=0;i<=abilities.length;i++){
            if(s.equals(abilities[i])){
                return i;
            }
        }
        return -1;
    }
    public double damg_put(double ap,double ad,double ap_arm,double ad_arm){
        return (ap*(ap_arm/200))+(ad*(ad_arm/200));
    }

}
