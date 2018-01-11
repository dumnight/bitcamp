// 리터럴의 타입을 알아내기



console.log(typeof "문자열")
console.log(typeof '문자열')

console.log(typeof 100)
console.log(typeof 3.14)

console.log(typeof true)
console.log(typeof false)

console.log(typeof new Object()) //일반 객체 주소
console.log(typeof function(){})   //함수 객체 주소(객체 + 함수코드) 주소
console.log(typeof null) // null 객체

console.log(typeof undefined) // 값이 없음을 의미
console.log(typeof Infinity) // 무한대
console.log(typeof -Infinity) // - 무한대
console.log(typeof NaN) // 숫자가 아님