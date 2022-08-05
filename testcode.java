package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class testcode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner r=new Scanner(System.in);
        int b=r.nextInt();
        for(int i=0;i<b;i++){
            int a[];
            int odd;
            int even;
            odd=0;
            even=0;
            int s=r.nextInt();
            a=new int[2*s];
            for(int j=0;j<2*s;j++){
                a[j]=r.nextInt();
            }
            for(int j=0;j<2*s;j++){
                if(a[j]%2==0){
                    even++;
                }
                if(a[j]%2!=0){
                    odd++;
                }
            }
            if (odd>even){
                System.out.println((odd-even)/2);
            }
            if(even>odd){
                System.out.println((even-odd)/2);
            }
            if(even==odd){
                System.out.println(0);
            }
        }
    }
}