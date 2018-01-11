// 변수 선언

// 글로벌 변수
//
"use strict"

//모듈 변수
var name = "홍"
    
function test() {
    //로컬 변수
    var name2;
    
    name = "임" // 모듈 변수에 저장 
    name2 = "엄" // 로컬 변수에 저장
}

test()

console.log(name) 
console.log(name2) //로컬 변수는 함수 호출이 끝나면 제거된다
