import java.util.Scanner;

public class InterchangeNum5 {
    int res = 0;
    public  void reverseMethod(int number) {

       // int res = 0;
       int rem;
       if(number != 0){
           rem = number % 10 ;
           res = (res * 10) + rem;
           number = number / 10;
           reverseMethod(number);
       }else{
           System.out.println("reverse of a number is :" + res);

       }

    }

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");

       int x = sc.nextInt();
       InterchangeNum5 r = new InterchangeNum5();
      r.reverseMethod(x);
        


    }




}

