import sys
import math

n = int(input())  # Number of elements which make up the association table.
q = int(input())  # Number Q of file names to be analyzed.
types = dict()

for i in range(n):
    # ext: file extension
    # mt: MIME type.
    ext, mt = input().split()
    types.update({ext.lower(): mt})
for i in range(q):
    fname = input().lower()  # One file name per line.
    if (fname.find('.') > -1) :
        type = fname[fname.rfind('.') + 1 : len(fname)].lower();
        print(("UNKNOWN", types.get(type))[bool(type in types)])
    else :
        print("UNKNOWN")
