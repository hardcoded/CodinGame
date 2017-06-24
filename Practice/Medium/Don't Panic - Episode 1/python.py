import sys
import math

# nb_floors: number of floors
# width: width of the area
# nb_rounds: maximum number of rounds
# exit_floor: floor on which the exit is found
# exit_pos: position of the exit on its floor
# nb_total_clones: number of generated clones
# nb_additional_elevators: ignore (always zero)
# nb_elevators: number of elevators
nb_floors, width, nb_rounds, exit_floor, exit_pos, nb_total_clones, nb_additional_elevators, nb_elevators = [int(i) for i in raw_input().split()]
elevators = {}
for i in xrange(nb_elevators):
    # elevator_floor: floor on which this elevator is found
    # elevator_pos: position of the elevator on its floor
    elevator_floor, elevator_pos = [int(j) for j in raw_input().split()]
    elevators[elevator_floor] = elevator_pos

# game loop
while True:
    # clone_floor: floor of the leading clone
    # clone_pos: position of the leading clone on its floor
    # direction: direction of the leading clone: LEFT or RIGHT
    clone_floor, clone_pos, direction = raw_input().split()
    clone_floor = int(clone_floor)
    clone_pos = int(clone_pos)

    if (clone_floor < 0) or (clone_floor == exit_floor):
        direction2Exit = ("RIGHT", "LEFT")[exit_pos - clone_pos > 0]
        result = ("BLOCK", "WAIT")[direction2Exit != direction]
    else:
        elevator_pos = elevators[clone_floor]
        direction2Elevator = ("RIGHT", "LEFT")[elevator_pos - clone_pos > 0]

        if (elevator_pos - clone_pos == 0):
            result = "WAIT"
        else:
            result = ("BLOCK", "WAIT")[direction2Elevator != direction]

    # action: WAIT or BLOCK
    print result
