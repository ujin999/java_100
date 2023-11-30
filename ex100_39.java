package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int mini = 2000000000;
        for(int i=0; i<3; i++){
            int a = scan.nextInt();
            if(a<mini)mini = a;   
        }
        System.out.println(mini);
    }
}
