/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner r=new Scanner(System.in);
        int b=r.nextInt();
        int a[];
        int odd;
        int even;
        odd=0;
        even=0;
        a=new int[2*b];
        for(int i=0;i<2*b;i++){
            a[i]=r.nextInt();
        }
        for(int i=0;i<2*b ;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if (odd>even){
            System.out.println((odd-even)/2);
        }
        else if (odd<even){
            System.out.println((even-odd)/2);
        }
        else{
            System.out.println(0);
        }
    }
}
