var N = parseInt(readline()); // Number of elements which make up the association table.
var Q = parseInt(readline()); // Number Q of file names to be analyzed.

var types = new Map();

for (var i = 0; i < N; i++) {
    const [extension, mime] = readline().split(' ');
    types.set(extension.toLowerCase(), mime);
}

for (var i = 0; i < Q; i++) {
    let fileName = readline().toLowerCase();
    if (fileName.indexOf`.` > -1) {
        const fileType = fileName.split`.`.pop();
        print(types.has(fileType) ? types.get(fileType) : `UNKNOWN`);
    }
    else {
        print`UNKNOWN`;
    }
}
