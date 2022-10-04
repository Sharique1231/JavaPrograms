









public class Knapsackrecursive {
   static int knapsackrec(int wt[],int val[],int w,int n)
    {
        if(n==0||w==0)
        return 0;
        if(wt[n-1]<=w)
        {
            return Math.max(val[n-1]+knapsackrec(wt, val, w-wt[n-1], n-1),knapsackrec(wt, val, w, n-1));
        }
        else
        return knapsackrec(wt, val, w, n-1);
    }
    public static void main(String[] args) {
        int wt[]={10,20,30};
        int val[]={60,100,120};
        int w=50;
        int n=3;
       int ans=knapsackrec(wt, val, w, n);
       System.out.println(ans);

    }
    
}
