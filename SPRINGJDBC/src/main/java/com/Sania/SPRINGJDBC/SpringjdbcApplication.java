package com.Sania.SPRINGJDBC;

import com.Sania.SPRINGJDBC.model.Alien;
import com.Sania.SPRINGJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);
		Alien a1 = context.getBean(Alien.class);
		a1.setId(123);
		a1.setName("Sania");
		a1.setTech("Java Developer");
		AlienRepo repo1 = context.getBean(AlienRepo.class);
		repo1.saveAlien(a1);
System.out.println(repo1.listAlien());
	}

}
