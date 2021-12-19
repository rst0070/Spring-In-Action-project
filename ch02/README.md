# Developing Web applications
__무엇을 알아야하는가?__
1. domain의 구조, lombok
2. Spring mvc: controller, model, view 기본
3. __logging : slf4j__
4. model을 view에서 보여주기
5. form 데이터 받기
6. __bean validation, domain, controller, view에서 적용하기__

전화번호부에 전화번호를 등록 하는 애플리케이션 만들어보기  
(등록하는걸 보여주는건 jpa로 사용해보자: ch03)  
* `InformationDomain` - 전화번호 정보 저장하는 도메인
* `PhoneBookController` - controller
* `phonebook-form.html` - view

## 1. Domain
domain은 보통 주요한 데이터를 포함하는 코드라고 볼 수 있다.
이를 통해, 추상적인 데이터를 객체를 이용해 다룰 수 있다.  
domain의 `getter`, `setter`등을 구현하는데 도움을 주는것이 [`lombok`](https://projectlombok.org/features/all)이다.  

## 2. Spring mvc
__controller__  
`@Controller`를 이용해서 component로 등록, `@GetMapping`, `@PostMapping`등을 이용해 
메서드에 자신이 대응될 url지정.  
model은 메서드의 파라미터로 받을 수 있으며 `org.springframework.ui.Model`이다. 이를 이용해 view에 데이터 전달가능.  
  
## 3. Logging
### 3.1 Logging에 대한 기본 개념
[java brain 영상 참고](https://youtu.be/SWHYrCXIL38)  
__어떤 방식으로 로그를 남기는가?__  
애플리케이션에서는 slf4j를 사용하고 slf4j가 다른 로깅 라이브러리를 바인딩하여 사용.  

__로깅 추상화 라이브러리(facade library)의 필요성__  
로깅 추상화 라이브러리는 실제로 로깅을 하는 코드는 가지고 있지 않지만 애플리케이션을 위한 
로깅 인터페이스를 갖추고 있다. 즉 다른 라이브러리가 실제로 로깅을 수행하는것인데 이는 서로 다른 방식으로 작동하는 
여러 로깅라이브러리가 있는 상황에서 표준화를 시킬 수 있는 좋은 방법이다.  
  
_해당되는 라이브러리들은?_
* `slf4j` : (facade library)로깅 추상화 라이브러리 spring boot 에서 사용, lombok으로도 사용가능
* `log4j2` : 로깅 라이브러리
* `logback` : 로깅 라이브러리
slf4j에서는: slf4j를 `api`, logback등을 `binding`이라 한다.   
또한 이미 다른 로그 라이브러리로 쓰여진 레거시 코드를 위해 `bridge`라는 것을 이용해 slf4j로 대응시켜준다.  
  
하지만 레거시 코드와 binding이 같은 라이브러리를 쓴다면 이를 사용할 필요가 없다.  
  
[slf4j manual 참고 하기](http://www.slf4j.org/manual.html)  
### 3.2 Spring Boot와 Slf4j
[java brain : spring boot and slf4j 참고](https://youtu.be/lGrcZsw-hKQ)  
spring boot에서는 `spring-boot-starter-logging`이 필요하다. `spring boot starter web`은 이를 기본적으로 참조한다.  
그냥 slf4j를 사용하는것 처럼 사용가능(spring에서는 logback을 기본으로 제공)  
  
`application.properties`를 이용해 로그 레벨등을 설정할 수 있다.

## 6. bean validation
[baeldung.com 문서 참고](https://www.baeldung.com/javax-validation)  
bean validation은 java bean의 유효성을 검사하는 api 이다. 
이를 사용하려면 api와 이를 구현한 코드가 필요하다.  
* `javax.validation:validation-api` : jsr380 api
* `org.hibernate.validator:hibernate-validator` : hibernate의 validate api 구현 코드
* `org.glassfish:javax.el` : expression language를 파싱하기 위해 `javax.el` api가 필요한데 org.glassfish의 구현 코드를 사용하는것.
  
## 7. 마무리
* lombok의 다양한 어노테이션 알아봐야겠다.
* slf4j를 여러번 사용해 봐야할 듯.
* javax.validation 도 자주 적용해 보기.
위 세가지는 앞으로도 자주쓰이는 중요한 라이브러리들인것 같다. 
여러 환경에서 연습해봐야할 것 같다.