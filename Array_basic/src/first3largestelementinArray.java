public class first3largestelementinArray {
    //TC: O(N)
    //SC:O(N)
    public static void main(String[]args){
        int[] arr={10,15,15,5,1,1,5};
        System.out.println(thirdLargest(arr));
    }
    static int thirdLargest(int arr[]) {
        // Your code here
        int n=arr.length;
        if(n<3){
            return -1;
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2&&arr[i]!=max1){
                max3=max2;
                max2=arr[i];
            }
            else if(arr[i]>max3 &&arr[i]!=max2&& arr[i] != max1){
                max3=arr[i];

            }

        }
        return max3==Integer.MIN_VALUE?-1: max3;
    }

}
