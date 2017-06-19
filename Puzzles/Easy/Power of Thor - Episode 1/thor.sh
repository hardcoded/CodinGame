# lightX: the X position of the light of power
# lightY: the Y position of the light of power
# initialTX: Thor's starting X position
# initialTY: Thor's starting Y position
read lightX lightY initialTX initialTY

# game loop
while true; do
    # remainingTurns: The remaining amount of turns Thor can move. Do not remove this line.
    read remainingTurns

    directionX=""
    directionY=""
    if [ $initialTY -gt $lightY ]
	then
	    directionY="N"
	    initialTY=$(($initialTY - 1))
	elif [ $initialTY -lt $lightY ]
	then
	   	directionY="S"
	  	initialTY=$(($initialTY + 1))
	fi
	if [ $initialTX -gt $lightX ]
	then
	    directionX="W"
	    initialTX=$(($initialTX - 1))
	elif [ $initialTX -lt $lightX ]
	then
	   	directionX="E"
	    initialTX=$(($initialTX + 1))
	fi
	echo $directionY$directionX
done
