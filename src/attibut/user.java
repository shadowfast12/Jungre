package attibut;

public class user {
    public static String[] inventory;
    public static double[] health,level,exp;

    public user(){
        inventory= new String[4];
        health=new double[4];
        level=new double[4];
        exp=new double[4];
    }

    public static int id(String s){
        for(int i=0;i<=monster.champs.length;i++){
            if(monster.champs[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

    public static int ii_id(String s){
        for(int i=0;i< inventory.length;i++){
            if(inventory[i].equals(s)){
                return i;
            }
        }
        return -1;
    }
    public int damage(int id){
        return damage[id];
    }
    public int health(int id){
        return health[id];
    }

}
