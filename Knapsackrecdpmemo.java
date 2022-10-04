







public class Knapsackrecdpmemo {
   
    static int knapsackrec(int wt[],int val[],int w,int n,int dp[][])
    {
        if(n==0||w==0)
        return 0;
        if(dp[n][w]!=-1)
         return dp[n][w];

        if(wt[n-1]<=w)
        {
            return dp[n][w]=Math.max(val[n-1]+knapsackrec(wt, val, w-wt[n-1], n-1,dp),knapsackrec(wt, val, w, n-1,dp));
        }
        else
        return dp[n][w]=knapsackrec(wt, val, w, n-1,dp);
    }
    public static void main(String[] args) {
        int wt[]={10,20,30};
        int val[]={60,100,120};
        int w=50;
        int n=3;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
        for(int j=0;j<w+1;j++)
         dp[i][j]=-1;
       int ans=knapsackrec(wt, val, w, n,dp);
       System.out.println(ans);

    }
    
}
