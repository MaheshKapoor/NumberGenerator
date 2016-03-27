package com.mk;

import org.junit.Assert;

import org.junit.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertNotEquals(obj.generateUniqueKey(), obj.generateUniqueKey());
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
    
    @Test
    public void testValue(){
    	App obj = new App();
    	Assert.assertNotNull(obj);;
    }
}
