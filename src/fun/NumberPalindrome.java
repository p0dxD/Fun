package fun;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class NumberPalindrome {
    private static boolean isPalindrome = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the number in a range of an int: ");
        int number = Math.abs(input.nextInt());
        int length = ((int)Math.log10(number)+1);//e.g. log(1234)~3 + 1 = 4
        int index = length-1;
        int[] numbers = new int[length];
        while(number>0){
            numbers[index] = number%10;
            number = number/10;
            index--;
        }
        System.out.println("Is palindrome? "+isPalindrome(numbers,length));
    }
    /**
     * Tells whether the number is palindrome or not
     * @param array to check for
     * @param length of original array
     * @return true if it is else false
     */
    private static boolean isPalindrome(int[] array, int length){
        int size = array.length-1;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]==array[size]){
                index++;
            }
            size--;
        }
        isPalindrome = (index==length);
        return isPalindrome;
    }
}
