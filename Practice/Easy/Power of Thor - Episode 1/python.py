import sys
import math

# light_x: the X position of the light of power
# light_y: the Y position of the light of power
# initial_tx: Thor's starting X position
# initial_ty: Thor's starting Y position
light_x, light_y, initial_tx, initial_ty = [int(i) for i in raw_input().split()]

# game loop
while True:
    remaining_turns = int(raw_input())  # The remaining amount of turns Thor can move. Do not remove this line.

    directionX = ""
    directionY = ""
    if initial_ty > light_y:
	    directionY = "N"
	    initial_ty -= 1
    elif initial_ty < light_y:
	   	directionY = "S"
	   	initial_ty += 1
    if initial_tx > light_x:
	    directionX = "W"
	    initial_tx -= 1
    elif initial_tx < light_x:
        directionX = "E"
        initial_tx += 1
    direction = directionY + directionX
    print(direction)
