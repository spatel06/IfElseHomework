import java.util.Scanner;

public class SalaryBasic9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sales;
        System.out.println("please input your total sales for the year");
        sales = sc.nextDouble();
        if(sales >= 50000){
            System.out.println("sales commission is :- " + sales *  35 / 100);

        }else if(sales >= 30000){
            System.out.println("sales commission is " +sales * 20/100);

        }else if(sales >= 20000){
            System.out.println("sales commission is " +sales *20/ 100);

        }else if(sales >= 10000){
            System.out.println("sales commission is " +sales *5/ 100);

        }else if(sales < 10000){
            System.out.println("sales commission is " +sales * 2/100);

        }else{
            System.out.println("discard");
        }


    }
}
