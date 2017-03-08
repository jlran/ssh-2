package com.github.jlran.action;

import com.github.jlran.service.BookService;
import com.github.jlran.vo.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookAction extends ActionSupport implements ModelDriven<Book>{
	
	//模型驱动类
	private Book book = new Book();
	@Override
	public Book getModel() {
		return book;
	}
	
	//获取BookService
	private BookService bookService;
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public String add(){
		
		bookService.add(book);
		
		return "addSuccess";
	}

}
