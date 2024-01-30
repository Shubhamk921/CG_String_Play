package com.cap;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String temp="";
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		int s1=0,s2=0,s3=0,s4=0,s5=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' && c1==0)
			{
				temp=temp+str.charAt(i);
				c1++;
			}
			else if(str.charAt(i)=='e' && c2==0)
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
			else if(str.charAt(i)=='u' && c5==i)
			{
				temp=temp+str.charAt(i);
				c5++;
			}
			else if(str.charAt(i)=='A' && s1==0)
			{
				temp=temp+str.charAt(i);
				s1++;
			}
			else if(str.charAt(i)=='E' && s2==0)
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
			else if(str.charAt(i)=='U' && s5==i)
			{
				temp=temp+str.charAt(i);
				s5++;
			}
		}
		System.out.println("Vowel: "+temp);
	}

}
