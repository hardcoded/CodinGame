import sys
import math

width, height = int(raw_input()), int(raw_input())

grid = [raw_input() for _ in range(height)]

for y1 in range(height):
    for x1 in range(width):
        if grid[y1][x1].isdigit():
            x2, y2 = -1, -1
            x3, y3 = -1, -1

            for i in range(x1 + 1, width):
                if grid[y1][i].isdigit():
                    x2, y2 = i, y1
                    break

            for i in range(y1 + 1, height):
                if grid[i][x1].isdigit():
                    x3, y3 = x1, i
                    break

            print x1, y1, x2, y2, x3, y3
