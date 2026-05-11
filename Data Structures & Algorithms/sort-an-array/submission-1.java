class Solution {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    void mergeSort(int[] nums, int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        // Sort left half
        mergeSort(nums, left, mid);

        // Sort right half
        mergeSort(nums, mid + 1, right);

        // Merge both halves
        merge(nums, left, mid, right);
    }

    void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare elements from both halves
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Remaining elements from right half
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy temp back into original array
        for (int m = 0; m < temp.length; m++) {
            nums[left + m] = temp[m];
        }
    }
}