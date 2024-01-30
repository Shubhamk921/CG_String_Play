package com.cap;
import java.util.Scanner;
public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
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
		System.out.println("Unique Elements: "+temp);

	}

}
