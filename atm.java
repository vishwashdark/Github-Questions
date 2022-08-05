package com.company;
import java.util.Scanner;
import java.lang.*;
public class atm {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        String s;
        s="";
        for (int i=0;i<p;i++){
            int n=sc.nextInt();
            int a[];
            a=new int[n];
            int k=sc.nextInt();
            for(int j=0;j<n;j++){
                int sd=sc.nextInt();
                if(k>=sd){
                    s += "1";
                    k=k-sd;
                }
                else
                    s += "0";

            }
        }
        System.out.println(s);
    }
}
