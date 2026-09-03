class Solution {
    // 111524202055 Surendhar L
        public void rotate(int[] nums, int k) {
        k = k%nums.length;
        nums = reverse(nums,0,nums.length-1);
        nums = reverse(nums,0,k-1);
        nums = reverse(nums,k,nums.length-1);
    }
    public static int[] reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
