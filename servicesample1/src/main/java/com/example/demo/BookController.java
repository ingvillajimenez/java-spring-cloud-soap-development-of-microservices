package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	public String getBook() {

		return new Book(1, "ddddd").getBookName();
	}
}
