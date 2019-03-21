package Predicate_Lambda.Predicate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class PredicateTesting {

	@Test
	public void test() {
		Student s1=new Student("Aiswarja",2,"CSE");
    	Student s2=new Student("Joye",5,"ECE");
    	Student s3=new Student("Ana",4,"CS");
    	Student s4=new Student("Saha",3,"EEE");
    	Student s5=new Student("Rini",8,"ECO");
    	Student s6=new Student("Anika",10,"BBA");
    	
    	ArrayList<Student> L=new ArrayList<Student>();		
    	//Created list and adding objects in list
    	L.add(s1);
    	L.add(s2);
    	L.add(s3);
    	L.add(s4);
    	L.add(s5);
    	L.add(s6);
    	//using predicate
    	List<Student> filter=L.stream().filter(s ->s.getName().startsWith("A")).collect(Collectors.<Student>toList());
    	
    	assertNotNull(filter);
    	assertEquals("[Student [name=Aiswarja, id=2, dept=CSE], Student [name=Ana, id=4, dept=CS], Student [name=Anika, id=10, dept=BBA]]",filter.toString());

	
    	
	}

}
