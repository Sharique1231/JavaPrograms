





public class Subarray {
    public static void main(String []args) {
        int arr[]={1,2,3,4,5};
        printsubarray(arr,0,0);
    }
        //program to print all subarray
        //iteratively
      /*   int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int n=a.length;
        for(int s=0;s<n;s++)
        {
            for(int e=s;e<n;e++)
            {
                for(int k=s;k<=e;k++)
                {
                    System.out.print(a[k]+" ");
                }
                
                System.out.println("");
            }
            
        }*/ 
        static void printsubarray(int arr[],int s,int e)
        {
            if(e==arr.length)
            return;
            else{
                if(s>e)
                printsubarray(arr,0,e+1);
                else{
                    for(int i=s;i<=e;i++)
                    {
                        System.out.print(arr[i]);
                    }
                    System.out.println();
                    printsubarray(arr,s+1,e);
                }
            }
        }
        
        
    
    
}
