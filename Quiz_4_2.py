def n_vowels(string):
    vowel = 'aeiou'
    num_v = 0
    for r in string:
        if r.lower() in vowel:
            num_v +=1
    return num_v

def n_consonants(string):
    consonant = 'bcdfghjklmnpqrstvwxyz'
    num_c = 0
    for r in string:
        if r.lower() in consonant:
            num_c += 1
    return num_c

u_string = input('enter string: ')

v = n_vowels(u_string)
c = n_consonants(u_string)

print('the string has', v, 'vowels and', c, 'consonants')