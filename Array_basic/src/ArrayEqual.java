import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayEqual {
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[]arr2={2,2,3};
        System.out.println(check(arr1,arr2));
    }
    public static boolean check(int[] arr1, int[] arr2) {
        boolean f=false;
        if(arr1.length!= arr2.length){
            return false;
        }
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
        }
        //System.out.print(map1);
        for(int num: arr2){
            if(!map1.containsKey(num)){
                return false;
            }
            map1.put(num,map1.get(num)-1);
            if(map1.get(num)==0){
                map1.remove(num);
            }
        }

        return map1.isEmpty();

    }
}
