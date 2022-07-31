package com.neta.spring5.dao.impl;

import com.neta.spring5.dao.BookDao;
import com.neta.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    // 注入 JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values (?,?,?)";
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int add = jdbcTemplate.update(sql, args);
        System.out.printf("add %d rows", add);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username = ?, ustatus = ? where userId = ?";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(), book.getUserId());
        System.out.printf("update %d rows", update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where userId = ?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.printf("delete %d rows",delete);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book findBookInfo(String id) {
    String sql = "select * from t_book where userId = ?";
        RowMapper<Book> book = new BeanPropertyRowMapper<>(Book.class);
        return jdbcTemplate.queryForObject(sql, book, id);
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("batch="+Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username = ?,ustatus = ? where userId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("batch="+Arrays.toString(ints));
    }
}
