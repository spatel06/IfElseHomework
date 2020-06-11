import java.util.Scanner;

public class Employee6 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee ID ");
        int ID = sc.nextInt();

        System.out.println("Enter employee name");
        String name = sc.next();

        System.out.println("Enter basic salary of employee");
        int salary = sc.nextInt();

        int HRA = salary*10/100;
        System.out.println("HRA " + HRA);

        int DA = salary*8/100;
        System.out.println("DA " +DA);

        int TA = salary*9/100;
        System.out.println("TA " +TA);

        int PF = salary*20/100;
        System.out.println("PF " +PF);

        int GS = salary+HRA+DA+TA-PF;
        System.out.println("Gross salary " +GS);


        }


    }
