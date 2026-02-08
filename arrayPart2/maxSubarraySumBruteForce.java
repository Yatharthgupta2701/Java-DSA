package arrayPart2;
import java.util.*;
public class maxSubarraySumBruteForce {
    public static void maxSubArray(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    // Sum of Sub Array :
                    currSum += nums[k];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum : " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {1,-2,6,-1,3};
        maxSubArray(nums);
    }
}
