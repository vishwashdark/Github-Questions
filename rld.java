import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class rld
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner (System.in);
        int greater;
        greater=10;
        int d[];
        d=new int[4];
        for(int i=0;i<4;i++){
            d[i]=s.nextInt();
        }
        for(int i=0;i<4;i++){
            if(d[i]>10){
                greater++;
            }
        }
        System.out.println(greater);

        // your code goes here
    }
}
