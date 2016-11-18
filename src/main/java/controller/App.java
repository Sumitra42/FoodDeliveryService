package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import DAO.IProductDAO;
import domain.Product;

/**
 * Hello world!
 *
 */
@Controller
public class App {
	@Autowired
	IProductDAO ip;
	
	public static void main(String args[])
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		Product p=new Product();
		p.setName("manoj");
		App a=ap.getBean("mainApp", App.class);
		Product s=a.ip.findByName("manoj");
		//System.out.println(s.getName());
	}
	
}
