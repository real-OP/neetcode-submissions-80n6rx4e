class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums , 0 , nums.length - 1);
        return nums;
    }
    public void mergeSort(int [] nums , int left , int right){
        if(left >= right)return;
        int mid = (left+right) / 2;

        mergeSort(nums , left , mid);
        mergeSort(nums , mid+1 , right);
        merge(nums , left , mid , right);


    }
    public void merge(int [] nums, int left , int mid , int right){
        int i=left;
        int j=mid + 1;
        int k = 0;

        int [] temp = new int[right - left + 1];
        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = nums[i];
            i++;
            k++;
        }
        while(j <= right){
            temp[k] = nums[j];
            j++;
            k++;
        }
        //// 'temp' holds sorted elements locally, so we must copy them back into 'nums'.
        // Since 'temp' starts at index 0 but 'nums' subarray starts at 'left', 
        // 'left + l' maps the relative index in 'temp' to the exact position in 'nums'.
        for(int l = 0; l<temp.length; l++){
            nums[left + l] = temp[l];
        }


    }
}