let isPrime = function (num){
    let check = true;
    for(let i=0;i<Math.sqrt(num);i++){
        if(num%i===0){
            check = false;
        }
    }
    if(check === true){
        console.log("Number is Prime.");
    }else{
        console.log("Number is not prime.");
    }
}