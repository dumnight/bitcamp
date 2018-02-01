"use strict"
//객체 2 - 복잡한 객체 생성 단축 문법

var car = {
        model: "소나타",
        cc: 1998,
        run: function(){
            console.log("RUN")
        },
        engine: {
            maker: "비트자동차",
            startup: function(){
                console.log("START")
            }
        },
}; 

car.engine.startup();
car.run();