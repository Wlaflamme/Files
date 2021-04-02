import turtle

amount_due = 5000.0
monthly_payment=amount_due/12
print('monthly pay ', monthly_payment)
print('monthly pay ', format(monthly_payment, '2f'))
print('monthly pay ', format(monthly_payment, '10.2f'))

balance = 123456789
print('my balance is', format(balance, ',.2f'))

age = 25

print('age is', format(age, '5d'))#field width of 5, default right alignment
print('age is', format(age, '>5d'))#right alignment
print('age is', format(age, '<5d'))#left alignment
print('age is', format(age, '^5d'))#center alignment

print('age is', format(age, '05d'))#field fill
print('age is', format(age, '#>5d'))
print('age is', format(age, '#<5d'))

print('age is', format(age, '+d'))
print('age is', format(age, '-d'))

num1 = 10
num2 = 12

print('10 in hex is', format(num1, 'x'))
print('12 in binary is', format(num2, 'b'))

name = 'tom'
age2 = 40

xyz = f'The age of {name} is {age2}'

print(xyz)

import turtle

turtle.showturtle()
turtle.dot(20,'blue')
turtle.forward(50)
turtle.circle(100)
turtle.left(90)
turtle.dot()
turtle.forward(30)
turtle.dot()
turtle.right(60)
turtle.forward(40)
turtle.dot(30,'red')
turtle.done()

