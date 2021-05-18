package com.helloworld;

import java.util.Arrays;
import java.util.Scanner;
public class TicTac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = new String[9];
        String replace;

        boolean condition1 = true;

        int counter = 0;
        int blankSpace = 9;

        Arrays.fill(input, " ");

        System.out.println("---------");
        System.out.println("| " + input[0] + " " + input[1] + " " + input[2] + " |");
        System.out.println("| " + input[3] + " " + input[4] + " " + input[5] + " |");
        System.out.println("| " + input[6] + " " + input[7] + " " + input[8] + " |");
        System.out.println("---------");

        while(condition1){
            try{
                System.out.print("Enter the coordinates: ");
                String x = scanner.next();
                String y = scanner.next();
                int x3 = 0;
                int x1 = Integer.parseInt(x);
                int x2 = Integer.parseInt(y);

                if (x1 == 1) {
                    x3 = x2 - x1;
                } else if (x1 == 2) {
                    x3 = x1 + x2;
                } else if (x1 == 3) {
                    x3 = x1 + x2 + 2;
                }

                if(counter % 2 == 0){
                    replace = "X";
                } else {
                    replace = "O";
                }

                if(x1 > 3 || x1 < 1 ||x2 > 3 || x2 < 1){
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (input[x3] == " ") {
                    input[x3] = replace;
                    System.out.println("---------");
                    System.out.println("| " + input[0] + " " + input[1] + " " + input[2] + " |");
                    System.out.println("| " + input[3] + " " + input[4] + " " + input[5] + " |");
                    System.out.println("| " + input[6] + " " + input[7] + " " + input[8] + " |");
                    System.out.println("---------");
                    counter++;
                    blankSpace--;
                } else if (input[x3] != " "){
                    System.out.println("This cell is occupied! Choose another one!");
                }

                boolean xWins1 = input[0] == "X" && input[1] == "X" && input[2] == "X";
                boolean xWins2 = input[3] == "X" && input[4] == "X" && input[5] == "X";
                boolean xWins3 = input[6] == "X" && input[7] == "X" && input[8] == "X";
                boolean xWins4 = input[0] == "X" && input[4] == "X" && input[8] == "X";
                boolean xWins5 = input[2] == "X" && input[4] == "X" && input[6] == "X";
                boolean xWins6 = input[0] == "X" && input[3] == "X" && input[6] == "X";
                boolean xWins7 = input[1] == "X" && input[4] == "X" && input[7] == "X";
                boolean xWins8 = input[2] == "X" && input[5] == "X" && input[8] == "X";

                boolean xWins = xWins1 || xWins2 || xWins3 || xWins4 || xWins5 || xWins6 || xWins7 || xWins8;

                boolean oWins1 = input[0] == "O" && input[1] == "O" && input[2] == "O";
                boolean oWins2 = input[3] == "O" && input[4] == "O" && input[5] == "O";
                boolean oWins3 = input[6] == "O" && input[7] == "O" && input[8] == "O";
                boolean oWins4 = input[0] == "O" && input[4] == "O" && input[8] == "O";
                boolean oWins5 = input[2] == "O" && input[4] == "O" && input[6] == "O";
                boolean oWins6 = input[0] == "O" && input[3] == "O" && input[6] == "O";
                boolean oWins7 = input[1] == "O" && input[4] == "O" && input[7] == "O";
                boolean oWins8 = input[2] == "O" && input[5] == "O" && input[8] == "O";

                boolean oWins = oWins1 || oWins2 || oWins3 || oWins4 || oWins5 || oWins6 || oWins7 || oWins8;


                if(xWins){
                    System.out.println("X wins");
                    condition1 = false;
                }else if (oWins){
                    System.out.println("O wins");
                    condition1 = false;
                }else if (blankSpace == 0){
                    System.out.println("Draw");
                    condition1 = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
        }
    }
}
