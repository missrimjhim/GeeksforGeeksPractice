public class reverseString {
    //TC: O(N) as we are traversing over the entire the length of the string
    //SC: O(1) since we are not using any extra space
    public static void main(String[] args){
        System.out.println("Reversed String: "+reverse("geeks"));
    }
    public static String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
