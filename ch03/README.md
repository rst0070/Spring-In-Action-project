# Working with data
jdbc방식과 jpa방식을 다룸.  

두개의 테이블이 연관된 상황이면 좋다.
반과 학생에 대한 정보를 저장하는 애플리케이션을 만들어보자  
ClassRoom  
* 반 번호
* 학생 리스트  

Student  
* 이름
* 이메일
* 생일
* 반 번호(ClassRoom 참조)

__무엇을 알아야할까__
1. `JdbcTemplate`사용하기
2. JDBC repository
3. 미리 스키마 및 데이터 생성
4. JdbcTemplate으로 데이터 저장 하기

## 1. `JdbcTemplate`사용하기
  
__설정하기__  
`spring-boot-starter-jdbc`가 필요하다.  
또한 H2 DB를 사용하기때문에 `com.h2database:H2`를 dependency로 추가해주고, 
`application.properties`에 몇줄 추가해주면됨(starter가 있기 때문에 이 작업만하면 된다)
```shell
# 드라이버, 연결방법, 유저정보 설정
spring.datasource.url=jdbc:h2:~/test
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driverClassName=org.h2.Driver
# 콘솔 설정
spring.h2.console.enabled=true
spring.h2.console.settings.web-allow-others=true
```
  
추가적으로 schema.sql파일을 설정에 추가해줘야하는지 찾아봐야함.  

__일반 JDBC에 비교되는 JdbcTemplate의 장점?__  
1. connection 처리를 안함
2. statement 처리 안함
3. 예외를 그냥 던져도 됨
