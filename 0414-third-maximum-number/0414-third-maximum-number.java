class Solution {
    public int thirdMax(int[] nums) {
        long largest=Long.MIN_VALUE;
        long SecondLarg=Long.MIN_VALUE;
        long ThirdLarg=Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                ThirdLarg=SecondLarg;
                SecondLarg=largest;
                largest=nums[i];
            } else if(nums[i]>SecondLarg && nums[i]<largest){
                ThirdLarg=SecondLarg;
                SecondLarg=nums[i];
            } else if(nums[i]>ThirdLarg && nums[i]<SecondLarg){
                ThirdLarg=nums[i];
            }
        }
        if(ThirdLarg==Long.MIN_VALUE) return (int)largest;
        return (int)ThirdLarg;
        // int ans=0;
        // int count=1;
        // int max=Integer.MIN_VALUE;
        // Arrays.sort(nums);
        // if(nums.length==1) return nums[0];
        // if(nums.length==2) return nums[1];
        // for(int i=nums.length-2; i>=0; i--){
        //     if(nums[i]!=nums[i+1]){
        //         count++;
        //     }
        //     if(count==3){
        //         ans=nums[i];
        //     }
        // }
        // if(count!=3) return nums.length-1;
        // return ans;
    }
}