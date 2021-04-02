file_obj = open('golf.txt', 'w')

name = input('Enter the name of a golfer or q if you\'re done: ')

while name != 'q' and name != 'Q':
    score = int(input('Enter the golf score of player ' + name + ': '))

    file_obj.write(name + '\n')
    file_obj.write(str(score) + '\n')

    name = input('Enter the name of a golfer or q if you\'re done: ')

file_obj.close()