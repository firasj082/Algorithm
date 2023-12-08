/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoa_1;

/**
 *
 * @author firas
 */
public class AlgoA_1 {

public static long Recursive(int n){
if (n<=1)
    return 1;
return n*Recursive(n-1);
}

public static long Iterative(int n){
    long x=1;
for(int i=1;i<=n;i++){
x*=i;
}
return x;}

    public static void main(String[] args) {
     long start;
     long stop;
     double TimeR;
     double TimeIter;
     int[] x={10,20,30,40,50,60};
       System.out.println("\t\t\t      Time\t\t\t\tTimeDiff\n\nNum\t\tRecurisve\t\tIterative");
       for (int i = 0; i < x.length; i++) {
           System.out.print(x[i]+"\t\t");
           start=System.nanoTime();
           Recursive(x[i]);
            stop=System.nanoTime();
            TimeR=((stop-start)/1000000.0);
            System.out.print(TimeR+"\t\t\t");
            start=System.nanoTime();
           Iterative(x[i]);
            stop=System.nanoTime();
            TimeIter=((stop-start)/1000000.0);
            System.out.println(TimeIter+"\t\t\t"+(TimeR-TimeIter)+" Seconds");
        }
       

    }
}
