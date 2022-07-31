package com.neta.spring5.test;

import com.neta.spring5.entity.Book;
import com.neta.spring5.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");


        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book("002","Kamisato Ayaka","off");
//        Book book = new Book("001", "Sangonomiya Kokomi", "on");


//        bookService.addBook(book);
//        bookService.updateBook(book);

//        bookService.deleteBook("001");

//        System.out.println(bookService.findCount());

//        Book one = bookService.findOne("001");
//        System.out.println("one="+one);

//        List<Book> books = bookService.findAll();
//        System.out.println(books);
            List<Object[]> books = new ArrayList<>();
            books.add(new Object[]{"Klee","on","003"});
            books.add(new Object[]{"Jean","off","004"});

//            bookService.batchAdd(books);
        bookService.batchUpdate(books);


    }

}
