import java.util.ArrayList;
import java.util.List;

public class Valueequaltoindexvalue {
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>();
        arr.add(15);
        arr.add(2);
        arr.add(12);
        arr.add(4);
        Valueequaltoindexvalue v=new Valueequaltoindexvalue();
        System.out.println(v.valueEqualToIndex(arr));

    }
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
