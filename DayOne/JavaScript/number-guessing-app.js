
    let prompt = require("prompt-sync")();

    let random = Math.floor(Math.random()* 100) + 1

    let count = 0;
    
        for (let attempts = 0; attempts < 5; attempts++){

            let userInput = prompt("Enter a number: ");
    

            if (1 < userInput && userInput > 100)

            console.log("Doesn't count as an attempt\nTry again!'");

           else if (userInput == random){
        
           console.log("Correct\nYou're a genius!!!");

           count+=1;

           break;
           }
    
           else if  (userInput < random){

           console.log("Higher");
           count+=1;
           }
           else{ 

           console.log("lower");
           count+=1;
           }

        }

let rating = " ";
if (count == 1)
    rating = "Legendary";

else if (count == 2)
    rating = "Excellent";

else if (count == 3 || count == 4)
    rating = "Good";

else
    rating = "Close!\nBetter luck next time";


console.log(`\tFinal Summary\nThe Correct Number is ${random} attempts used ${count} \n${rating}`);

console.log()
    

        
