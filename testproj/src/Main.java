// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Solution{
    int numBits(int n){
        int numOfOneBits = 0;
        for(int i = 0; i < 32; i++){
            if(((n >> i) & 1) == 1){
                numOfOneBits++;
            }
        }
        return numOfOneBits;
    }

    int[] countBits(int n){
        int arr[] = new int[n+1];
        for(int i = 0; i <= n; i++){
            arr[i] = numBits(i);
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] numbers = {1,2,3,4,5,6,7};
        for(int num : numbers) {
            System.out.println("Iteration " + num);
        }
    }
}