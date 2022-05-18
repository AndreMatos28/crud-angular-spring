package com.crud.crudspring;

import java.util.ArrayList;
import java.util.List;

import com.crud.crudspring.model.Course;
import com.crud.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository){
        return args -> {
            courseRepository.deleteAll();
            List <Course> courses = new ArrayList<>();
            Course c = new Course();        

            c.setName("Angular com Spring");
            c.setCategory("front-end");

            Course d = new Course();            
            d.setName("Angular com Spring");
            d.setCategory("back-end");

            courses.add(c);
            courses.add(d);


            courseRepository.saveAll(courses);            
        };
    }

}
