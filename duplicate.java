package com.cap;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {	//	0 1 2 3 4 5 6 7 8 9 10 11
		// TODO Auto-generated method stub			T h i s   i s   g o o d          --sio
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && i!=j)
				{
					temp=temp+str.charAt(i);
				}
				
			}
			//count++;
		}
		System.out.println("Duplicate Elements "+temp);

	}

}
