var http = require('http');
var server = http.createServer(function(req,res){
//var path = req.url.replace(/\/?(?:\?.*)?$/, '').toLowerCase();

switch(path) {
case '' :

res.writeHead(200, {'Content-Type': 'text/html'});
res.end('<h1>Home Page</h1>');
break;
case '/about' :

res.writeHead(200, {'Content-Type': 'text/html'});
res.end('<h1>About us</h1>');
break;

default:

res.writeHead(404, { 'Content-Type': 'text/plain' });
res.end('Not Found');
break;

}
});
server.listen(3000);