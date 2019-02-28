package com.hellokoding.auth.codequality;

public class SampleCode {


	public void codeError(){
		String[] arrayOfStrings = {"A","B","C"};
		String str = "";
		for (int i = 0; i < arrayOfStrings.length ; ++i) {
  			str = str + arrayOfStrings[i];
		}

		int x = 0;
		if (true)
     	  		x = x+1;
   		else
     	  		x = x-1;

	}
}
