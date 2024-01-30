package com.cap;
import java.util.Scanner;

	
	
	class StringPlay {
	  String unique;
	  String duplicate;
	  String vowel;

	  public StringPlay() {

	  }
	}
	class StringMethods{
	  public String getUnique(StringPlay sp,String str) {
	      String temp="";
	      for(int i=0;i<str.length();i++)
	      {
	          int count=0;
	          for(int j=0;j<str.length();j++)
	          {
	              if(str.charAt(i)==str.charAt(j) && i!=j)
	              {
	                  count++;
	                  break;
	              }
	          }
	          if(count==0)
	          {
	              temp=temp+str.charAt(i);
	          }
	      }
	      sp.unique=temp;
	      return sp.unique;
	  }

	  public String getDuplicate(StringPlay sp,String str) {
	      String temp="";
	      int c;
	      char ch[]=str.toCharArray();
	      for(int i=0;i<ch.length;i++)
	      {
	          c=1;
	          for(int j=i+1;j<ch.length;j++)
	          {
	              if(ch[i]==ch[j] && i!=j)
	              {
	                  c++;
	                  ch[j]='0';
	              }
	          }
	          if(c>1 && ch[i]!='0')
	              temp=temp+ch[i];
	      }
	      sp.duplicate=temp;
	      return sp.duplicate;
	  }

	  public String getVowel(StringPlay sp,String str) {
	      String temp="";

	      int c1=0,c2=0,c3=0,c4=0,c5=0;
	      int s1=0,s2=0,s3=0,s4=0,s5=0;
	      for(int i=0;i<str.length();i++)
	      {

	          if(str.charAt(i)== 'a' && c1==0)
	          {
	              temp=temp+str.charAt(i);
	              c1++;

	          }
	          else if (str.charAt(i)=='e' && c2==0)
	          {
	              temp=temp+str.charAt(i);
	              c2++;

	          }
	          else if(str.charAt(i)=='i' && c3==0)
	          {
	              temp=temp+str.charAt(i);
	              c3++;

	          }
	          else if(str.charAt(i)=='o' && c4==0)
	          {
	              temp=temp+str.charAt(i);
	              c4++;

	          }
	          else if(str.charAt(i)=='u' && c5==0)
	          {
	              temp=temp+str.charAt(i);
	              c5++;

	          }
	          else if(str.charAt(i)== 'A' && s1==0)
	          {
	              temp=temp+str.charAt(i);
	              s1++;

	          }
	          else if (str.charAt(i)=='E' && s2==0)
	          {
	              temp=temp+str.charAt(i);
	              s2++;

	          }
	          else if(str.charAt(i)=='I' && s3==0)
	          {
	              temp=temp+str.charAt(i);
	              s3++;

	          }
	          else if(str.charAt(i)=='O' && s4==0)
	          {
	              temp=temp+str.charAt(i);
	              s4++;

	          }
	          else if(str.charAt(i)=='U' && s5==0)
	          {
	              temp=temp+str.charAt(i);
	              s5++;

	          }
	      }
	      sp.vowel=temp;
	      return sp.vowel;
	  }
	}

	class Source{
	  public static void main(String args[])
	  {
	      Scanner sc=new Scanner(System.in);
	      String str=sc.nextLine();

	      StringPlay sp=new StringPlay();

	/*      String unique=sp.unique;
	      String duplicate=sp.duplicate;
	      String vowel=sp.vowel; */

	      StringMethods sm =new StringMethods();

	      System.out.println(sm.getUnique(sp, str));
	      System.out.println(sm.getDuplicate(sp, str));
	      System.out.println(sm.getVowel(sp, str));
	  }


	}


