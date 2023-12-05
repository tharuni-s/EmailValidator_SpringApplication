package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stupplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Emailvalidator e=(Emailvalidator)context.getBean("emailob");
		System.out.println(e.getIsValidEmail());
	}

}
