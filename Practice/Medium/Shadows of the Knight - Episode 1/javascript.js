let inputs = readline().split(' ');
const W = parseInt(inputs[0]); // width of the building.
const H = parseInt(inputs[1]); // height of the building.
const N = parseInt(readline()); // maximum number of turns before game over.
inputs = readline().split(' ');
let X = parseInt(inputs[0]);
let Y = parseInt(inputs[1]);

let minH = 0, maxH = H - 1, minW = 0, maxW = W - 1;

// game loop
while (true) {
    let bombDir = readline(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
    for(let c of bombDir) {
        switch (c){
            case 'L':
                maxW = X - 1;
                break;
            case 'R':
                minW = X + 1;
                break;
            case 'U':
                maxH = Y - 1;
                break;
            case 'D':
                minH = Y + 1;
                break;
        }
    }
    Y = Math.ceil((minH + maxH) / 2);
    X = Math.ceil((minW + maxW) / 2);

    // the location of the next window Batman should jump to.
    print(X, Y);
}
