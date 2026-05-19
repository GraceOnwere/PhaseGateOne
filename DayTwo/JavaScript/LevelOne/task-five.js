let prompt = require("prompt-sync")()

let temperature = prompt("Enter Temperature in Celsius : ");

let temperatureInFahrenheit = (temperature * (9/5) + 32);

console.log(`The Temperture in Fahrenhit is ${temperatureInFahrenheit}`)

