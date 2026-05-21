import {performOpertion} from "./arithmetic-array.js"

//class testThatperformOpertion

test("test that i have an array and a number returns any elements that gives the number",() => {

   let array = [8,6,12,4,-2]

   let number = 6

   let expected = [8,-2]

   expect(performOpertion(array,number)).toEqual(expected);

})
