package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EngineeringCourses;

public class TestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*********CONTAINER STARTED*************");
		
		EngineeringCourses engineeringCourses = factory.getBean("CS", EngineeringCourses.class);
		System.out.println(engineeringCourses);
		
		factory.close();
		System.out.println("***********CONTAINER CLOSED**************");
	}

}
