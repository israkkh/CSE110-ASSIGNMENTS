public class Task3 {
    public static void print_elements(int[] arr, int idx) {
        if (idx >= arr.length)
            return; // base case
        System.out.println(arr[idx]);
        print_elements(arr, idx + 1); // jump to next index
    }

}
