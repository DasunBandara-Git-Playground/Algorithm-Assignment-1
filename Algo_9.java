import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String inputWord;
        boolean boolFlag = false;
        do{
            System.out.print("Enter a word : ");
            inputWord = scan.nextLine().strip();
            if(inputWord.isBlank()) System.out.println("Your input is blank");
            else{
                boolFlag = false;
                for (int i = 0; i < inputWord.length(); i++) {
                        if(inputWord.charAt(i)==' '){
                            System.out.println("You can only input a single word");
                            boolFlag = true;
                            break;
                    }
                }
            }
        }while(boolFlag || inputWord.isBlank());

        int count = 0;
        for (int i = 0; i < inputWord.length()/2; i++) {
            if((inputWord.charAt(i)+"").equalsIgnoreCase(inputWord.charAt(inputWord.length()-1-i)+"")){
                count++;
            }
        }
        if(count==inputWord.length()/2){
            System.out.println("The word \""+inputWord+"\" is a palindrome");
        }else{
            System.out.println("The word \""+inputWord+"\" is not a palindrome");
        }
    }
}