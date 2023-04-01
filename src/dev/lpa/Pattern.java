package dev.lpa;

public class Pattern {
    public static void main (String[]args){

        for(int i = 1 ; i<=6 ; i++){

            if (i==3){
                continue;
            }

            for(int j = 1 ; j<=i ; j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

