package AssignmentArray;
import java.util.*;
public class question1 {

    public static boolean isDuplicate(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(isDuplicate(nums));
    }
}
