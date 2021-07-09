package Array;

public class mountains {
    private static boolean mountain(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]){
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]){
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 7, 6, 3, 1};

        System.out.println("The array is a valid mountain:");
        System.out.println(mountain(arr1));
    }
    
}
