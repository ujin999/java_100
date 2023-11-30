package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long k = 0;
        for(int i=0; i<3; i++)k+=scan.nextInt();
        System.out.printf("%d\n%f",k,(float)k/3);
    }
}
