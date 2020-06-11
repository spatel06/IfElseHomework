import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Symbol13 {

    public static void main(String[] args) {

        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator you want(+,-,*,/):");
        ch = sc.next().charAt(0);

        if(ch == '+'){
            System.out.println("\nAddition of " +num1 +"+"+ num2 +"="+(num1 + num2));

        }else if(ch == '-'){
            System.out.println("Substraction of " +num1 +"-"+ num2 +"="+(num1 - num2));

        }else if(ch == '*'){
            System.out.println("Multiplication of " +num1 +"*"+ num2 +"="+(num1 * num2));

        }else if(ch == '/'){
            System.out.println("Divison of " +num1 +"/"+ num2 +"="+(num1 / num2));

        }else{
            System.out.println("Operator is not available");
        }



    }

}
