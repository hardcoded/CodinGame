i = input().split()
ef = int(i[3])
ep = int(i[4])
ne = int(i[7])
e = {}
for i in range(ne):
    elf, elp = [int(j) for j in input().split()]
    e[elf] = elp
while 1:
    cf, cp, d = input().split()
    cf = int(cf)
    cp = int(cp)
    if (cf<0) or (cf==ef):
        r = ("BLOCK", "WAIT")[("RIGHT", "LEFT")[ep-cp>0]!=d]
    else:
        elp=e[cf]
        if elp-cp==0:
            r="WAIT"
        else:
            r=("BLOCK", "WAIT")[("RIGHT","LEFT")[elp-cp>0]!=d]
    print(r)
