package com.bookmanage.base.dao;

import org.springframework.stereotype.Repository;

import com.bookmanage.base.dao.support.IBaseDao;
import com.bookmanage.base.entity.Book;
import com.bookmanage.base.entity.User;

@Repository
public interface IBookDao extends IBaseDao<Book, String>{
	
	Book findByBookId(String bookId);
	
	Book findByBookName(String bookName);
	
	Book findByBookPress(String bookPress);
	
	
}
