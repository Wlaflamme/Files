file_obj = open('golf.txt', 'r')

name = file_obj.readline().rstrip('\n')

print('\n' + '\033[4m' + 'Name              Score' '\033[0m')

while name!= '':
    score = int(file_obj.readline())
    print(format(name, '12s'), format(score, '>10d'))

    name = file_obj.readline().rstrip('\n')

file_obj.close()