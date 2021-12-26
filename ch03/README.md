# Working with data
jdbc방식과 jpa방식을 다룸.  

두개의 테이블이 연관된 상황이면 좋다.
반과 학생에 대한 정보를 저장하는 애플리케이션을 만들어보자  
  
CLASS_ROOM  
* 반 번호

STUDENT  
* 이름
* 이메일
* 생일
* 반 번호(CLASS_ROOM 참조)

data preloading이 되지 않아 일단 수동적으로 데이터 입력함  

__무엇을 알아야할까__
1. `JdbcTemplate`사용하기
2. JDBC repository
3. 미리 스키마 및 데이터 생성
4. JdbcTemplate으로 데이터 저장 하기


