
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public static int sumDigits(int n)
    {
        if (n < 10)
        {
            return n;
        }
        return n%10 + sumDigits(n/10);
    }
            
    public static int triangle(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n + triangle(n-1);
    }
    
    public static String binaryConvert(int n)
    {
        if (n < 2)
        {
            return "" + n;
        }
        return "" + binaryConvert(n/2) + n%2;
    }
    
    public static String convert(int n, int b)
    {
        if (n < b)
        {
            return Integer.toHexString(n).toUpperCase();
        }
        return "" + convert(n/b, b) + Integer.toHexString(n%b).toUpperCase();
    }
    
    public static boolean isPalindrome(String s, int length)
    {
        if (length <= 0)
        {
            return true;
        }
        return s.charAt(0) == s.charAt(length-1) && isPalindrome(s.substring(1, length), length-2);
    }
    
    public static int thing(int[] arr, int r)
    {
        
        if (arr.length == r || r == 0)
        {
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++)
//            {
//                sum += arr[i];
//            }
//            System.out.println(sum);
            return 1;
        }
        else
        {
            int[] shortened = Arrays.copyOfRange(arr, 1, arr.length);
            return thing(shortened, r-1) + thing(shortened,r);
        }
    }
    
}
