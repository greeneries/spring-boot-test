# spring-boot-test


##### Spring Boot Project 생성 환경설정
```
STS >> New >> Spring Starter Project

Project Name : spring-boot-test
Type : Maven
Packaging : Jar
Java : 8
Package : com.example.demo

Spring Boot Version : 1.5.17.RELEASE

Project Dependencies : Web, Lombok
```

pring boot는 default로 JSP를 지원하지 않기 때문에 JSP처리를 하기 위해서 아래와 같이 해준다.

####### 1. pom.xml에서 아래 두개 패키지 추가 

```
		<!-- JSP를 처리한다. -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>
		<!-- JSP 내에서 JSTL 확장 태그 라이브러리를 사용한다. -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>
```

####### 2. application.properties 파일에서 아래 내용 추가 
```
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

####### 3. jsp 넣을 폴더 추가하기
```
webapps/WEB-INF/views
```
