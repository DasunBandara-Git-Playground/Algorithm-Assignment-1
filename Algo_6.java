import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence;
        do{
            System.out.print("Input your sentence : ");
            sentence = scan.nextLine().strip();
            if(sentence.isBlank()) System.out.println("Your sentence is empty");

        }while(sentence.isBlank());
        
        String reverseSentence = "";
        String temp = "";
        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i) == ' '){
                reverseSentence = temp + " " +reverseSentence;
                temp = "";
            }
            if(sentence.charAt(i) != ' ')temp += sentence.charAt(i);
        }
        reverseSentence = temp + " " +reverseSentence;
        System.out.println(reverseSentence);
    }
}
