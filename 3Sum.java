class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        Arrays.sort(nums);
        int size = nums.length;
        int lt = 0;
        int rt = 0;
        for(int i=0;i<=size-3;i++){
            if(nums[i] > 0) break;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            lt = i+1;
            rt = size-1;
            while(lt < rt){
                int sum = nums[i] + nums[lt] + nums[rt];
                if(sum == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[lt]);
                    triplet.add(nums[rt]);
                    outerList.add(triplet);
                    while(lt < size-1 && nums[lt] == nums[lt+1]){
                        lt++;
                    }
                    lt++;
                }
                else if(sum > 0){
                    rt--;
                }else{
                    lt++;
                }
            }
            // if(i != 0 && nums[i] == nums[i-1]) continue;
        }
        return outerList;
    }
}