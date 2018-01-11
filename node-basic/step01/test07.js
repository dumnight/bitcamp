"use strict"

//변수 선언 - 블록과 로컬 변수

var v1 = 100;

{
    var vb2 = 200; //이 변수도 모듈(이 파일에 소속된 변수) 변수이다
}

console.log(v1)
console.log(vb2)





function test(){
    var a = 100;
    {
       var  b = 200; //함수의 로컬 변수이다 블록은 무시된다
    }
    console.log(v1) //함수 안에선 모듈변수를 사용할수 있다
    console.log(vb2)
    
    console.log(a)
    console.log(b)
}

console.log("---------------")

test()
