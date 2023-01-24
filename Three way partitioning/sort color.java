                                                                  GFG
class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
         int n = array.length;
         
         
             int l=0; int h = n-1;
             for(int i=0;i<=h;)
         {
             if(array[i]<a)
             {
                 int temp = array[l];
                 array[l]=array[i];
                 array[i]=temp;
                 l++;
                 i++;
                 
             }
             else if(array[i]>b)
             {
                 int temp=array[h];
                 array[h]=array[i];
                 array[i]=temp;
                 h--;
             }
             else 
             {
                 i++;
             }
         }
    }
}
---------------------------------------Leetcode----------------------------
  class Solution {
    public void sortColors(int[] nums) {
    int low=0,mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0)
            {
                swap(nums,low++,mid++);
            }
            else if (nums[mid]==2)
            {
                swap(nums,mid,high--);
            }
            else
            {
                mid++;
            }
        }
    }
    public void swap(int[] nums, int p1,int p2)
    {
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}
