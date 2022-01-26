public boolean splitArray(int[] nums) {
  return sumEqual(0,0, 0, nums);
}
public boolean sumEqual(int sum1, int sum2, int start, int [] nums){
  if (start >=nums.length)
  return sum1==sum2;
  return (sumEqual(sum1 + nums[start], sum2, start+1, nums)) || (sumEqual(sum1 , sum2 + nums[start], start+1, nums));
  
}
