print ('Enter a integer')
g = int(input())
def line(n):
    if(n>g):
        return

    for i in range(0,n):
        print('*', end='')
    print()
    n+=1
    return line(n)
line(1)