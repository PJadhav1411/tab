var mysql=require('mysql');
var con=mysql.createConnection({
    host:"localhost",
    user:"root",
    password:""
});
con.connect(function(err){
if(err) throw err;
console.log("Connected");
con.query("CREATE DATABASE practical",function(err,result){
    if(err)throw err;
    else{
    console.log("Database created");
    con.query("use practical");
    var sql="CREATE TABLE customer1(cid INT,cname VARCHAR(255),phone INT(10),city VARCHAR(255))";
    con.query(sql,function(err,result){
        if(err) throw err;
        console.log("Table created");
    });
    }
});
});