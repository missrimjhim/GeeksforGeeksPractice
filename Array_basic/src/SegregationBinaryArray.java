public class SegregationBinaryArray {
    public static void main(String[] args){
        int [] arr={1,0,0,1,1,1,0,0,0,1,1,1,0};
        binSort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void binSort(int A[], int N) {
        // add your code here
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] == 0) {
                i++;
            } else if (A[j] == 1) {
                j--;
            } else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
}
