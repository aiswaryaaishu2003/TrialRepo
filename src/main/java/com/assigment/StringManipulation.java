package com.assigment;

public class StringManipulation {
	public int vowelCount(String name)
	{
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			 if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
		            count ++;
		}
			
	}
		 return count;
	}
	public int characterCount(String str)
	{
		int count1=0; 
		 for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')  {  
	                count1++;    
	        }    
	}
	return count1;
	
}
	
}