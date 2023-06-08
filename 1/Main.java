import java.util.Scanner;

class Main {
    
    public static void main(String args[]) {
        int n;
        
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        
        n = S.nextInt();
        if(n % 2 == 0) {
            System.out.println("The given number "+n+" is Even ");
        } else {
            System.out.println("The given number "+n+" is Odd ");
        }
        S.close();

    }
};
