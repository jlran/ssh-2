package com.github.jlran.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.github.jlran.vo.Book;


public class BookDao extends HibernateDaoSupport{

	public void save(Book book) {
		this.getHibernateTemplate().save(book);
	}
	
	public void update(Book book){
		this.getHibernateTemplate().update(book);
	}
	
	public void delete(Book book){
		this.getHibernateTemplate().delete(book);
	}
	
	public Book findById(Integer id){
		return this.getHibernateTemplate().get(Book.class, id);
	}
	
	public List<Book> findAll(){
		return this.getHibernateTemplate().find("from Book");
	}
	
	public List<Book> findByCriteria(DetachedCriteria criteria){
		return this.getHibernateTemplate().findByCriteria(criteria);
	}
	
}
