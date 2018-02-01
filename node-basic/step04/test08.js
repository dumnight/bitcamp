"use strict"
//객체 2 - 객체 리턴

function car(name) {
    switch (name) {
    case "티코":
        return {
            model: '티코',
            cc: 800,
            run: function(){console.log("티이이이코오오오오")}
    };
    case "소나타":
        return {
            model: "소나타",
            cc: 1998,
            run: function(){console.log("소오오오나타아아아")}
    };
    default:
        return {
            model: "테슬라",
            run: function(){console.log("테스으으으으을라아아")}
    };
    }
}

var c1 = car("소나타");
var c2 = car("티코");
var c3 = car("기타");

console.log(c1);
console.log(c2);
console.log(c3);
