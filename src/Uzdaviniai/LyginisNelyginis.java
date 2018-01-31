package Uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {
    public LyginisNelyginis(){
        System.out.println("Įveskite skaičių");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Skaičius yra lyginis");
        } else {
            System.out.println("Skaičius yra nelyginis");
        }

    }
}
