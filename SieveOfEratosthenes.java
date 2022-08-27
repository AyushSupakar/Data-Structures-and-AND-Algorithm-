package com.company;
// Print all the Prime Numbers from 1 to N;
import java.util.*;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] a = new boolean[N+1];
        a[0]=false;
        a[1]= true;
        for (int i = 2; i<N+1;i++){
            a[i]= true;
        };
        for(int i =2; i*i<=N;i++){
            if(a[i]==true){
                for (int j= i*i;j<=N;j=j+i){
                    a[j]= false;
                }
            }
        }
        System.out.println("\n");
        for(int i = 2;i<=N;i++){
            if(a[i]==true){
                System.out.print(i + " ");
            }
        }


    }
}
