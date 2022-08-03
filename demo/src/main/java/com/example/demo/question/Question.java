package com.example.demo.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.answer.Answer;
import com.example.demo.user.SiteUser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
	
	@Id // id 속성을 기본키로 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // strategy = 고유번호를 생성하는 옵션 / GenerationType.IDENTITY = 알아서 1씩 증가하는 값 : 시퀀스
	private Integer id;
	
	@Column(length = 200)
	private String subject;
	
	@Column(columnDefinition = "TEXT") // columnDefinition = 컬럼의 속성을 정의할 때 씀
	private String content;

	// 엔티티의 속성은 @column애너테이션을 쓰지 않더라도 테이블 컬럼으로 인식한다.
	// 테이블 컬럼으로 인식되고 싶지 않을때만 @Transient를 사용
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // 하나의 Question이 삭제되면 그에 따른 Answer 모두 삭제되도록 하였음
	private List<Answer> answerList;

	@ManyToOne
	private SiteUser author;
	
	private LocalDateTime modifyDate;
	
	@ManyToMany
	Set<SiteUser> voter;

}
