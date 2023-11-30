package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(),b = scan.nextInt();
        int k = 1;
        for(int i=1; i<=b; i++)k*=2;
        System.out.printf("%d",a*k);
    }
}
