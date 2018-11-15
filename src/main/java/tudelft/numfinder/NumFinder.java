package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        if(nums == null) return;
        for (int n : nums) {
// fix the bug that cause by the incomplete if else case
            if (n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;

        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}
// Leap year: divisible by for not divisible by 100
// Leap year: divisible by 4 and divisible by 100 but divisible by 400

//Not leap year:  not divide by 4
// Non leap year: divide by  4 and divide  by 100 not divisible by 400