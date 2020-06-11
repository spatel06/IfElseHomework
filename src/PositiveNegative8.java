import java.util.Scanner;

public class PositiveNegative8 {

    public static void main(String[] args){

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        number = sc.nextInt();
        sc.close();

        if(number>0){
            System.out.println(number + "is positive number");

        }else if(number<0){
            System.out.println(number + "is negative number");

        }else{
            System.out.println(number + "is neither positive nor negative");
        }


    }
}
