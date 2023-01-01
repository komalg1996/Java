const { response } = require('express');
var express=require('express');
var app=express();
//app.use(express.static('public')); 
app.get('/form',function(req,res){
    res.sendFile("public/form.html",{root:__dirname});
})
app.get('/formdata',function(req,res){
    resp={
        first_name:req.query.fn,
        last_name:req.query.ln
    };
    console.log(resp);
    res.end(JSON.stringify(resp));

})
app.listen(8000);
console.log("running!!!");