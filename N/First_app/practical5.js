var fs=require('fs')
var myfile='demo1.txt'
var mytext='demo2.txt'
let body="";


body=fs.readFileSync('demo1.txt','UTF-8')
console.log(body);
fs.appendFile(mytext,body,'UTF-8',(error)=>
{
     if(error){
         console.log(error.message);
     }
     else
       console.log("sucessfully appended the content to the file");
 })

