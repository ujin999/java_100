package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a;
        do{
            a = scan.nextInt();
            if(a%2==0)System.out.println(a);
        }while(a!=0);

    }
}
