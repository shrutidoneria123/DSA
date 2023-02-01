                                                          ----------leetcode-----
 METHOD 1 -------- brtue force with t(c)=o(n^2) and s(c)=0(n)
                                              class Solution {
                                            public int[] twoSum(int[] nums, int target) {
                                                int[] a = new int[2];
                                                    for(int i=0;i<nums.length;i++){
                                                        for (int j = i + 1; j < nums.length; j++) {
                                                        if (nums[i] + nums[j] == target) {
                                                            a[0] = i;
                                                            a[1] = j;
                                                        }
                                                    }
                                                }
                                                return a;
                                            }
                                        }

METHOD 2---------OPTIMISED SOLUTION --t(c)=o(n). and s(c)=o(n)
                                              import java.util.HashMap;
                                            class Solution {
                                                public int[] twoSum(int[] nums, int target) {
                                                    HashMap<Integer,Integer> map = new HashMap<>();
                                                    {
                                                        for(int i=0;i<nums.length;i++){
                                                            if(map.containsKey(target-nums[i]))
                                                            {
                                                                return new int[]{map.get(target-nums[i]),i};
                                                            }
                                                           map.put(nums[i],i);
                                                        }
                                                        return new int[] {};
                                                    }
                                                    }
                                                }


