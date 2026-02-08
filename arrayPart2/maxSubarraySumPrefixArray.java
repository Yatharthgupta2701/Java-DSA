package arrayPart2;
import java.util.*;
public class maxSubarraySumPrefixArray {

    public static void maxSumPrefix(int nums[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        //Calculate Prefix Array :
        prefix[0] = nums[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        // Claculate Max Sub Array :
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {1, -2, 6, -1, 3};
        maxSumPrefix(nums);
    }
}
