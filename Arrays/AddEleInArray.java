public class AddEleInArray {

    // Insert at beginning
    public static int[] insertBeginning(int[] nums, int ele) {
        int[] arr = new int[nums.length + 1];

        arr[0] = ele;

        for (int i = 0; i < nums.length; i++) {
            arr[i + 1] = nums[i];
        }

        return arr;
    }

    // Insert at end
    public static int[] insertAtEnd(int[] nums, int ele) {
        int[] arr = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        arr[nums.length] = ele;

        return arr;
    }

    // Insert at position (1-based index)
    public static int[] insertAtPosition(int[] nums, int ele, int pos) {
        int[] arr = new int[nums.length + 1];

        // 1. Copy before position
        for (int i = 0; i < pos - 1; i++) {
            arr[i] = nums[i];
        }

        // 2. Insert element
        arr[pos - 1] = ele;

        // 3. Copy remaining elements
        for (int i = pos - 1; i < nums.length; i++) {
            arr[i + 1] = nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // int[] res1 = insertBeginning(nums, 10);
        // int[] res2 = insertAtEnd(nums, 20);
        int[] res3 = insertAtPosition(nums, 99, 3);

        // Print
        for (int x : res3) {
            System.out.print(x + " ");
        }
    }
}