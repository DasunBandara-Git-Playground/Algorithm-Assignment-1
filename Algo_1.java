import java.util.Scanner;

public class Algo_1{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num;

        do{
            System.out.print("Enter a positive number : ");
            num = scan.nextInt();
            scan.nextLine();

            if(num<1) System.out.println("Please enter a positive integer");

        }while(num<1);

        int fibonacciNum1 = 0;
        int fibonacciNum2 = 0;
        String fibonacciNumString = "";
        int i = 1;
        do{
            if(i==1){
                fibonacciNum1 = 1;
                fibonacciNumString += fibonacciNum1+", ";
            }
            if(i==2){
                fibonacciNum2 = 1;
                fibonacciNumString += fibonacciNum2+", ";
            }
            if(i>2){
                int temp = fibonacciNum2;
                fibonacciNum2 += fibonacciNum1;
                fibonacciNumString += fibonacciNum2+", ";
                fibonacciNum1 = temp;
            }
            i++;
        }while(i < num+1);
        System.out.println(fibonacciNumString+"\b\b ");
        
    }
}