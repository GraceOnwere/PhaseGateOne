import random

number = random.randint(1,100)

correct_number = number

count = 0

for attempts in range(5):

    user_input = int(input("Enter a number: "))

#    if user_input := str:
#
#        print("Error")

    if 1 < user_input > 100:

        print("Doesn't count as an attempt\nTry again!'")

    elif user_input == correct_number:
        
        print("Correct\nYou're a genius!!!")

        count+=1

        break;

    elif user_input < correct_number:

        print("Higher")
        count+=1

    else:

        print("lower")
        count+=1

rating = " "
if count == 1:
    rating = "Legendary"

elif count == 2:
    rating = "Excellent"

elif count == 3 or count == 4:
    rating = "Good"

else:
    rating = "Close!\nBetter luck next time"


print(f"\tFinal Summary\nThe Correct Number is {correct_number} attempts used {count}\n{rating} ")



    
    
    


