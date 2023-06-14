package Arrays;

public class max_arr {

  public static void main(String[] args) {
    int arr[] = { 1000, 20, 300, 40, 50 };
    System.out.println(max(arr, 0, 4));
  }

  static int max(int[] arr, int start, int end) {
    int max = arr[start];
    for (int i = start; i <= end; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
