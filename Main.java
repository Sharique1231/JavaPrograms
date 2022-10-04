



import java.util.*;
public class Main
{ public static int romanToInt(String s) {
	HashMap<String,Integer> h=new HashMap<>();
			h.put("I",1);
			h.put("V",5);
			h.put("X",10);
			h.put("L",50);
			h.put("C",100);
			h.put("D",500);
			h.put("M",1000);
			int sum=0;
			int n=s.length();
			if(n>0)
			{
			for(int i=0;i<n;i++)
			{
				if(i!=n-1 && h.get(s.charAt(i))<h.get(s.charAt(i+1)))
				{    sum+=h.get(s.charAt(i))+h.get(s.charAt(i+1));
				i++;
				}
				else
					sum+=h.get(s.charAt(i));
			}
		   }         
			return sum;
}
	public static void main(String[] args) 
	{
		String s="III";
		int ans=romanToInt(s);
		System.out.println(ans);
	}
	
}
	
