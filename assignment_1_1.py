print('Change counting game')
penny = int(input('Enter amount of pennies: '))
nickel = int(input('Enter amount of nickels: '))
dime = int(input('Enter amount of dime: '))
quarter = int(input('Enter amount of quarters: '))

total = penny+nickel*5+dime*10+quarter*25

if(total==100):
    print('congrats you win')

elif(total<100):
    print('You were under a dollar')

else:
    print('You were over a dollar')
