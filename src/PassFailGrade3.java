import java.util.Scanner;

public class PassFailGrade3 {

    public static void main(String[] args) {

        float total = 0,avg;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("student name");
        ch = sc.next().charAt(0);
        System.out.println("Roll no");
        int i = sc.nextInt();


        int marks[] = new int[3];
        for(i=0;i<3;i++){
            System.out.println("Enter marks of subject "+ (i+1) +":");
            marks[i] = sc.nextInt();
            total = total +marks[i];
        }sc.close();

        avg = total/3;

        System.out.println("The student grade is : ");
        if(avg>=80){
            System.out.println("Student grade is A+");

        }else if(avg >=60 && avg <80){
            System.out.println("Student grade is A");

        }else if(avg >=50 && avg < 60){
            System.out.println("Student grade is B");

        }else if(avg >=35){
            System.out.println("Student grade is C");

        }else{
            System.out.println("Fail");
        }


    }
     }













