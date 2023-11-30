package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt(),s=0;
        for(int i=2; i<=a; i+=2){
            s+=i;
        }
        System.out.println(s);
    }
}
