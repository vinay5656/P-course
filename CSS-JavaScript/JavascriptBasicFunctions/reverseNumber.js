

let reveseNumber = function(number){
    let num = 0;
    while(number>0){
        num = num*10+number%10;
        number = Math.floor(number/10);
        // console.log(number);
    }
    return num;
};

console.log(reveseNumber(32243));
console.log(reveseNumber(12345));