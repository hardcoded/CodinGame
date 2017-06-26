# game loop
while true; do
    highestMountain=0
    highestMountainIndex=0

    for (( i=0; i<8; i++ )); do
        # mountainH: represents the height of one mountain.
        read mountainH
        if [ $mountainH -gt $highestMountain ]
    	then
    	    highestMountainIndex=$i
            highestMountain=$mountainH
    	fi
    done
    echo $highestMountainIndex # The index of the mountain to fire on.
done
