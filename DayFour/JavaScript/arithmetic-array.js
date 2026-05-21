export const performOpertion = (array,number)=>{

    let newArray = [0,1]

     
    for (let count = 1; count < array.length ; count++){
    

    if (array[0] + array[count] == number){

        newArray [0] = array[0];

        newArray [1] = array[count]; 
              
        }

    }
    return newArray;
    }

