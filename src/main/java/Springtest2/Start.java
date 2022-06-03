package Springtest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {
    
    public static void main(String[] args) {
        SpringApplication.run(Start.class);
    }

}
/*
    패키지구조
        1.src
            2.main
                3.java : 백엔드
                    4.root패키지[이름은아무거나 근데 홈페이지명으로하는게좋다]
                        5.controller패키지
                        5.dto패키지
                        5.dao(entity)패키지
                        5.service패키지
                        5.Start클래스[임의로아무거나]

                3.resources:프론트엔드,설정파일
                    4.static : css, js, img 등등
                    4.templates : html 등등


 */



//*API
//1. 스프링 : java를 이용한 미리 만들어진 다양한 API들
    //스프링부트 : 스프링내 자주 사용되는 API들의 기본 세팅을 해주는 놈
        //@SpringBootApplication
        //1.MVC 컴포넌트 기본값 세팅
        //2. tomcat 내장 서버 지원 세팅
        //3. restful api : HTTP(URL)이용한 자원공유
    //1.SpringApplication.run(현재클래스명.class) : 스프링 실행

//2. 타임리프 : 템플릿엔진(정적문서에 데이터를 넣어주는 프로그램)
    //템플릿엔진 : 
        //백엔드 : 1.JSP(스프링에서사용권장x -> 확장자가 war이라서)  2.타임리프  3.머스테치(스프링공식)
        //프론트엔드 : REACT.js, Vue.js
    //백엔드(JAVA/Spring) : 1. RESTFUL API제작
    //프론트엔드(JS)     : 1.RESTFUL API URL를 이용한 데이터 교환

    //1. VIEW <----템플릿엔진----> controller
        //*스프링
        //1. 클라이언트가 URL요청했을경우 @Controller 내에서 url찾기

//3. JDBC (DB와 연결하는 방식)
    //1. DAO방식 : 순수 자바형식의 SQL작성
    //2. SQL Mapper [xml방식] : MyDatis(DBMS)
    //3. JPA(원래는 스프링꺼가아닌데 지원해주는거임) : JDBC(JAVA와DB를 연결하는) API
        //JPA 사용목적은 SQL작성코드를 줄이기!!!
        //반복되는 SQL를 자바코드로 변경하느게 위에 얘네들의 목적이다.

    //1.Spring Data JPA
    //2.MySQL Driver







