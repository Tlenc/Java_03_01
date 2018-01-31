package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Įveskite skaičių");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a%2==0){
	    System.out.println("Skaičius yra lyginis");
    }else{
	        System.out.println("Skaičius yra nelyginis");
        }
    }
}
