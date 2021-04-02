weight = float(input('What is your weight in pounds: '))
height = int(input('what is your height in inches: '))

BMI = weight*(703/(height*height))

print("Your BMI is ", format(BMI, '10.2f'))

if(18.5<BMI<25):
    print('You have an optimal weight')
elif(BMI<18.5):
    print('You are underweight')
else:
    print('You are overweight')