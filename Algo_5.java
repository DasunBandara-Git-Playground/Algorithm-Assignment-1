import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String inpuString = "";
        do{
            System.out.print("Enter the text : ");
            inpuString = scan.nextLine().strip();

            if(inpuString.isBlank()) System.out.println("Your input is wrong");

        }while(inpuString.isBlank());

        String reverseString = "";

        for (int i = inpuString.length()-1; i >= 0; i--) {
            reverseString += inpuString.charAt(i);
        }
        System.out.println(reverseString);



    }
}
