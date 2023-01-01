var express= require('express');
var app= express();
var bodyParser=require('body-parser');
const { response } = require('express');
var urlencodedParser=bodyParser.urlencoded({extended:false})
app.get('/form2',function(req,res){
    res.sendFile(__dirname+"/"+"form2");
})
app.post('/processForm2',urlencodedParser,function(req,res){
    response={
        first_name:
    }
})
  
    
