package com.management_system.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management_system.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorId(Long authorId);
}
