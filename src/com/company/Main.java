package com.company;

import Uzdaviniai.LyginisNelyginis;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite skaičių");
        Scanner sc = new Scanner(System.in);
        int _a = sc.nextInt();

        LyginisNelyginis objektas = new LyginisNelyginis();
        objektas.set_a(_a);
        System.out.println("Skaičius : " + objektas.get_a());
        objektas.skaiciuok();
    }
}
