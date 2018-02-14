package java100.app.service;

import java.util.List;
import java.util.Map;

import java100.app.domain.Member;

//"역할"을 강조할 때는 "객체(Object)" 라는 말보다 "컴포넌트(Component)" 라는 말을 사용한다.
//객체는 말 그대로 한개의 클래스를 가리키는 것이라면 컴포넌트는 그 역할을 수행하는 여러 객체의 묶음을 총칭한다.

//Service 컴포넌트는(인터페이스, 구현체)는 "업무 로직"과 "트랜잭션 처리"를 담당하기 때문에
//인터페이스에 선언하는 메서드 이름도 가능한 업무 용어를 사용한다.
public interface MemberService {
    List<Member> list(int pageNo, int pageSize, Map<String,Object> options);
    Member findByEmailAndPassword(Map<String,Object> params);
    Member get(int no);
    Member get(String email);
    int add(Member member);
    int update(Member member);
    int delete(int no);
    int getTotalCount();
}
