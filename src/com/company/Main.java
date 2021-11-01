package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] drob = {2.3,6.5,7.8,-4.5,-10.3,45.7,-9.1,62.5,-3.2,31.5,51.8,-65.7,1.9,9.9,6.4};
        System.out.println(Arrays.toString(drob)); // это вроде не просят но я добавил что бы себе было понятнее

        double summa = 0;
        double kolvo = 0;
        boolean isOtr = false;
        
        for (double ariPoloj : drob){
            if (ariPoloj < 0) {
                isOtr = true;
            } else { if (isOtr){
                    kolvo ++;
                    summa += ariPoloj;

                }
            }
        }
        System.out.println("среднее арифметическое положительных чисел = " + summa/kolvo);




    }
}
