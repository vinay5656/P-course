const checkPalindrome = function(str){
    let tailIndex = str.length-1;
    console.log(tailIndex);
    let check = true;
    for(let faceIndex=0;faceIndex<=tailIndex;faceIndex++){
        if(str[faceIndex]===str[tailIndex]){
           
        }else{
            check = false;
        }
        tailIndex--;
    }
    if(check===true){
        console.log("Palindrome");
    }else{
        console.log("Not Palindrome");
    }
}

checkPalindrome("sts");
checkPalindrome("vinay singh chauhan");
checkPalindrome("stststs");