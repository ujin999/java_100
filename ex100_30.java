package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i< 1; i++) {
            int a = scan.nextInt();
            if(a>=0){
                System.out.println("plus");
            }
            else{
                System.out.println("minus");
            }
            if(a%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
