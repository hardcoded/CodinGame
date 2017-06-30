m=Math.abs;n=readline();(t=readline().split(" "))!=''?r=t[0]:r=0
for(j of t){l=m(r);z=m(j);if(l>z||l==z&&r<j)r=j}print(r)
