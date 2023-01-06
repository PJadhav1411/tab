var mysql=require('mysql')
var con=mysql.createConnection({
    host:"localhost",
    user:"root",
   // database:"practical",
    password:""

});

con.connect(function(err){
    if(err) throw err;
    console.log("connected");
    con.query("CREATE DATABASE  IF NOT EXISTS h2",function(err,result){
        if(err) throw err;
        else{
               console.log("Dtabase created");
               con.query("use h2");

    var sql="CREATE TABLE Student(rollno INT,sname VARCHAR(20),city VARCHAR(20))";
    con.query(sql,function(err,result){
        if(err) throw err;
        else{
            console.log("Table Created");
            con.query("use h2");
            var records=[[1,'Kaveri','pune' ],
                         [2,'Shivani','Mumbai'],
                         [3,'Radha','Bombay']];


            con.query("INSERT INTO Student(rollno,sname,city)VALUES?",[records],function(err,result){
                if(err) throw err;
                else{
                    console.log("result");
                    con.query("use h2");
                    var sql="Select * from student";
                    con.query(sql,function(err,result){
                        if(err) throw err;
                        console.log(result);

                    });
                }
            });
        }

    });
}
});
});