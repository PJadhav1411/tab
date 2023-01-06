var fs=require('fs')
fs.readFile('demo1.txt','UTF-8',function(err,data)
{
     if(err){
         console.log("404 Not Found");
     }
     else
       console.log(data);
 })