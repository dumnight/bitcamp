"use strict"
//객체 2 - 객체 파라미터

function play(nickname, spec) {
    console.log("자동차명=", spec.model)
    console.log("cc=", spec.cc)
    spec.run();
}

var car = {
        model: "소나타",
        cc: 1998,
        run: function(){
            console.log("RUN")
        },
}; 

play("하하", car);

console.log("--------------------------------")

play("흐흐", {
    model: '티코',
    cc: 800,
    run: function(){
        console.log("브르르ㅡㅇ르ㅡ릉")
    }
});