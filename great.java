package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class great
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner r=new Scanner(System.in);
        int b=r.nextInt();
        for(int i=0;i<b;i++){
            int a[];
            int odd;
            int even;
            even=0;
            int s=r.nextInt();
            a=new int[s];
            int c=r.nextInt();
            for(int j=0;j<s;j++){
                a[j]=r.nextInt();
            }
            for(int j=0;j<10;j++){
                if(a[j]>c) {
                    even++;
                }
            }
            System.out.println(even);
        }
    }
}

