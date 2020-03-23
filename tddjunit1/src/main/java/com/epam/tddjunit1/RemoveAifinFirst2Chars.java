package com.epam.tddjunit1;

public class RemoveAifinFirst2Chars {

	public String RemoveAChar(String string) {
		String b=string.substring(0,2);
		String a1="";    
        if(b.charAt(0)=='A'){
        a1=string.substring(1,string.length());
               }
    if(b.charAt(1)=='A'){
    a1=string.charAt(0)+"";
    a1=a1.concat(string.substring(2));
}
if(b.charAt(0)=='A' && b.charAt(1)=='A') {
     a1=string.substring(2);
}
if(b.charAt(0)!='A' && b.charAt(1)!='A'){
    a1=string;
}
return a1;
	}

	
}
