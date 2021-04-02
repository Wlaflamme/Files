def main():
    my_string = input('Enter a string: ').lower()

    count = 0
    totalCounts = 0
    mostFrequentCharacter = ""

    for ch in my_string:
        for str in my_string:
            if str == ch:
                count += 1
        if count > totalCounts:
            totalCounts = count

        count = 0

    for ch in my_string:
        for str in my_string:
            if str == ch:
                count += 1
        if count == totalCounts:
            if(ch not in mostFrequentCharacter):
                 mostFrequentCharacter += ch

        count = 0

    if len(mostFrequentCharacter) > 1:
        print('The most popular characters are', mostFrequentCharacter, end="")
        print(' they appear', totalCounts, 'times.')

    else:
        print('The most popular character is', mostFrequentCharacter, end="")
        print(' it appears', totalCounts, 'times.')

main()