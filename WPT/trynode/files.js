var fs=require('fs');

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

//delete a file using fs.unlink()method:
fs.unlink('mynewfile2.txt',function (err) {
    if (err) throw err;
    console.log('File deleted!!');
});