public class LastIndexof1 {
    public static void main(String[] args){
        String s="00101101000";
        System.out.print(lastIndex(s));
    }
    public static int lastIndex(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(max<i){
                    max=i;
                }
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}
