public class SCharityLib {

    public static boolean isPalindrome(String word){
        int n= word.length();
        for(int i=0; i< (n/2); i++){
            if(word.charAt(i) != word.charAt(n-1-i))
                return false;
        }
        return true;
    }
    public static String dateStr(String jazz){
        String month= jazz.substring(0,2);
        String day=jazz.substring(3,5);
        String year=jazz.substring(6);
        return (day + "-" + month + "-" + year );
    }


   //ublic static String vigCipher(String Message, String Key){
      //for(int i=0;i<Message.length();i++){
         // return Key;
    //  }


















}
