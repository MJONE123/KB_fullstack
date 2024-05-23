const fs = require('fs');

fs.readFile('./chapter02/readme.txt', 'utf-8', function(err,data){
    if(err) {
        throw err;
    }
    console.log('1번', data.toString());
});
fs.readFile('./chapter02/readme.txt', 'utf-8', function(err,data){
    if(err) {
        throw err;
    }
    console.log('2번', data.toString());
});
fs.readFile('./chapter02/readme.txt', 'utf-8', function(err,data){
    if(err) {
        throw err;
    }
    console.log('3번', data.toString());
});
fs.readFile('./chapter02/readme.txt', 'utf-8', function(err,data){
    if(err) {
        throw err;
    }
    console.log('4번', data.toString());
});
    