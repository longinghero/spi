package com.longing.spi.core;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.longing.spi.interfaces.People;

public class PeopleFactory {
	
	public void invoker(){
		
		ServiceLoader<People> service = ServiceLoader.load(People.class);
		Iterator<People> peoples = service.iterator();
		
		boolean bool = true;
		while(peoples.hasNext()){
			bool = false;
			People people = peoples.next();
			people.people();
		}
		if(bool){
			throw new RuntimeException("找不到一个实现类");
		}
	}
}
