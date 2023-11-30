package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Boolean a = scan.nextBoolean();
        a = !a;
        System.out.println(a);
    }
}
