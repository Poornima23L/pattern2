package com.tgt.ignite.plus;

import java.util.Scanner;

public class star_tri {
    public static void main(String[] args){
        int i,j,n;
        Scanner read= new Scanner(System.in);
        System.out.println("enter n");
        n = read.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=n-i;j>1;j--){
                System.out.print(" " );
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
