class Solution {
    public int removeElement(int[] nums, int val) {
        
        int elem = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[elem] = nums[i];
                elem++;
            }
        }
        return elem;
        
    }
}