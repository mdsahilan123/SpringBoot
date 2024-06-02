package in.ashokit.service;

import in.ashokit.dao.BookDao;

public class BookServiceImpl implements BookSerice {

	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
         
	
	public void saveBook() {
		boolean status = bookDao.save();
		if (status) {
			System.out.println("record inserted");
		} else {
			System.out.println("Insertation failed");
		}

	}

}
