package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
