var LON = readline().replace(',', '.');
var LAT = readline().replace(',', '.');
var N = parseInt(readline());

var closest = Number.MAX_SAFE_INTEGER;
var closestName = '';

for (var i = 0; i < N; i++) {
    var [,name,,,longitude,latitude] = readline().split(`;`);

    longitude = longitude.replace(`,`, `.`)
    latitude = latitude.replace(`,`, `.`)

    var x = (longitude - LON)*Math.cos((LAT-latitude)/2);
    var y = latitude - LAT;
    var d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) * 6371;
    if (d < closest) {
        closest = d;
        closestName = name;
    }
}

print(closestName);
