var n = parseInt(readline()); // the number of temperatures to analyse
var temps = readline(); // the n temperatures expressed as integers ranging from -273 to 5526

var res;
if (n !== 0) {
    var tab = temps.split(" ");
    var temp = [];
    for (var i = 0; i < n; i++) {
        temp[i] = parseInt(tab[i]);
    }
    res = temp[0];
    for (var j = 0; j < n; j++) {
        if(Math.abs(res) > Math.abs(temp[j]) || (Math.abs(res) == Math.abs(temp[j]) && res < temp[j])) {
            res = temp[j];
        }
    }
}
else {
    res = 0;
}

print(res);
