package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i< 3; i++) {
            int a = scan.nextInt();
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}
