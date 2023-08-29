package tests.leetCode;

public class MostWater {
    public static void main(String[] args) {
        System.out.println("this is to calculate most water");

        System.out.println(maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int res = -1;
        // set up pointers
        int l = 0, r = height.length - 1;

        while (r > l) {
            int area = Math.min(height[l], height[r]) * (r - l);
            // System.out.println(area);
            if (area > res) res = area;
            if (height[l] > height[r]) r--;
            else l++;
        }

        return res;
    }
}


