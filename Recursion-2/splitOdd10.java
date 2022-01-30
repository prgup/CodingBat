/*
Less Verbal Approch

public boolean splitOdd10(int[] nums) {
  return checkSplit(0,0, nums, 0);
}
boolean checkSplit(int sumC, int oddC, int [] nums, int length ){
  if (length >= nums.length)
    return (sumC%10)==0 && oddC%2==1;
  
  return (checkSplit(sumC+nums[length], oddC, nums, length+1)|| checkSplit(sumC, oddC+nums[length], nums, length+1));
}
*/