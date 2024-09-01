package com.management_system.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management_system.library.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	
}
