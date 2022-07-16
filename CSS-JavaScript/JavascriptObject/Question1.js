let txt = "I am vinay singh chouhan and where people are earning one lakh/month in this world. I am try to finish PJP instand of coding and waiting for onboarding";

// console.log(txt.includes("world"));
if(txt.includes("world")){
    console.log(`First occurence of the world is ${txt.indexOf("world")} in txt string`);
}else{
    console.log("txt does not contains substring world");
}
