package renew;
import java.util.Scanner;

public class ReNew{
    Scanner input = new Scanner(System.in);
    
    // This is the method for Addition, Code By: QUEL
    public void addition(){
        int num1Add, num2Add, sum;
        
        System.out.println("Enter 2 numbers to add");
        System.out.print("First Number: ");
        num1Add = input.nextInt();
        System.out.print("Second Number: ");
        num2Add = input.nextInt();
        sum = num1Add + num2Add;
        
        System.out.println("The sum is: " + sum);
    }
    
    // This is the method for Subtraction
    
    /*write your code here!*/
    
    
    
    // This is the method for Multiplication
    
    /*write your code here!*/
    
    
    
    // This is the method for Division
    
    /*write your code here!*/
    
    
    
    public static void main(String[]Args){
        ReNew object = new ReNew();
        object.addition(); //calling the method addition
    }
}