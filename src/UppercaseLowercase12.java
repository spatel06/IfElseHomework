import java.util.Scanner;

public class UppercaseLowercase12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;
        int temp;
        System.out.println("Enter a character in Upper case");
        ch = sc.next().charAt(0);

       temp = (int)ch;
        temp = temp + 32;
        ch = (char)temp;
        System.out.println("Lower case is :" + ch);



    }

    }

