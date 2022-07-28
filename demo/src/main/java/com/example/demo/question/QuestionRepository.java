package com.example.demo.question;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	// question의 id타입이 integer여서 
	
	Question findBySubject(String subject);
	Page<Question> findAll(Pageable pageable);

}