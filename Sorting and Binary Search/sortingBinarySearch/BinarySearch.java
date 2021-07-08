package sortingBinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] seq, int target){
        int start = 0;
        int end = seq.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            int mid_val = seq[mid];

            if (mid_val == target){
                return mid;
            } else if (target < mid_val){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 3, 65, 7, 2, 12, 32, 14, 9, 5, 87};
        int target = 9;

        int[] sortedArr1 = QuickSort03.quickSort03(arr1, 0, arr1.length - 1);
        System.out.println("Starting Binary Search");

        if (binarySearch(sortedArr1, target) != -1){
            System.out.print("The target is at index: " + binarySearch(sortedArr1, target) + "\n");
        }   else {
            System.out.println("The target is not in the array");
        }

        System.out.println("Binary Search Finished");
    }
}
