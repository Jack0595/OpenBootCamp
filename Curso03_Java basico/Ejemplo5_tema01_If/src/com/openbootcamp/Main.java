package com.openbootcamp;

public class Main {
    public static void main(String[] args){
        boolean check = 5 < 10;

        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 100;

        if(number1 < number2 && number2 < number3){
            System.out.println("Verdadero");
            System.out.println("Verdadero");
        }
        else if (number3 < number4){
            System.out.println("ELse if");
        }
        else{
            System.out.println("nada");
        }
        System.out.println("Fin");
    }
}