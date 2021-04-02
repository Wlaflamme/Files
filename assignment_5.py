a = open("Kennedy.txt","r")

word = {}
lines = 0

for line in a:
    lines = lines +1
    words = line.split()

    for index in range(0,len(words)):
        if words[index] in word:
            if lines not in word[words[index]]:
                word[words[index]].append(lines)
a.close()

output = open('index.txt','w+')

for key in sorted(word.keys()):
    output.write("%s:"%(key))
    for value in word[key]:
        output.write(" %d" %(value))
    output.write("\n")

output.close()