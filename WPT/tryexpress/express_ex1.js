var express = require('express');
var app = express();
app.get('/', function (req, res) {
    res.send('welcome to all');
});
app.get('/home', function (req, res) {
    // res.send("<h1>Home page</h1>");
    res.sendFile("public/home.html", { root: __dirname })
})
app.get('/about', function (req, res) {
   // res.send("<h1>About us</h1>");
   res.sendFile("public/about.html",{root:__dirname})
})
app.listen(3000);
console.log("running");

