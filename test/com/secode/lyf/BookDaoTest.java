package com.secode.lyf;

import com.soecode.lyf.dao.BookDao;
import com.soecode.lyf.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest{
    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryByid() throws Exception{
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void testQueryAll() throws Exception{
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book book:books){
            System.out.println(book);
        }
    }

    @Test
    public void testReduceNumber() throws Exception{
        long bookID = 1000;
        int update = bookDao.reduceNumber(bookID);
        System.out.println("update=" + update);
    }
}
