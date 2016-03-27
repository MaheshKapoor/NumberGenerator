package com.mk;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        App obj1 = new App();
        System.out.println("Unique ID : " + obj1.generateUniqueKey());
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
}
