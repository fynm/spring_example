package com.javaPractice.spring.basics.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExampleApplication {

	//What does spring need?
	//beans -> What are the beans? -> Beans are java functions -> set the java class with @Component to state it is a bean
	//What are the dependencies of the bean? -> Set the dependency, EX. interface with @Autowired
	//Where to search for beans? -> No need to do this if they are in the same package

	/*
		Core Container - base functionality
			-beans
			-context
			-SpEL

		Data Access / Integration
			- JDBC
			- ORM (Hibernate/JPA) - Object Relational Manager
			- OXM - XML Manager
			- JMS - Java Messenger Service
			- Transaction management

		Web
			- WebSocket
			- Web - Spring MVC
			- Servlet
	

	*/

	/*Spring Projects
	
		Spring Boot - Best used to develop microservices
		Spring Cloud - Connecting to cloud services
		Spring Data - Connecting to Database Services
		String Integration - Addresses problems with application integration - connects enterprise applications
		String Batch - used for batch applications
		Spring Security - Security services - support for multiple options 
		Spring HATEOAS - for HATEOAS Services
		Spring Web Services
		Spring Session
		Spring Mobile
		Spring Android
	
	
	*/

	/*Spring Popularity
		1. Enables Testable Code (JUnit / other unit testing)
		2. No Plumbing Code - avoids bulky code (EX. JDBC with try/catches and many lines to get a column or two from a database)
		3. Flexible Architecture - Many different projects for different purposes
		4. Staying Current 
	*/

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());
		/*Using an interface we can specify which Sorting Algo to use when declaring the use of the BinarySearchImpl
			This allows the program to be "loosely coupled" vs if we hard coded all the algo inside the BinarySearchImpl, it would be tightly coupled
			Tightly Coupled implies that if I wanted to switch the algo of BubbleSort to QuickSort, I would have to rewrite the code and insert it into the function (BinarySearchImpl)
			Loosely Coupled means that we can easily switch the algo on the fly using an interface and stating we want to use QuickSort instead of BubbleSort
		*/

		//These previous steps will now be done via Spring rather stating the BinarySearch Object

		//Spring Application Context -> Use this to access beans you declared with @Component
		ApplicationContext applicationContext = SpringApplication.run(SpringExampleApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int[] numsArray = {11, 5, 90};
		int result = binarySearch.binarySearch(numsArray, 3);
		System.out.println(result);
	}

}
