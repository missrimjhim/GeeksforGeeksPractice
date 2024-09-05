
import java.util.Stack;
//TC:O(N) as we traversing over the entire string,N=no.of charatcers in string
//SC:O(N) in worst case scenario the string can contain all the characters of the string, for example :((((
public class ParanthesisChecker {
    public static boolean ispar(String X){
        boolean f=false;
        if(X.isEmpty()){
            return true;
        }
        Stack<Character> iss=new Stack<>();
        for(int i=0;i<X.length();i++) {
            if (X.charAt(i) == '[' || X.charAt(i) == '{' || X.charAt(i) == '(') {
                iss.push(X.charAt(i));
                //System.out.println(iss.peek());
            }
            if(X.charAt(i) == ']' || X.charAt(i) == '}' || X.charAt(i) == ')'){
                if(iss.isEmpty()){
                    return false;
                }
                else{
                    if (X.charAt(i) == ']' && iss.peek() == '[' || X.charAt(i) == '}' && iss.peek() == '{' || X.charAt(i) == ')' && iss.peek() == '(') {
                        iss.pop();
                    }
                    else
                        return false;
                }
            }

        }

        return iss.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ispar("{}{(}))}"));
    }
}