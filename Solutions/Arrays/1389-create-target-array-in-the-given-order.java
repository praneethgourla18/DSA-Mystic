class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int j=0;j<nums.length;j++){
            target[j]=list.get(j);
        }
        return target;   
        }
        
    }