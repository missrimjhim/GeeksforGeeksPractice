public class LeftRotation {
    public static void main(String[] args){
        int[] arr={-1,-2,3,4,-5,6,-7,-8};
        leftRotate(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void leftRotate(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        //Left_rotation
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        //rightrotation
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);


    }
    static void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
