def check_like_text(array):
    
    for count in range(0,len(array),1):
            
#       new_array = [array[count]]
        if len(array) == 0:
            return "no one likes this"
        elif len(array) == 1:

            return  array[count] + "likes this"

        elif len(array) == 2:

            return array[count] +" " + "and likes this"
#    for counter in range(0,len(new_array),1):

print(check_like_text(["Peter","Jacob"]))
