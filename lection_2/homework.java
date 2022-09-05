package lection_2;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("number: ");
        String number = iScanner.nextLine();
        Integer num = Integer.parseInt(number);
        System.out.println(recursion(num));
        iScanner.close();
    }

    static int recursion(int num){
        if(num<=1){
            return num;
        }else{
            return num+recursion(num-1);
        }
    }
}
