xverts = set()
yverts = set()

for _ in range(3):
    vert = [int(n) for n in input().split()]
    if vert[0] in xverts:
        xverts.remove(vert[0])
    else:
        xverts.add(vert[0])
    if vert[1] in yverts:
        yverts.remove(vert[1])
    else:
        yverts.add(vert[1])

print(xverts.pop(), yverts.pop())