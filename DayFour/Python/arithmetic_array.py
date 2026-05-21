def perform_operation(array,number):

    for count in range (1,len(array),1):

        if (array[0] + array[count] == number):
            
            newArray = [0,1]

            newArray[0] = array[0]

            newArray[1] = array[count]

    return newArray
