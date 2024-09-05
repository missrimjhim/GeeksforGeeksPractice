import java.util.ArrayList;

public class ArrayReverseinGroups {
    public static void main(String[]args){
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(4L);
        arr.add(5L);

        reverseInGroups(arr,3);
        System.out.print(arr);


    }
    static void reverseInGroups(ArrayList<Long> arr, int k) {
        int N=arr.size();
        for(int i=0;i<N;i=i+k){
            int low=i;
            int high=i+k-1;
            if(high>N-1){
                high=N-1;
            }
            swap(arr,low,high);
        }
    }
    static void swap(ArrayList<Long> arr, int low, int high){
        while(low<high){
            long temp=arr.get(low);
            arr.set(low,arr.get(high));
            arr.set(high,temp);
            low++;
            high--;
        }
    }
}
