public class Task5 {
    public static void main(String[] args) {
        // Sample Input
        int[] marks = {100, 47, 85, 94, 5, 50};
        String[] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};

        // Bubble Sort logic
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Check if current mark is greater than the next 
                if (marks[j] > marks[j + 1]) {
                    
                    // Swap marks
                    int tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }



        
        System.out.println("Sorted Array:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println(); // New line
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
