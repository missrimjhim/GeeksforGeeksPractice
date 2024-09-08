public class minand2ndminfromArray {
    public static void main(String[] args){
        int[] arr={2,4,3,5,7,-1,9};
        int[] res=new int[2];
        res= minAnd2ndMin(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }

    }
    public static int[] minAnd2ndMin(int arr[]) {
        // code here
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1){
                min2=arr[i];
            }
        }
        int[] res={min1,min2};
        if(min2==Integer.MAX_VALUE){
            res[0]=-1;
            res[1]=-1;
        }
        return res;
    }
}
