public class BinarySearch {
        public static int binarySearch(int[] arr, int target, int low, int high) {
            if (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return mid; // Element found
                } else if (arr[mid] < target) {
                    return binarySearch(arr, target, mid + 1, high);
                } else {
                    return binarySearch(arr, target, low, mid - 1);
                }
            }

            return -1; // Element not found
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int target = 5;
            int result = binarySearch(array, target, 0, array.length - 1);

            if (result != 1) {
                System.out.println("Element found at: " + result);
            } else {
                System.out.println("Element does not exist.");
            }
        }
    }
