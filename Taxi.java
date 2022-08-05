package com.company;
import java.util.Scanner;
import java.util.Scanner.*;
public class Taxi {
    public static void main(String[] args){
        Scanner r= new Scanner(System.in);
        int a=r.nextInt();
        for(int i=0;i<a;i++){
            int b=r.nextInt();
            int c=r.nextInt();
            if(b<c){
                System.out.println("First");
            }
            else if(b>c){
                System.out.println("Second");
            }
            else{
                System.out.println("Any");
            }
        }
    }
}
