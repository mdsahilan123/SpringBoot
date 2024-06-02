package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.service.BookSerice;

public class MyApp {

	public static void main(String[] args) {
          ApplicationContext context=new ClassPathXmlApplicationContext("bens.xml");
          BookSerice service =context.getBean(BookSerice.class);
          service.saveBook();
	}

}
