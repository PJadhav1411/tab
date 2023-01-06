var events=require('events');
var  eventEmitter=new events.EventEmitter();

var connectionHandler=function connected(s){
    console.log('ITs',s);
}

eventEmitter.on('data_received',function(name){
    console.log(name,"Understood Event-Driven");
});
eventEmitter.emit('data_received',"PETER");

eventEmitter.on('connection',connectionHandler);
eventEmitter.emit('connection',"SIMPLE SOLUTION");

console.log("Program ended");
