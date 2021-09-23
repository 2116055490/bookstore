package edu.xcdq.dao;

import edu.xcdq.beans.Book;
import edu.xcdq.beans.Page;

import java.sql.Connection;
import java.util.List;

public interface BookDao{
    // 增
    void saveBook(Connection coon, Book book);
    // 删
    void deleteBookById(Connection conn,String bookId);
    // 改
    void updateBook(Connection conn,Book book);
    // 查
    // 查 1 一本书
    Book getBookById(Connection conn,String bookId);
    // 查 2 所有书
    List<Book> getBooks(Connection conn);
    // 查 3 有条件的查一部分书
    Page<Book> getPageBooks(Connection coon,Page<Book>page);
    // 查 4 根据价格查询符合条件的书
    Page<Book> getPageBooksByPrice(Connection coon,Page<Book>page,double minPrice,
                            double maxPrice);


}