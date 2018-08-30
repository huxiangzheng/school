package com.bookmanage.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmanage.base.dao.IBorrowBookDao;
import com.bookmanage.base.dao.support.IBaseDao;
import com.bookmanage.base.entity.BorrowBook;
import com.bookmanage.base.service.IBorrowBookService;
import com.bookmanage.base.service.support.impl.BaseServiceImpl;

/**
 * 借阅图书服务实现类
 * @author BubblyYi
 * @since 2017年6月29日
 */
@Service
public class BorrowBookServiceImpl extends BaseServiceImpl<BorrowBook, String> implements IBorrowBookService {

	@Autowired
	private IBorrowBookDao borrowBookDao;
	
	@Override
	public BorrowBook[] findByUserId(int userId) {
		// TODO Auto-generated method stub
		return borrowBookDao.findByUserId(userId);
	}

	@Override
	public BorrowBook[] findByBookId(String bookId) {
		// TODO Auto-generated method stub
		return borrowBookDao.findByBookId(bookId);
	}

	@Override
	public void saveOrUpdate(BorrowBook borrowBook) {
		
		save(borrowBook);
		
	}

	@Override
	public IBaseDao<BorrowBook, String> getBaseDao() {
		// TODO Auto-generated method stub
		return this.borrowBookDao;
	}

	@Override
	public BorrowBook findByUserIdAndBookId(int userId, String bookId) {
		// TODO Auto-generated method stub
		return borrowBookDao.findByUserIdAndBookId(userId, bookId);
	}

	@Override
	public void deletByUserIdAndBookId(int userId, String bookId) {
		
		borrowBookDao.mDelet(userId, bookId);
	}


	

}
