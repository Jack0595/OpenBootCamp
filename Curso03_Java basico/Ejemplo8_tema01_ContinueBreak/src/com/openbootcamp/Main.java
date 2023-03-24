package com.openbootcamp;

public class Main{
    public static void main(String[] args){
        int count = 0;
        while(count < 10){
            count ++;
            if(count == 6)
                continue;
            if(count == 8)
                break;
            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin");
    }
}