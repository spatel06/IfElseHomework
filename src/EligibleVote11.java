import java.util.Scanner;

public class EligibleVote11 {

    public static void main(String args[]){

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age");
        age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible for vote");

        }else{
            System.out.println("You are not eligible for vote");
        }
    }
}
