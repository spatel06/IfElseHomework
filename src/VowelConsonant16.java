import java.util.Scanner;

public class VowelConsonant16 {

    public static void main(String[] args){

        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == ' '){

            System.out.println("Given character is an vowel");

        }else{

            System.out.println("Given character is a consonant");

        }

        }
    }


