/**
 * 
 */
package demospringproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 158417
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("demo.xml");
//		Person person = new Person();
//		person.display();
		
		Person person = ac.getBean(Person.class);
		person.display();
		
		
/*
 * Annotation based configuration
 * @component 
 * @bean
 * @configuration
 * 
 * 		
 */
		
		ApplicationContext ac1 = new AnnotationConfigApplicationContext(Team.class);
		Team teamOne =  ac1.getBean(Team.class);
		teamOne.show();
		
	}

}
