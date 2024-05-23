const fs = require('fs').promises;

fs.readFile('./chapter02/readme1.txt')
    .then(function (data) {
        console.log(data.toString());
        return fs.readFile('./chapter02/readme2.txt');
    })
    .then(function (data) {
        console.log(data.toString());
        return fs.readFile('./chapter02/readme3.txt');
    }) 
    .then(function (data) {
        console.log(data.toString());
        return fs.readFile('./chapter02/readme4.txt');
    }) 
    .then(function (data) {
        console.log(data.toString());
    })