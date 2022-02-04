# Spring Security by amigos code
[youtube video](https://youtu.be/her_7pa0vrg)  
  
There are many type of authentication
* Form based
* basic auth


## Build API
build api about student information.  
Student objects have it's id(Integer), name(String).  
to do  
* student controller(include temporal data)
* student entity  

## Install Spring Security
Just add `spring-boot-starter-security` to pom.xml  

## Form based Authentication Overview
spring security offers basic form authentication(user name, password) to all request. 
when get authentication, returns response.  
`/logout` offers logout action.  

## Basic auth overview
basic auth ask username and password for every http request.  
so, every request has username and password at header.  
  
if the request has not that header, then server response 401 Unauthorized.  

## Basic auth implementation
using configuration, override `WebSecurityConfigurerAdapter:configure(HttpSecurity)`.
```java
@Configuration      //
@EnableWebSecurity  //web security 를 사용한다
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest()   
            .authenticated()
            .and()
            .httpBasic();   //basic authentication을 사용한다.
    }
}
```
  
## ANT Matchers
[section 참고](https://www.section.io/engineering-education/springboot-antmatchers/#:~:text=The%20antMatchers()%20is%20a,specific%20URLs%20as%20its%20arguments.)
특정 경로에 대해 권한을 요구하지않는 white list를 만들수 있다.  
위의 코드에서
```
    http
        .authorizeRequests()
        .antMathers(
            "/", "/index"
        )
        .permitAll()
        .anyRequest()   
        .authenticated()
        .and()
        .httpBasic();
```

## User 만들기
