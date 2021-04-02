purchase = float(input('Enter the price of purchase: '))
state_tax = 0.05*purchase
county_tax = 0.025*purchase
total_tax = state_tax + county_tax
total = total_tax + purchase

print('the purchase price is:', format(purchase, '10.2f'))
print('the state sales tax is:', format(state_tax, '10.2f'))
print('the county sales tax is:', format(county_tax, '10.2f'))
print('the total sales tax is:', format(total_tax, '10.2f'))
print('the total of the sale is:', format(total, '10.2f'))

