package garcia;
class Strings 
{
public static void main(String...args)
{
	  String input="1234567879";
	  int Threshold=10;
	  StringBuffer a=new StringBuffer("");
	  int sum=0;
	  String k="";
	  int i;
	  for(i=0;i<input.length();i++)
	  {
		sum+=Integer.parseInt(input.charAt(i)+"");
		if(sum>Threshold)
		{
			a.append(sum);
			Threshold=sum;
			sum=0;
		}
		
		else if(sum<=Threshold && i==input.length()-1)
		{
			a.append(sum);
			Threshold=10;
			sum=0;
		} 
	  }
	  System.out.println("Reduced String: "+a);
	  
	  System.out.println();
	  int j;
	  String m=new String(a);
	  StringBuffer b=new StringBuffer("");
	  for(j=0;j<m.length();j++)
	  {
		sum+=Integer.parseInt(m.charAt(j)+"");
		if(sum>Threshold)
		{
			b.append(sum);
			Threshold=sum;
			sum=0;
		}
		
		else if(sum<=Threshold && j==b.length()-1)
		{
			b.append(sum);
			Threshold=10;
			sum=0;
		} 
	  }
	  System.out.println("Reduced String: "+b);
	 
	  System.out.println();
	  int l;
	  String f=new String(b);
	  StringBuffer q=new StringBuffer("");
	  for(l=0;l<f.length();l++)
	  {
		sum+=Integer.parseInt(f.charAt(l)+"");
		if(sum>Threshold)
		{
			q.append(sum);
			Threshold=sum;
			sum=0;
		}
		
		else if(sum<=Threshold && l==b.length()-1)
		{
			q.append(sum);
			Threshold=10;
			sum=0;
		} 
	  }
	  System.out.println("Reduced String: "+q);
	  
	 
	  
	  
	  
}
}  