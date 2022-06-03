package Springtest2.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity//해당클래스를 엔티티[DB내 테이블과 매핑] 로 사용
@Table(name = "test")//DB사용될 테이블 이름 정하기
public class TestEntity {//클래스

    @Id//기본키 설정 primary키를말하는거임
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto key 자동번호
    public int no;//필드

    @Column(name="content")//DB에서 사용할 필드
    public String content;//내용 필드


}
//jpa : 클래스를 db테이블처럼 사용하자.
    //1. java클래스를 엔티티화 하면 db테이블이 자동 생성된다.

    // java <---JPA(매핑) JpaRepository : 조작---> DB //매핑 : 연결같은거임
    //entity 클래스           table
    //    필드                필드
    //예)게시물번호            게시물번호
    //   게시물내용            게시물내용
