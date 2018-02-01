"use strict"
//객체 2 - 복잡한 객체 생성 단축 문법 + 배열포함

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
        tires: [
            {
                model: "가즈아",
                maker: "가즈아타이어"
            }, {
                model: "가즈아",
                maker: "가즈아타이어"
            }, {
                model: "가즈아",
                maker: "가즈아타이어"
            }, {
                model: "가즈아",
                maker: "가즈아타이어"
            }
        ]
}; 

car.engine.startup();
car.run();