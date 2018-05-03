words = input().split()
words_set = list(set(words))

print ("yes") if len(words) == len(words_set) else print ("no")
