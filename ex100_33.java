package practice;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char a=  scan.next().charAt(0);
        switch((a%12)/3) {
            case 0:
                System.out.println("winter");
                break;
            case 1:
                System.out.println("spring");
                break;
            case 2:
                System.out.println("summer");
                break;
            case 3:
                System.out.println("fall");
                break;
        }
    }
}
