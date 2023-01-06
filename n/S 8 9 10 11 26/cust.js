var mysql=require('mysql');
var con=mysql.createConnection({
    host:"localhost",
    user:"root",
    database:"practice1",
    pass:""
});

con.connect(function(err,result){
    if(err) throw err;
    console.log("Connected");
    con.query("Select * from customer",function(err,result){
        if(err) throw err;
        console.log(result);
    });
});