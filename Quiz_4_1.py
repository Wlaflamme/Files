sentence = input('Enter your sentence as one word: ')

new_sentence = sentence[0]
for r in sentence[1:]:
    if r.isupper():
        new_sentence += ' ' + r.lower()
    else:
        new_sentence += r

print(new_sentence)
