public class ReverseWords {
    public static void main(String [] args){
        System.out.println(reverseWords("i.love.you"));
    }
    public static String reverseWords(String S){
        String rev="";
        if(S.isEmpty()){
            return rev;
        }
        String[] str=S.split("\\.");
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i];
            if(i!=0){
                rev+=".";
            }
        }
        return rev;

    }
}
