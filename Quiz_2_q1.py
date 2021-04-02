tuition = 8000.00
percent = 0.03
year = 5

print('the tuition starts at', tuition)

for r in range(year):
    tuition = tuition + (tuition * percent)
    print('the', r + 1, 'year tuition is', tuition)