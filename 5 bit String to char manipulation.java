Given a string-> First convert every alphabet to 5 bit string and then-> convert that each 5 bit string to alphabet again
Time Complexity-> O(nlogn)
Space Complexity->O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();

        String res="";
        String totans="";
        for(int q=0;q<s.length();q++)
        {
          int val=convertStrtoBits(s.charAt(q));
          System.out.println(val+"-> ");
          long ans=convertDecToBin(val);
          
          if (val==0||val==1)
          res+="0000"+ans+" ";
          
          else if (val==2||val==3)
          res+="000"+ans+" ";
          
          else if (val>=4 && val<=7)
          res+="00"+ans+" ";
          
          else if(val>=8 && val<=15)
          res+="0"+ans+" ";
          
          //totans+=res+" ";
          
        }
        System.out.println(res);
        
        System.out.println(BitstoString(res));
        
	}
	
	static int convertStrtoBits(char s)
	{
	  int num=s;
	  int r=97;
	  for(;r<=122;r++)
	  {
	   if(r==num)
	   break;
	   
	  }
	  return r-97;
	}
	
	public static long convertDecToBin(int n)
    {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (n!=0)
        {
            remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
    
    static String BitstoString(String s)
    {
        String finalres="";
        String IntermediateString="";
        for(int q=0;q<s.length();q++)
        {
            if(s.charAt(q)==' ')
            {
              int IntermediateStringtointeger=Integer.parseInt(IntermediateString, 2)+97; 
              char b=(char)IntermediateStringtointeger;
              finalres+=b;
              IntermediateString="";
            }
            
            else
              IntermediateString+=s.charAt(q);    
            
        }
        return finalres;
    }
}
