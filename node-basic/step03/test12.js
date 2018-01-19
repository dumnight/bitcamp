"use strict"



var prompt = require('prompt');

prompt.start();

prompt.get(['name', 'tel'], function(err, result) {
  console.log('입력결과:');
  console.log('이름=', result.name)
  console.log('번호=', result.tel)
  
})

