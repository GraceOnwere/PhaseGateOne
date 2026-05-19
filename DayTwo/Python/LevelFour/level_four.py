print(add_two_numbers(1,2))

print(check_even(6))

print(calculate_square_of_number(12))

print(celcius_to_fahrenhit(50))

print(getLargest(12,13,15))

print(calculate_simple_interest())

def add_two_numbers(first_number,second_number):

    sum_of_numbers = first_number + second_number

    return sum_of_numbers

def check_even(number):

    if number % 2 == 0:
        return "Even";

    return "Odd"

def calculate_square_of_number(number):

    square_of_number = number ** 2

    return square_of_number

def celcius_to_fahrenhit(temperature):

    temp_to_fahrenhit = (temperature * (9/5) + 32)

    return temp_to_fahrenhit


def getLargest(number_one,number_two,number_three):

    largest = number_one

    if number_two > largest:

        largest = number_two

    if number_three > largest:
    
        largest = number_three

    return largest

def calculate_simple_interest(principal,rate,time):

    simple_interest = principal * rate * time

    return simple_interest

def calculate_area_of_rectangle(length,width):

    area = length * width

    return area


    
