//Subsequences of String Using BIt Masking OR Using Iterative Approacah
//Time Comp-> O(2^n -1)*(Number of bits) i.e,-> O(2^n -1)*(k), where "k" is the number of bits in a number

public class Main
{
	public static void main(String[] args) {
		
		String s="abcd";
		int to=(int)(Math.pow(2,s.length()))-1;
		
		for(int i=0;i<=to;i++)
		{
		    int q=i;
		    int val=0;
		    while(q>0)
		    {
		        int dig=1 & q;
		        if(dig>0)
		        System.out.print(s.charAt(val));
		        ++val;
		        q>>=1;
		    }
		    System.out.println();
		}
	}
}
