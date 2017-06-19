m=Math.abs;n=readline();(t=readline())!=0?(t=t.split(" "),r=t[0]):r=0
for(j=0;j<n;j++){k=t[j];l=m(r);z=m(k);if(l>z||(l==z&&r<k))r=k}print(r)
