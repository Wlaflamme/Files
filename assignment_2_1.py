f = int(input('Enter a positive integer (greater than zero): '))
total = f
c = f - 1
if f > 0:
    for count in range(c):
        total = total * c
        c = c - 1

    print('The factorial of', f, 'is', total)
else:
    print('That is not an integer greater than zero')
