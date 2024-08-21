public class palindromeornot {
    
    public boolean palornot(String word){

        char[] arrayDemo =word.toCharArray();

        int start = 0;
        int end = word.length()-1;

        while(start<end){
            if(arrayDemo[start] != arrayDemo[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        
        palindromeornot p =new palindromeornot();
        
        if(p.palornot("madam")){
            System.out.println("this string is palindrome");
        }else{
            System.out.println("this string is not palindrome");
        }
    }
}
