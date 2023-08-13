import java.util.Arrays;

public class Algo_8 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String union = ""; // numA ∩ numB
        String intersection = ""; // numA ∪ numB
        String relativeComplement_AB = ""; // numA \ numB
        String relativeComplement_BA = ""; // numB \ numA
        String symmetricDifference = ""; // numA △ numB
        
        for (int i = 0; i < numA.length; i++) {
            int count = 0;
            for (int j = 0; j < numB.length; j++) {
                if(numA[i] == numB[j]){
                    union += numA[i] + ", ";
                }else{
                    count++;
                    if(count==numB.length){
                        intersection += numA[i] + ", ";
                        relativeComplement_AB += numA[i] + ", ";
                        symmetricDifference += numA[i] + ", ";
                    }
                }
                if(i==0) intersection += numB[j] + ", ";

            }
        }
        String[] unionArray = union.split(", ");
        for (int i = 0; i < numB.length; i++) {
            int n = 0;
            for (int j = 0; j < unionArray.length; j++) {
                if(numB[i] != Integer.valueOf(unionArray[j])){
                    n++;
                    if(n==unionArray.length){
                        relativeComplement_BA += numB[i]+", ";
                        symmetricDifference += numB[i] + ", ";
                    }
                }
            }
        }

        System.out.println("numA: "+Arrays.toString(numA));
        System.out.println("numB: "+Arrays.toString(numB));
        System.out.println("numA ∩ numB: ["+union+"\b\b]");
        System.out.println("numA ∪ numB: ["+intersection+"\b\b]");
        System.out.println("numA \\ numB: ["+relativeComplement_AB+"\b\b]");
        System.out.println("numB \\ numA: ["+relativeComplement_BA+"\b\b]");
        System.out.println("numA △ numB: ["+symmetricDifference+"\b\b]");

    }
}
