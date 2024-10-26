public class MaximumSumSubArray {

    public static void main(String[] args) {
        int[] myArray = {4,1,-2,-6,6,8,3,0,-5};
        int result = maxSubArray(myArray);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums){

        int maxSoFar= nums[0];
        int currentSum = nums[0];

        for (int i=1;i < nums.length;i++){
            if (currentSum < 0){
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            if (currentSum > maxSoFar){
                maxSoFar = currentSum;
            }

        }
        return maxSoFar;

    }
}
