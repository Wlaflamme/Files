price = 99.0
total = 0.0

quantity = int(input('How many packages purchased: '))

if(quantity<0):
    print('That is not a valid quantity input')

elif(0 <= quantity < 10):
    total = price*quantity
    print('There is no discount')
    print('The total of the purchase comes to $',total)

elif(10 <= quantity < 20):
    total = (price * quantity)*.8
    print('There is a discount of 20%')
    print('The total of the purchase comes to $', total)

elif(20 <= quantity < 50):
    total = (price * quantity)*.7
    print('There is a discount of 30%')
    print('The total of the purchase comes to $', total)

elif (50 <= quantity < 100):
    total = (price * quantity) * .6
    print('There is a discount of 40%')
    print('The total of the purchase comes to $', total)

else:
    total = (price * quantity)*.5
    print('There is a discount of 50%')
    print('The total of the purchase comes to $', total)