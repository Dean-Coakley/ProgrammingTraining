import math
h, ang = map(int, input().split())
rad = math.radians(ang)
print(math.ceil(h/math.sin(rad)))