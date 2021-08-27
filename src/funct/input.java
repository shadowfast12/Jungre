package funct;

import java.util.Scanner;

public class input {
    Scanner in=new Scanner(System.in);

    public String u_input(String s){
        System.out.println(s);
        return(in.next());
    }
}
