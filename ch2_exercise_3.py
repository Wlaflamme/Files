sharenum = 2000
oprice = 40*sharenum
stbrold = oprice*.03

sell = 42.75
money = sell * sharenum
stbrnew = money * .03

print('joe paid: ', oprice)
print('joe paid his broker:', stbrold)
print('joe sold the stock for:', money)
print('joe paid his broker:', stbrnew)
print(money - (stbrnew + stbrold))

