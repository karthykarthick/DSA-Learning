package Arrays;

public class search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,55,44,66,44,22};
        int res = search(arr,66,0,10);
        System.out.println(res);
    }
    static int  search(int[] arr,int target,int start,int end){
        int max = arr[0];
        for (int i = start; i <=end ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
