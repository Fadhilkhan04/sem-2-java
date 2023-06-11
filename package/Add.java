package mypack;
import java.util.Scanner;

public class Add{
  public void sum(){

    System.out.println("Enter the first number : ");
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();

    System.out.println("Enter the second number : ");
    Scanner scans = new Scanner(System.in);
    int y = scans.nextInt();

    int s = x+y;
    System.out.println(" The sum is : "+s);
    

  }
};
