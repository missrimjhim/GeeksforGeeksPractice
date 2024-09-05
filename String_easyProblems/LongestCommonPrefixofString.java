public class LongestCommonPrefixofString {
    public static void main(String[] args){
        Solution ob =new Solution();

        String[] arr={"geeks","geek","geeksforgeeks","geezer"};
        System.out.println(ob.longestCommonPrefix(arr));
    }
}
class Solution {
    public static String minString(String s1,String s2){
        int min=Math.min(s1.length(),s2.length());
        String res="";
        for(int i=0;i<min;i++){
            if(s1.charAt(i)!=(s2.charAt(i)))
                break;

            else
                res+=s1.charAt(i);
        }
        return res;
    }
    public String longestCommonPrefix(String arr[]) {
        // code here
        String res="";
        String res1="";
        if(arr.length==1){
            return arr[0];
        }
        for(int i=1;i<arr.length;i++){
            res=arr[0];
            res1=minString(res,arr[i]);
        }
        if(res.isEmpty())
            return "-1";
        return res1;
    }
}
