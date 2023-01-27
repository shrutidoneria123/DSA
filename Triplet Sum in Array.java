GFG------------
Method 1 --- brute force with complexity o(n3)
                          class Solution
                          {
                              //Function to find if there exists a triplet in the 
                              //array A[] which sums up to X.
                              public static boolean find3Numbers(int A[], int n, int X) { 

                                 // Your code Here
                                 for(int i=0;i<n-2;i++)
                                 {
                                     for(int j =i+1;i<n-1;j++)
                                     {
                                         for(int k=j+1;i<n;k++)
                                         {
                                             if(A[i]+A[j]+A[k]== X)
                                             {
                                               //System.out.println("Triplet is" +A[i]+","+A[j]+","+A[k]) ;
                                               return true;
                                             }

                                         }
                                     }
                                 }
                                 return false;

                              }
                          }
                          
Method 2---    Hashing 
                                  class Solution
                                  {
                                      //Function to find if there exists a triplet in the 
                                      //array A[] which sums up to X.
                                      public static boolean find3Numbers(int A[], int n, int X) { 

                                         // Your code Here
                                         for(int i =0;i<n;i++){
                                             HashSet<Integer> hs = new HashSet<>();
                                             int sum = X-A[i];
                                             for(int j=i+1;j<n;j++){
                                                 if(hs.contains(sum-A[j])){
                                                     return true;
                                                 }
                                                 hs.add(A[j]);
                                             }
                                         }
                                         return false;
                                      }
                                  }
