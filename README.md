# SpringBoot

### 📕 교재
점프 투 스프링부트 교재를 따라하며 클론코딩 [[Jump to SpringBoot]](https://wikidocs.net/book/7601)

#### 기간
2022.07.25 ~ 2022.08.03

#### 개요
1. SpringBoot 소개 및 설명
2. SpringBoot Gradle을 사용한 게시판 클론코딩
3. AWS 클라우드 시스템을 사용한 서버 환경 구축 및 배포 맛보기
부록. 인텔리제이

<br/>

### ⚙ 개발환경
- Language : `java 1.8` 
- Framework : `SpringBoot Gradle`
- Library : `Thymeleaf`, `BootStrap`
- DB Engine : `H2 Database`

<br/>

### 📑 정리
웹 프로젝트의 기본인 **게시판구현**에 대한 정확한 설명을 붙이고 있어, 기본을 다지는 데 큰 도움이 된다.<br/><br/>
**MVC Model 2**를 사용하여 Model에서 Controller를 거쳐 View로 이동하는 데이터의 흐름에 대한 상세한 설명을 덧붙이고 있다.<br/>
각 기능들을 Entity, Repository, Service, Form, Controller, Html로 모듈화하여 구조화된 프로젝트를 직접 구현하는데 의의가 있다.<br/><br/>
**CRUD 기능**을 토대로 답변, 내비게이션 바, 페이징, 일련번호, 답변개수, 로그인 및 회원가입, 보안과 같은 기능들을 추가하였다.<br/>
**Thymeleaf**를 활용하여 데이터의 도출과 중복을 줄인 화면단 구현을 할 수 있었고, <br/>
**BootStrap**을 이용하여 전반적인 외관과 디자인을 빠르고 쉽게 구현할 수 있었다.<br/>
**AWS 클라우드 시스템**을 사용하는 방법에 대해 설명되어 있어, 서버 환경 구축과 배포에 대한 기본 개념을 알 수 있다.



<br/>

### 💡 추가적으로...
#### MVC패턴 5계층
- 프리젠테이션 계층 (Presentation Layer) : Html
- 제어 계층 (Control Layer) : Controller
- 비즈니스 로직 계층 (Business Logic Layer) : Service
- 퍼시스턴스 계층(Persistence Layer) : Form, Entity
- 도메인 모델 계층(Domain Model Layer) : Entity


