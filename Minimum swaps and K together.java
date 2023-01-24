Method 1---- brute force 
              1--first count all the element less than or equal to k
              2-Now traverse for every sub-array and swap those elements whose value is greater than k. The time complexity of this approach is O(n2)
Method 2 ----- Two pointer approach with time complexiry of O(N)
                 
                      class Complete{


                          // Function for finding maximum and value pair
                          public static int minSwap (int arr[], int n, int k) {
                              //Complete the function
                             int count = 0;
                          for (int i = 0; i < n; ++i)
                          if (arr[i] <= k)
                              ++count;

                          // Find unwanted elements in current
                          // window of size 'count'
                          int bad = 0;
                          for (int i = 0; i < count; ++i)
                          if (arr[i] > k)
                              ++bad;

                          // Initialize answer with 'bad' value of
                          // current window
                          int ans = bad;
                          for (int i = 0, j = count; j < n; ++i, ++j) {

                          // Decrement count of previous window
                          if (arr[i] > k)
                              --bad;

                          // Increment count of current window
                          if (arr[j] > k)
                                  ++bad;

                              // Update ans if count of 'bad'
                              // is less in current window
                              ans = Math.min(ans, bad);
                              }
                              return ans;
                          }
                          }


