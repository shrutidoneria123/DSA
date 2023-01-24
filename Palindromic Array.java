-----------------------------GFG-----------

class GfG
{
   public static int palinArray(int[] a,int n){
       for(int i=0;i<n;i++){
           int temp=a[i];
           int ans=0;
           while(temp>0){
               int t=temp%10;
               ans=ans*10+t;
              
               temp=temp/10;
           }
           if(ans!=a[i]){
               return 0;
           }
       }
       return 1;
   }}
--------------------------Leetcode------------
  125. Valid Palindrome----   Two pointer approach
                       class Solution {
                          public boolean isPalindrome(String s) {
                              if (s == null) return false;
                              if (s.length() == 1) return true;

                              int left = 0;
                              int right = s.length() - 1;

                              while(left < right) {
                                  char lc = s.charAt(left);
                                  char rc = s.charAt(right);

                                  if (!Character.isLetter(lc) && !Character.isDigit(lc)) {
                                      left++;
                                      continue;
                                  }

                                  if (!Character.isLetter(rc) && !Character.isDigit(rc)) {
                                      right--;
                                      continue;
                                  }

                                  lc = Character.toLowerCase(lc);
                                  rc = Character.toLowerCase(rc);

                                  if (lc != rc) {
                                      return false;
                                  }

                                  left++;
                                  right--;
                              }

                              return true;
                          }
                      } 
