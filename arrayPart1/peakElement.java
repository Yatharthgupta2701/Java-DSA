public class peakElement {

    public static int PeakElement(int nums[]){
        int peakIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[peakIndex]){
                peakIndex = i;
            }
        }
        return peakIndex;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(PeakElement(nums));
    }
}
