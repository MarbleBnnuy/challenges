class Solution {
    public int[] twoSum(int[] nums, int target) {

        int valueOne = 0;
        int valueTwo = 0;
        int[] output = new int[2];

        // go through the array adding two integers at a time
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // have a way to compare added integers to target
                valueOne = nums[i];
                valueTwo = nums[j];
                int temp = valueOne + valueTwo;
                if (temp == target) {
                    // get positions of integers after they add up to target

                    output[0] = i;
                    output[1] = j;

                    // output two positions in an array 

                    return output;
                }

            }
        }

        return null;
    }
}
