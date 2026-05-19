user_input = int(input("Enter a number: "))

sum = 0

for number in range(1,user_input + 1,1):
    
    sum += number
print(f"The sum of numbers from 1 to {user_input} is {sum}")
