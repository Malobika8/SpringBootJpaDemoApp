package com.springboot.jpa;

import com.springboot.jpa.dao.PersonDao;
import com.springboot.jpa.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaDemoApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaDemoApp.class);
        PersonDao personDao = context.getBean("personDao", PersonDao.class);

        //Save person
        Person person = new Person();
        person.setName("Reena");
        person.setAddress("bbs");
        System.out.println("Saving...");
        personDao.save(person);
    }
}
