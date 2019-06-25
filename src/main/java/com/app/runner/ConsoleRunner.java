package com.app.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Book;
import com.app.repo.BookRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
    @Autowired
    private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		Map<String,String> m1=new HashMap<>();
		m1.put("A1","B1");
		Properties p1=new Properties();
		p1.put("M1","N1");
		repo.save(new Book("ABC","siva",3.3,Arrays.asList("A1","A2"),new String[] {"M1","M2"},m1,p1));
		System.out.println(".........................");
		repo.findAll().forEach(System.out::println);
		
	}

}
