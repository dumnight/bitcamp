"use strict"
//객체 - 정의하는 방법
//자바스크립트에서 제공하는 Object라는 객체의 Create() 함수를 사용하여 객체를 만든다.
//=> 파라미터로 넘겨주는 값은 빈 객체를 초기화시킬 정보나 프로퍼티 정보이다.
//
var obj = new Object.create(null);

//객체 생성 과정
//1) 빈 객체 생성
//2) Object() 함수를 호출하여 빈 객체에 값이나 함수 등을 추가한다.
// => 객체에 추가된 값이나 함수 등을 "프로퍼티(property)라 부른다
//3)객체 주소를 리턴한다.
//주의 자바는 클래스라는 설계도에 따라 메모리를 준비한다
//자바스크립트는 자바와 달리 설계도가 없다.
//그래서 설계도에 따라 메모리를 준비하는 것이 아니라
//빈 객체를 생성한 다음 필요한만큼 프로퍼티를 추가한다
//자바에서 맵객체를 생성하는 것과 유사하다

console.log(obj)
console.log("-------------------------")
console.log(obj.toString())
console.log("-------------------------")
console.log(obj.valueOf())
console.log("-------------------------")
