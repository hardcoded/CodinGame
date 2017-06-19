var width = parseInt(readline());
var height = parseInt(readline());

var grid = [];
for (var i = 0; i < height; i++) {
    grid[i] = readline(); // width characters, each either 0 or .
}

for(var y1 = 0; y1 < height; y1++) {
    for(var x1 = 0; x1 < width; x1++) {
        if (grid[y1][x1] == '0') {
            var x2 = '-1';
            var y2 = '-1';
            var x3 = '-1';
            var y3 = '-1';

            for(var i = x1+1; i < width; i++) {
                if (grid[y1][i] == '0') {
                    x2 = i;
                    y2 = y1;
                    break
                }
            }

            for(var i = y1+1; i < height; i++) {
                if (grid[i][x1] == '0') {
                    x3 = x1;
                    y3 = i;
                    break
                }
            }

            print(x1, y1, x2, y2, x3, y3)
        }
    }
}
    
