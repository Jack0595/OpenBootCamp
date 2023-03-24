package com.openbootcamp;

public class Main {
    public static void main(String[] args) {

        holaMundo();

        holaMundo("Jose");

        System.out.println(devolverHola());
    }

    private static void holaMundo(){
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }
    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }
    private static String devolverHola(){
        return "Hola nuevo mundo";
    }
}