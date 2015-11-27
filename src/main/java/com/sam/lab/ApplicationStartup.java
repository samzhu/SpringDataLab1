package com.sam.lab;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.sam.lab.entity.Reservation;
import com.sam.lab.repository.ReservationRepository;

@Component
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private ReservationRepository rr;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Arrays.asList("Dr. rod,Dr. Syer,Juergen,ALL THE COMMUNITY,Josh".split(","))
        .forEach( x -> rr.save(new Reservation(x)));
        rr.findAll().forEach( System.out::println);
		
	}

}
