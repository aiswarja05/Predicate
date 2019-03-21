package Predicate_Lambda.Predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Student s1=new Student("Aiswarja",2,"CSE");
    	Student s2=new Student("Joye",5,"ECE");
    	Student s3=new Student("Ana",4,"CS");
    	Student s4=new Student("Saha",3,"EEE");
    	Student s5=new Student("Rini",8,"ECO");
    	Student s6=new Student("Anika",10,"BBA");
    	
    	ArrayList<Student> L=new ArrayList<Student>();
    	L.add(s1);
    	L.add(s2);
    	L.add(s3);
    	L.add(s4);
    	L.add(s5);
    	L.add(s6);
    	
    	HashMap<String,List> sMap=new HashMap<String,List>(); 
    	sMap.put("H1", L);
    	
    	
    	//HashMap<String,List> filter1=sMap.get("H1").stream().filter(s ->s.toString().contains("A")).collect(Collectors.<T>toMap());
    //	System.out.println(filter1.toString());
    	
    	
    List<Student> filter=L.stream().filter(s ->s.getName().startsWith("A")).collect(Collectors.<Student>toList());
    	
    	
    	System.out.println(filter);
    	
    }
}
