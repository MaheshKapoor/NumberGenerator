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

		App obj1 = new App();
		Assert.assertNotEquals(obj1.generateUniqueKey(), obj1.generateUniqueKey());
		Assert.assertEquals(36, obj1.generateUniqueKey().length());

	}
    
    @Test
    public void testValue(){
    	App obj = new App();
    	Assert.assertNotNull(obj);;
    }
}
