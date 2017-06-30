[,,,ef,ep,,,ne]= readline().split(' ');e=[];[b,w,ri,l]=["BLOCK","WAIT","RIGHT","LEFT"]
for(i=0;i<ne; i++)a=readline().split(' '),e[~~a[0]]=~~a[1]
while(1)[cf,cp,d]=readline().split(' '),cf=~~cf,cp=~~cp,cf<0||cf==ef?(de=ep-cp>0?ri:l,r=de!=d?b:w):(elp=e[cf],del=elp-cp>0?ri:l,r=elp-cp==0?w:del!=d?b:w),print(r)
