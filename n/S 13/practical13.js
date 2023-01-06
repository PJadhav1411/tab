var http = require('http');
var fs = require('fs');
var formidable = require('formidable');
var mysql = require('mysql');

var con = mysql.createConnection(
    {
        host: 'localhost',
        user:'root',
        password:'',
        database:'nodejs_prac'
    });

    http.createServer(function(req,res)
    {
        if(req.url=='/')
        {
            res.writeHead(200,{'content-type':'text/html'});
            res.write('<form action="fapp" method="post" enctype="multipart/form-data">');
            res.write('<center><h1>Registration Form </h1> <br>');
            res.write('User Name : <input type = "text" name="t1"><br><br>');
            res.write('Password : <input type = "password" name="t2"><br> <br>');
            res.write('<input type="submit" value="LOGIN"> </center>');
            res.end();

        }
        else if(req.url=='/fapp')
        {
            var form = new formidable.IncomingForm();
            form.parse(req,function(err,fields,files)
            {
                var user = fields.t1;
                var pwd = fields.t2;
                res.write('<h1><center> Hello : '+user+ '</center></h1><br>');
                con.connect(function(err)
                {
                    if(!err)
                    {
                        con.query("SELECT * from login where uname = ? and password= ?",[user,pwd],function(err,result,fields){
                        if(result.length>0)
                        {
                            res.end('<h1> <center> LOGIN SUCCESS </enter></h1>');

                        }
                        else
                        {
                            res.end('<h1><center>User Name and password not matching</center></h1>');
                        }
                        });
                    }
                }); 
            });

        }     
        else
        {
            res.end("Page Not Found");
        }
    }).listen(8030);
