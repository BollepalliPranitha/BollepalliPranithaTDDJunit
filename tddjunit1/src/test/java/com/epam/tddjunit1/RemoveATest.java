package com.epam.tddjunit1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class RemoveATest {
/* “ABCD” => “BCD” 
 * “AACD” => “CD”  
 * “BACD” => “BCD” 
 * “BBAA” => “BBAA”        
 * “AABAA” => “BAA” 
 */
	
	RemoveAifinFirst2Chars remove;
	
	@Before
	public void setUp(){
		 remove=new RemoveAifinFirst2Chars();
	
	}
	
	@Test
 public void Testif1AChars(){
		
		assertEquals("BCD",remove.RemoveAChar("ABCD"));
	}
   @Test
 public  void Testif2AChars(){ 
		assertEquals("CD",remove.RemoveAChar("AACD"));

   }
   @Test
   public void TestifSecondAChars(){
	assertEquals("BCD",remove.RemoveAChar("BACD"));
   }
   @Test
  public void TestifNoAChars(){
	 		assertEquals("BBAA",remove.RemoveAChar("BBAA"));
   }
   @Test
public void Testif2ACharswith2As(){ 
		assertEquals("BAA",remove.RemoveAChar("AABAA"));
   }
   
}
