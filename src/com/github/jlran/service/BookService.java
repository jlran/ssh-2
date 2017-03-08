package com.github.jlran.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.github.jlran.dao.BookDao;
import com.github.jlran.vo.Book;

@Transactional
public class BookService {

	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public void add(Book book) {
		bookDao.save(book);
	}
	public void update(Book book) {
		bookDao.update(book);
	}
	public void delete(Book book) {
		bookDao.delete(book);
	}
	public Book findById(Integer  id) {
		return bookDao.findById(id);
	}
	
	public List<Book> findAll(){
		return bookDao.findAll();
	}
	
	public List<Book> findByCriteria(DetachedCriteria criteria){
		return bookDao.findByCriteria(criteria);
	}

}
