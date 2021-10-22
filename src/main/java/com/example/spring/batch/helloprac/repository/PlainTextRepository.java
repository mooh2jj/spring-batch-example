package com.example.spring.batch.helloprac.repository;

import com.example.spring.batch.helloprac.domain.PlainText;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface PlainTextRepository extends JpaRepository<PlainText, Long> {

//    Page<PlainText> findBy(Pageable pageable);
}
