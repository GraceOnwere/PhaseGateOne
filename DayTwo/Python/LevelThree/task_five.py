user_input = int(input("Enter a number: "))

factorial = 1

for number in range(1,user_input + 1,1):
    
    factorial *= number
print(f"Factorial of {user_input} is {factorial}")
