package com.github.jlran.test;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.jlran.service.BookService;
import com.github.jlran.vo.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SSHTest {
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@Test
	public void demo01(){
		Book book = new Book();
		book.setId(1);
		book.setName("AJAX开发");
		book.setPrice(34d);
		bookService.update(book);
		
		book= bookService.findById(1);
		System.out.println(book.getName());
	}
	
	@Test
	public void demo02(){
		Book book = new Book();
		book.setName("哈哈");
		book.setPrice(21d);
		bookService.add(book);
	}
	
	//查询所有
	@Test
	public void demo03(){
		List<Book> list = bookService.findAll();
		for (Book book : list) {
			System.out.println(book.getName());
		}
	}
	
	//条件查询
	@Test
	public void demo04(){
		DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
		criteria.add(Restrictions.eq("name", "哈哈"));
		List<Book> list = bookService.findByCriteria(criteria);
		for (Book book : list) {
			System.out.println(book.getName());
		}
	}
}
