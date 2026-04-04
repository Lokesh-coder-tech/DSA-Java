                           //conditionals
import java.util.Scanner;
public class Day05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take age input and print if he/she is eligible to vote or not
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("You are not eligible for give the vote");
        }else{
            System.out.println("You are eligible for give the vote");
        }

        //Take input 5 subject’s marks and print the overall percentage of student.
        System.out.println("Enter five subjects numbers- ");
        int hindi = sc.nextInt();
        int english = sc.nextInt();
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int sanskrit = sc.nextInt();

        if(hindi > 0 && hindi <=100 &&
            english > 0 && english <=100&&
                maths > 0 && maths <=100&&
                 science > 0 && science <=100&&
                  sanskrit > 0 && sanskrit <=100) {

            int total = hindi + english + maths + science + sanskrit;
            double result = total / 5.0;

            System.out.println(result);
        }else{
            System.out.println("Invalid marks entered");
        }

        //Take input a lowercase character and print its uppercase version
        System.out.println("Please enter a lowerCase character");

        char ch1 = sc.next().charAt(0);
        if(ch1 >= 'a' && ch1 <= 'z'){
            char upper = (char)(ch1 - 32 );
            System.out.println( "upperCase:" + upper);
        }else{
            System.out.println("Enter a valid lowercase character");
        }

        //Take input a uppercase character and print its lowercase version
        System.out.println("Please enter a upperrCase character");

        char ch2 = sc.next().charAt(0);
        if(ch2 >= 'A' && ch2 <= 'Z'){
            char lower = (char)(ch2 + 32 );
            System.out.println( "lowerCase:" + lower);
        }else{
            System.out.println("Enter a valid upperCase character");
        }

        //Take input 5 subject’s marks, drop the least one and calculate the overall percentage considering only the top 4 marks, print it.
        System.out.println("enter marks of five subjects");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        int min = s1;
        if(s2 < min) min = s2;
        if(s3 < min) min = s3;
        if(s4 < min) min = s4;
        if(s5 < min) min = s5;

        int total = s1 + s2 + s3 + s4 + s5;

        int newTotal = total - min;

        double result = newTotal / 4.0 ;

        System.out.println(result);
    }
}
