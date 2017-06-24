import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

# w: width of the building.
# h: height of the building.
W, H = [int(i) for i in raw_input().split()]
n = int(raw_input())  # maximum number of turns before game over.
X, Y = [int(i) for i in raw_input().split()]

minH = 0
maxH = H - 1
minW = 0
maxW = W - 1

# game loop
while True:
    bomb_dir = raw_input()  # the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

    for c in bomb_dir:
        if c == 'L':
            maxW = X - 1
        elif c == 'R':
            minW = X + 1
        elif c == 'U':
            maxH = Y - 1
        elif c == 'D':
            minH = Y + 1

    Y = int((minH + maxH) / 2)
    X = int((minW + maxW) / 2)

    # the location of the next window Batman should jump to.
    print X, Y
