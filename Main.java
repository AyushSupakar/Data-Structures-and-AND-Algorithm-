package com.company;
import java.util.*;
//Print all the divisors of a Number

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt()  ;
        int i=1;
        while(i*i<=N){
            if(N%i==0){
                System.out.print(i+ " ");
            }
            i++;
        }
        while(i>=1){
            if(N%i==0){
                System.out.print(N/i+ " ");
            }
            i--;
        }

    }
}
