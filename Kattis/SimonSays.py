num = int(input())

for i in range(0, num):
    text = input()
    if text[0:10] == "Simon says":
        print(text[11:])