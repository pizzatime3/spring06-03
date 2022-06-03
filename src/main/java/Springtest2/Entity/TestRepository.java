package Springtest2.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {
                                        //JPARepository클래스로부터 상속<엔티티명, pk자료형>
}

    //1.save(엔티티) : 해당 엔티티를 DB insert
    //2.findAll() : 모든 엔티티를 db에서 select
            //반환타입 : List<엔티티명>
    //3. findByid(pk값) :해당 pk와 동일한 하나의 엔티티 select
            //반환타입 : Optional<엔티티명>
    //4. delete(엔티티) : 해당 엔티티를 DB에서 DELETE
    //5. 수정[X = JPA 엔티티 자동감지 = 엔티티 항상 변화 감시]


//트랜잭션(DB용어)
    //1.SQL 실행 결과가 성공 또는 실패
        //만약에 SQL 실행 후 하나라도 오류가 생기면 모두 취소처리
    //2.특징
        // 원자성[commit(성공), rollback(실패?)] , 일관성[결과가일관성], 지속성[결과가 영구적으로 저장] , 독립성[다른트랜잭션독립성]

    //3.JPA
        //엔티티 삽입 , 수정 , 삭제 하는 메소드에는 트랜잭션 권장
    //@@Transaction : 수정 메소드에서는 필수!!! 그외 권장