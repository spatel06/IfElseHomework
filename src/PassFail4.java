import java.util.Scanner;

public class PassFail4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");

        int studentMarks = sc.nextInt();
        if(studentMarks >=35){
            System.out.println("pass");

        }else{
            System.out.println("Fail");
        }
    }
}
