package main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.AppointmentService;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext  ct= new ClassPathXmlApplicationContext("applicationproperties.xml");
		  

        AppointmentService service = (AppointmentService) ct.getBean("appointmentService");
      String r=  service.appointmentService("DOC1", LocalDate.of(2025, 4, 10));
        System.out.println(r);
	}

}
