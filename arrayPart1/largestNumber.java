import java.util.*;
public class largestNumber {

    public static int findLargest(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number : " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int nums[] = {1,2,6,3,5};
        System.out.println("Largest number : " + findLargest(nums));
    }
}
