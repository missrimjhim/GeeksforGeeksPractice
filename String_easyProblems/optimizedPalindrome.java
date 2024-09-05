public class optimizedPalindrome {
    //aeiiea
    //TC: O(N) since we are traversing the string once
    //SC: O(1) since no extra space is used
    public static int isPalindrome(String S) {
        // code here
        int n=S.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                return 0;
            }
            else{
                i++;
                j--;
            }
        }
        return 1;

    }
    public static void main(String[] args){
        System.out.println(isPalindrome("aeiiea"));
    }
}
