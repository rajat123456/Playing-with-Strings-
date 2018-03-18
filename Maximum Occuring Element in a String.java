class Main
{
  public static void main(String[]args)
   {
     String s="Rajat Rawat";
     int max_count=1;
     char max_char=s.charAt(0);
 
     for(int i=0;i<s.length();i++)
      {
         int cur_count=1;
         for(int j=i+1;j<s.length();j++)
          {
            if(s.charAt(i)==s.charAt(j))
            ++cur_count;
          }
         
          if(cur_count>max_count)
              {
                max_count=cur_count;
                max_char=s.charAt(i);
              }
      }
  
      System.out.println(max_count);
      System.out.println(max_char);
   }
}