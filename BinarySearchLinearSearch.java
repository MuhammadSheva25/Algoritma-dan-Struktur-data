import java.util.Arrays;

public class BinarySearchLinearSearch {
  
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;

        long startTime = System.nanoTime();
        int linearSearchIndex = linearSearch(arr, target);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        int binarySearchIndex = binarySearch(arr, target);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Linear Search:");
        if (linearSearchIndex != -1) {
            System.out.println("Element found at index " + linearSearchIndex);
        } else {
            System.out.println("Element not found");
        }
        System.out.println("Execution time: " + linearSearchTime + " nanoseconds");

        System.out.println();

        System.out.println("Binary Search:");
        if (binarySearchIndex != -1) {
            System.out.println("Element found at index " + binarySearchIndex);
        } else {
            System.out.println("Element not found");
        }
        System.out.println("Execution time: " + binarySearchTime + " nanoseconds");

        System.out.println();

        System.out.println("Tracking:");
        System.out.println("Time spent on linear search: " + linearSearchTime + " nanoseconds");
        System.out.println("Time spent on binary search: " + binarySearchTime + " nanoseconds");
        System.out.println("Difference in time: " + (linearSearchTime - binarySearchTime) + " nanoseconds");
    }


    public static int linearSearch(int[] arr, int target) {
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("Linear search time for index " + i + ": " + elapsedTime + " nanoseconds");
                return i;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Linear search time: " + elapsedTime + " nanoseconds");

        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        long startTime = System.nanoTime();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                System.out.println("Binary search time: " + elapsedTime + " nanoseconds");
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Binary search time: " + elapsedTime + " nanoseconds");

        return -1;
    }
}
