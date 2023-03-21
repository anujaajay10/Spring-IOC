package ustbatchno3.Spring_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson2.JSONReader.Context;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");
    	Sim s=context.getBean(Sim.class);
    	s.calling();
    	s.dialing();
    	
    	
    	
    }
}
