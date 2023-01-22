void sortColors(int* nums, int numsSize){

    int temp=0;

    for(int i=0;i<numsSize-1;i++){
        for(int j=0;j<numsSize-1-i;j++){
            if(nums[j+1]<nums[j]){
                temp=nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=temp;
            }
        }
    }
}
