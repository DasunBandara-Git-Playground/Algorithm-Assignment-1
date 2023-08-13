import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String inputSent;
        do{
            System.out.print("Enter the sentence : ");
            inputSent = scan.nextLine().strip()+" ";

            if(inputSent.isBlank()) System.out.println("Your input is empty");

        }while(inputSent.isBlank());
        int min = inputSent.length();
        int max = 0;
        String wordString = "";
        String shortString = "";
        String longString = "";
        for (int i = 0; i < inputSent.length(); i++) {
            if(inputSent.charAt(i) == ' '  && !wordString.isBlank()){
                if(max<wordString.length()){
                    max = wordString.length();
                    longString = wordString;
                }
                if(min>wordString.length()  && !wordString.isBlank()){
                    min = wordString.length();
                    shortString = wordString;
                }
                wordString = "";
            }
            if(inputSent.charAt(i) != ' ') wordString += inputSent.charAt(i);
            
        }
        System.out.println("Shortest word in the sentence is \""+shortString+"\" and it's length is "+min);
        System.out.println("Longest word in the sentence is \""+longString+"\" and it's length is "+max);
    }
}
