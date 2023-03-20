package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Employee;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp =new Employee();
//		emp.display();

		Resource res = new ClassPathResource("beans.xml");		// load xml file 
		BeanFactory bf = new XmlBeanFactory(res);		// creating reference of bean factory 
		Employee e1 = (Employee)bf.getBean("emp1");	// pull the object 	
		e1.display();						// from container 
		
		Employee e2 = (Employee)bf.getBean("emp1");	// pull the object 	
		e2.display();						// from container 
		
		Employee e3 = (Employee)bf.getBean("emp2");	// pull the object 	
		e3.display();						// from container 
		
		Employee e4 = (Employee)bf.getBean("emp2");	// pull the object 	
		e4.display();						// from container
	}

}
