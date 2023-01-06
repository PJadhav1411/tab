var mysql=require('mysql')
var con=mysql.createConnection({
    host:"localhost",
    user:"root",
    database:"practical",
    password:""
});

con.connect(function(err){
if(err) throw err;
console.log("connected");
var sql="select * from customer";
con.query(sql,function(err,result){
    if(err) throw err;
    console.log(result);
});

var sql="DELETE FROM customer WHERE city='pune'";
con.query(sql,function(err,result){
      if(err) throw err;
      console.log("Number of records deleted:"+result.affectedRows);
});


});