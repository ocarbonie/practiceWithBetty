package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int[] negativeArray= new int[5];

        int[] positiveArray= new int[5];

        int posInput, negInput;

        for(int i=0;i<5;i++){
            System.out.println("Enter a positive number");
            posInput=input.nextInt();
            positiveArray[i]=posInput;

            System.out.println("Enter a negative number");
            negInput=input.nextInt();
            if(negInput<0) {
                negativeArray[i] = negInput;
            }
            else{
                System.out.println("You need to put in a negative number ");
                negInput=input.nextInt();
                negativeArray[i]=negInput;

            }
        }

        for(int x: positiveArray){
            System.out.println(x);
        }
        for(int y: negativeArray){
            System.out.println(y);
        }

        ArrayList<String> colors= new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        for(String x : colors){
            System.out.println(x+"------------------");
        }
        colors.set(1,"Megenta");

        for(String y: colors){
            System.out.println(y);    //Print after repalcing the second color(index 1) which was blue
        }

        int entry,sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter a number: ");
            entry=input.nextInt();
            sum += entry;

        }

        System.out.println(sum);
    }


    }

