import sys
import math

n = int(raw_input())  # Number of elements which make up the association table.
q = int(raw_input())  # Number Q of file names to be analyzed.
types = dict()

for i in xrange(n):
    ext, mt = raw_input().split()
    types.update({ext.lower(): mt})
for i in xrange(q):
    fname = raw_input().lower()  # One file name per line.
    if (fname.find('.') > -1) :
        type = fname[fname.rfind('.') + 1 : len(fname)].lower();
        print(("UNKNOWN", types.get(type))[bool(type in types)])
    else :
        print("UNKNOWN")
