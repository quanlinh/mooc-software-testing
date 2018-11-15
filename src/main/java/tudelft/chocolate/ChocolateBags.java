package tudelft.chocolate;

public class ChocolateBags {
    // small 200: big 2: total 100
    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5; // 100 / 5 => 20

        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big; // 2
        total -= (bigBoxesWeCanUse * 5); // 190

        if(small < total) // 200 < 190 => NO.
            return -1;
        return total;

    }

}
// 1) The total is higher than the amount of small and big bars
// small = 1, big = 2; total is 50
// 2) the small bar not enough
// small = 2; big 1; total is 2
// 3) Big bar is enough
// small 11; big is 5; 10
// 4) the box is use up both big and small bars
// small 4; big is 2: total 13
