package com.iis.CM23138;

/**
 * Hello world!
 *
 */
public class App 
{ 
	public String hello () {
	return "hello World";
	}
	  
	public static void main( String[] args )
    {
    	App hw = new App() ;
        System.out.println(hw.hello() );
    }
}
