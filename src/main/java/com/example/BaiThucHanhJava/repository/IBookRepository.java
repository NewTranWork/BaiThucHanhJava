package com.example.BaiThucHanhJava.repository;

import com.example.BaiThucHanhJava.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository  extends JpaRepository<Book, Long> {

}
