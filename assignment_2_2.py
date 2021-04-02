# This program displays a stair-step pattern.
num_steps = int(input('Enter number of rows: '))

for r in range(num_steps):
   print('#', end='')
   for c in range(r):
      print(' ', end='') 
   print('#')
