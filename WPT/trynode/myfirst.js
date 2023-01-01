var http = require('http');
//var dt = require('./module')
//var url= require('url');
var fs = require('fs');
http.createServer(function (req, res) {
    fs.readFile('demofile.html', function (err, data) {
        res.writeHead(200, { 'Content-Type': 'text/html' });
        res.write(data);

        //create new file using appendFile()method:
        fs.appendFile('mynewfile.txt', 'hello u!', function (err) {
            if (err) throw err;
            console.log('saved!');
        });

        //create new empty file using open()method:
        fs.open('mynewfile2.txt', 'w', function (err, file) {
            if (err) throw err;
            console.log('saved!!');
        });

        //create new file using writefile()method:

        fs.writeFile('mynewfile3.txt', 'Hello content!', function (err) {
            if (err) throw err;
            console.log('Saved!');
        });
        return res.end();


        // res.write('Hello world');
        // res.write("The date and time noe are: "+dt.myDateTime);
        // res.write(req.url);
        //var q = url.parse(req.url, true).query;
        //var txt = q.year+" "+q.month;
        //res.end(txt);
    });
}).listen(8080);