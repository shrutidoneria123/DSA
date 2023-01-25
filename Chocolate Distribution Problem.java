-----------------GFG----------------
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i =0;i<=n-m;i++)
        {
            int ans = a.get(i+m-1)-a.get(i);
            if(min>ans)
            min=ans;
        }
        return min;
    }
}
