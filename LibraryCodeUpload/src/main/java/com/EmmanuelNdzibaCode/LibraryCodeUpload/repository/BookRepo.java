package com.EmmanuelNdzibaCode.LibraryCodeUpload.repository;

import com.EmmanuelNdzibaCode.LibraryCodeUpload.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository <Books,Integer> {
}
