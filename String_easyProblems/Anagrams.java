import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args){
       // System.out.println(isAnagram("ant","tan"));
        System.out.println(IsAnagram("ant","tan"));

    }
    public static boolean IsAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0,j=0;i<a.length()&&j<b.length();i++,j++){
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i),0)+1);
            map2.put(b.charAt(j),map2.getOrDefault(b.charAt(j),0)+1);
            System.out.println(map1);
            System.out.println(map2);

        }
        if(map1.equals(map2))
            return true;
        else
            return false;
    }
    public static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }

        char [] ch1=a.toCharArray();
        char [] ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String p=new String(ch1);
        String q= new String(ch2);
        if(p.equals(q))
            return true;
        else
            return false;


    }
}
