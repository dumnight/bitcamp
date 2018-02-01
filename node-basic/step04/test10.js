"use strict"
//객체 2 - 배열과 for 문

var arr = [10, 20, 30, 40];
for (var i in arr) {
    console.log(arr[i])
}

console.log("---------------------------")

for (var value of arr) {
    //배열인 경우 value 변수에는 배열의 각 항목의 값이 저장된다
    console.log(value);
}

//forEach(콜백함수)
//내부적으로 반복문을 돌면서 콜백함수를 호출해준다
arr.forEach(function(value, index) {
    console.log(index, value)
});
