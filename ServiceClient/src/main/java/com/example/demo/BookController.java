package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	public Book getBook() {
		return new Book(1, "aaaa");
	}
}
