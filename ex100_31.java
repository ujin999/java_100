package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=  scan.nextInt();
        if(a>=90)System.out.println("A");
        else if(a>=70)System.out.println("B");
        else if(a>=40)System.out.println("C");
        else System.out.println("D");
    }
}
