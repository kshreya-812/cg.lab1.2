package Spring.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp=(Employee)context.getBean("employee");
		System.out.println("Employee details");
		System.out.println("----------------------------");
		System.out.println(emp);

		
		
    }
    
    
}
