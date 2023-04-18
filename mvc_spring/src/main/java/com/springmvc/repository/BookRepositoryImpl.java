package com.springmvc.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.stereotype.Repository;

import com.springmvc.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	private List<Book> listOfBooks = new ArrayList<Book>();
	
	@Override
	public List<Book> getAllBookList() throws Exception{
		if(listOfBooks.size() > 0) {
			System.err.println("ListOfBooks size is " + listOfBooks.size());
			listOfBooks.clear();
		}
		
		Book book1 = new Book("ISBN1234","C#교과서",30000);
		
		book1.setAuthor("정동인");
		book1.setDescription("설명임");
		
		book1.setPublisher("길벗");
		book1.setCategory("IT전문서");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2020/05/29");
		
		Book book2 = new Book("ISBN1235","JAVA 교과서",230000);
		
		book2.setAuthor("정동욱");
		book2.setDescription("설명임2");
		
		book2.setPublisher("길벗");
		book2.setCategory("IT전문서2");
		book2.setUnitsInStock(2000);
		book2.setReleaseDate("2020/05/30");
		
		Book book3 = new Book("ISBN1236","내적치유의 허구성",330000);
		
		book3.setAuthor("정태홍");
		book3.setDescription("설명임3");
		
		book3.setPublisher("RPTministries");
		book3.setCategory("IT전문서3");
		book3.setUnitsInStock(3000);
		book3.setReleaseDate("2020/06/30");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		
		return listOfBooks;
	}
	
	@Override
	public List<Book> getBookListByCategory(String category) throws Exception {
		List<Book> booksByCategory = new ArrayList<Book>();
		
		int bookSize = listOfBooks.size();
		
		//book List가 존재하면
		if(bookSize > 0) {
			for(int i = 0 ; i < bookSize ; i++) {
				Book book = listOfBooks.get(i);
				if(category.equalsIgnoreCase(book.getCategory())) {
					booksByCategory.add(book);
				}
			}
		}
		
		return booksByCategory;
	}
	
	

}
