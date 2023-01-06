/*var http=require('http');

var server=http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write("Hello World");
    res.end();
}).listen(8080);*/

var mysql=require('mysql');
var con=mysql.createConnection({
    host:"localhost",
    user:"root",
    password:""
});

con.connect(function(err){
    if(err) throw err;
    console.log("connected");

    con.query("CREATE DATABASE  IF NOT EXISTS h7",function(err,result){
        if(err) throw err;
        else{
            console.log("Database Created");
            con.query("use h7");

            var sql="CREATE TABLE Student1(rollno INT,name VARCHAR(20),city VARCHAR(20))";
            con.query(sql,function(err,result){
                if(err) throw err;
                else{
                    console.log("Table created");
                    con.query("use h7");
                    var records=[[1,'kaveri','pune'],
                                [2,'shivani','Mumbai'],
                                [3,'radha','pune']];

                    con.query("INSERT INTO Student1(rollno,name,city)VALUES?",[records],function(err,result){
                        if(err) throw err;
                        else{
                            console.log(result);
                            con.query("use h7");

                            var sql="select * from Student1";
                            con.query(sql,function(err,result){
                                if(err) throw err;
                                console.log(result);
                            });
                        }
                    });
                }

            });
        }
    })

});