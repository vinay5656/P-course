const convert = function(str){
    return str.split(" ").map(element => element[0].toUpperCase() + element.slice(1)).join(" ");
};

console.log(convert("i am vinay singh chouhan"));