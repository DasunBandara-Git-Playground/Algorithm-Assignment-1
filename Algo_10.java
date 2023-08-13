import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String phoneNum;
        boolean boolFlag = false;
        do{
            System.out.print("Enter your phone number : ");
            phoneNum = scan.nextLine().strip();

            if(phoneNum.isBlank()) System.out.println("Telephone number can't be empty");
            else{
                if(phoneNum.charAt(0)=='+' && phoneNum.length()==12){
                    int count = 0;
                    boolFlag = false;
                    for (int i = 1; i < phoneNum.length(); i++) {

                        if(Character.isDigit(phoneNum.charAt(i))){
                            count++;
                        }
                    }
                    if(count != 11){
                        System.out.println("Invalid phone number...");
                        boolFlag = true;
                    }


                }else if(phoneNum.charAt(0)=='0' && phoneNum.charAt(3)=='-' && phoneNum.length()==11){
                    int count = 0;
                    boolFlag = false;
                    for (int i = 1; i < phoneNum.length(); i++) {
                        if(phoneNum.charAt(i)=='-') continue;
                        if(Character.isDigit(phoneNum.charAt(i))){
                            count++;
                        }
                    }
                    if(count != 9){
                        System.out.println("Invalid phone number...");
                        boolFlag = true;
                    }

                }else{
                    System.out.println("Invalid phone number...");
                    boolFlag = true;
                }
            }

        }while(boolFlag || phoneNum.isBlank());
        System.out.println("Number is validated...");
    }
}
