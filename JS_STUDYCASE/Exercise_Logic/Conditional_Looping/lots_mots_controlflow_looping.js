let maxNumber = 20;

for(let i=1; i<=20; i++){
  if(i%3===0 && i%5===0){
    console.log("FizzBuzzzz");
  }else if(i%3===0){
    console.log("Fizz");
  }else if (i%5===0){
    console.log("Buzzz");
  }else{
    console.log(i);
  }
}