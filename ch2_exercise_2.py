boy = int(input('How many males in a class: '))
girl = int(input('how many females in a class: '))

total = boy + girl

percent_male = boy/total
percent_female = girl/total

print('the percent of males is:', "{:.2%}".format(percent_male))
print('the percent of males is:', "{:.2%}".format(percent_female))