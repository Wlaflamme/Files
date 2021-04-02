import random
number_dict={}

number_list = [random.randint(1,99) for i in range(10)]
print(number_list)
number_list.sort()
for num in number_list:
    number_dict[num]=1

contain_duplicates=False
for i in range(9):
    if number_list[i]==number_list[i+1]:
        contain_duplicates=True
        print("There are duplicate values in the dictionary.")
        break

if not contain_duplicates:
    print("There are no duplicate values in the dictionary")