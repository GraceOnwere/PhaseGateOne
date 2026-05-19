let prompt = require("prompt-sync")()

let priceOfItem = prompt("Enter price of Item : ");

let tenPercentTax = ((priceOfItem * 0.1) + priceOfItem);

console.log(`The 10% tax on your price is ${tenPercentTax}`)

