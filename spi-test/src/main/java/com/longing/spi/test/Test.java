package com.longing.spi.test;

import com.longing.spi.boy.Boy;
import com.longing.spi.core.PeopleFactory;
import com.longing.spi.interfaces.People;

public class Test {
	
	public static void main(String[] args){
		
		PeopleFactory factory = new PeopleFactory();
		factory.invoker();
	}
}
