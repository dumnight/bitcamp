"use strict"
//객체 2 - 배열 2

//배열 단축 문법
var arr1 = []; 

console.log(arr1.length);

arr1[0] = 10;
arr1[1] = 20;

console.log(arr1.length);

//중간 인덱스를 건너뛰고 값을 넣을 수 있다

arr1[10] = 100;

console.log(arr1.length);

//자바 스크립트의 배열은 자바 언어의 ArrayList와 유사하다.
//값을 저장하는것이 아니라 값이 저장된 주소를 저장한다
arr1[11] = "ABC가즈아";
arr1[12] = true;
arr1[13] = {model:"소나탙"};
arr1[14] = function(){console.log("hello")};

console.log(arr1);

