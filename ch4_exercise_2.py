# This program calculates the sum of a series
# of numbers entered by the user.

number = 0.0  # The maximum number

# Initialize an accumulator variable.
total = 0.0
   
# Explain what we are doing.
print('This program calculates the sum of')
print('numbers you will enter. until you enter a negative number')

# Get the numbers and accumulate them.
while number >= 0:
    number = int(input('Enter a number: ')) 
    if(number>=0):
        total = total + number


# Display the total of the numbers.
print('The total is', total)


