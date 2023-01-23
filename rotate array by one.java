                                                      GFG
One Method --Two pointer Approch
                   class Compute {

                    public void rotate(int arr[], int n)
                    {

                        int low = 0;
                        int high = arr.length-1;
                           while(low != high)
                       {
                          int temp = arr[low];
                         arr[low] = arr[high];
                         arr[high] = temp;
                         low++;
                       }
                    }
                }
Second method --
                      class Compute {

                        public void rotate(int arr[], int n)
                        {

                           int x = arr[arr.length-1];//store the last element
                           for (int i = arr.length-1; i > 0; i--)
                              arr[i] = arr[i-1];  //Shift all elements one position ahead. 
                           arr[0] = x;  //Replace first element of array with x.
                        }
                    }
                                                    Leetcode
first method--
                                                      
                                                      class Solution 
                                      {
                                          public void rotate(int[] nums, int k) {
                                             k=k%nums.length;
                                             reverse(nums,0,nums.length-1);
                                             reverse(nums,0,k-1);
                                             reverse(nums,k,nums.length-1);
                                          }
                                         public void reverse(int[] arr,int i , int j ){
                                              while(i<j){
                                                  int temp = arr[i];
                                                  arr[i]=arr[j];
                                                  arr[j]=temp;
                                                  i++;
                                                  j--;
                                              }
                                          }
                                      }

                        
