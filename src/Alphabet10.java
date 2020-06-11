import java.util.Scanner;

public class Alphabet10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet from a to f");

        char ch = sc.next().charAt(0);

        if(ch == 'a'){
            System.out.println("Agra");

        }else if(ch == 'b'){
            System.out.println("Bombay");

        }else if(ch == 'c'){
            System.out.println("chennai");

        }else if(ch == 'd'){
            System.out.println("Delhi");

        }else if(ch == 'e'){
            System.out.println("England");

        }else if(ch == 'f'){
            System.out.println("Finland");

        }else{
            System.out.println("Invalid entry");
        }





    }
}
