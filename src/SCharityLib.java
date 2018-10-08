/**
 * Sage Charity Period 9
 */
public class SCharityLib {
    /**
     * This code checks if a string is a palindrome.
     * @param word The string that is being checked.
     * @return True if the string is a palindrome and false if the string is not.
     */
    public static boolean isPalindrome(String word){
        int n= word.length();
        for(int i=0; i< (n/2); i++){
            if(word.charAt(i) != word.charAt(n-1-i))
                return false;
        }
        return true;
    }

    /**
     *This string changes the order and format of the date the user inputs.
     * @param jazz The date the user inputs in mm/dd/yyyy format.
     * @return The date is returned in dd-mm-yyyy format.
     */
    public static String dateStr(String jazz){
        String month= jazz.substring(0,2);
        String day=jazz.substring(3,5);
        String year=jazz.substring(6);
        return (day + "-" + month + "-" + year );
    }


    public static boolean primeLooker(int num){
        for(int i=2; i < num;i++){
            if(num%i == 0){
                return false;
            }

            }

        return true;
    }

    /**
     * Prints a list of prime numbers. The length varies based on the input.
     * @param num The number of prime numbers being printed.
     */
    public static void primePrinter(int num){
        int holder = 0;
        int primenum = 2;
        while ( holder < num)
        {
            if(primeLooker(primenum))
            {
                System.out.println(primenum);
                holder ++;
            }
            primenum ++;
        }
    }

    /**
     * This code find the sum of all the numbers from 0 to the number the user inputs including the input number.
     * @param n The number the user wants to find the sum up to.
     * @return The sum of the numbers between 0 and the input n.
     */
    public static int sumUpTo(int n)
    {
        int w = 0;
        for (int i = 0;i<= n;i++){
             w= w+i;
        }
        return (w);
    }

    /**
     * This code finds the least common multiple of three numbers the user inputs.
     * @param num1 One of the numbers that you have to find the lcm of.
     * @param num2 One of the numbers that you have to find the lcm of.
     * @param num3 One of the numbers that you have to find the lcm of.
     * @return The least common multiple of the three numbers.
     */
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int i=1;
        while((i%num1!=0)||(i%num2!=0)||(i%num3!=0))
        {
            i++;
        }
        return i;
    }













}
