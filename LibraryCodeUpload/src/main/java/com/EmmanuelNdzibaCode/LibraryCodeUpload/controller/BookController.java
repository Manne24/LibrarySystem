package com.EmmanuelNdzibaCode.LibraryCodeUpload.controller;

import com.EmmanuelNdzibaCode.LibraryCodeUpload.entity.Books;
import com.EmmanuelNdzibaCode.LibraryCodeUpload.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    // Get All Books

    @GetMapping("/books")
    public List<Books> getALlBooks(){
        return bookRepo.findAll();
    }
}
