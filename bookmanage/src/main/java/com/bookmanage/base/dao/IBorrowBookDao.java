package com.bookmanage.base.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookmanage.base.dao.support.IBaseDao;
import com.bookmanage.base.entity.BorrowBook;

@Repository
public interface IBorrowBookDao extends IBaseDao<BorrowBook, String>{
	
	BorrowBook[] findByUserId(int userId);
	
	BorrowBook[] findByBookId(String bookId);
	
	BorrowBook findByUserIdAndBookId(int userId,String bookId);
	
	@Modifying
	@Query("DELETE FROM BorrowBook b WHERE b.userId = ?1 and b.bookId= ?2")
	void mDelet(int userId,String bookId);
	
}
