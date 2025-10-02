public class PalindromeChecker {

    public boolean isPalindrome(String str){
        str = str.toLowerCase();
        str = str.replace(",", "");
        str = str.replace(" ", "");

        char[] charray = str.toCharArray();

        for(int i = 0; i < charray.length -1; i++){
            if(charray[i] != charray[charray.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
