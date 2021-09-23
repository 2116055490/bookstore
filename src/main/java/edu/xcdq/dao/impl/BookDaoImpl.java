package edu.xcdq.dao.impl;

import edu.xcdq.beans.Book;
import edu.xcdq.beans.Page;
import edu.xcdq.dao.BookDao;

import java.sql.Connection;
import java.util.List;

public class BookDaoImpl implements BookDao {

    @Override
    public void saveBook(Connection coon, Book book) {

    }

    @Override
    public void deleteBookById(Connection conn, String bookId) {

    }

    @Override
    public void updateBook(Connection conn, Book book) {

    }

    @Override
    public Book getBookById(Connection conn, String bookId) {
        return null;
    }

    @Override
    public List<Book> getBooks(Connection conn) {
        return null;
    }

    @Override
    public Page<Book> getPageBooks(Connection coon, Page<Book> page) {
        return null;
    }

    @Override
    public Page<Book> getPageBooksByPrice(Connection coon, Page<Book> page, double minPrice, double maxPrice) {
        return null;
    }
}
