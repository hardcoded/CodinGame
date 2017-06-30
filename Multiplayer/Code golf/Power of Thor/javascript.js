i=readline().split(' ').map(Number);while(1)(i[3]>i[1]?(d="N",i[3]--):(i[3]<i[1]?(d="S",i[3]++):d=""))+(i[2]>i[0]?(d+="W",i[2]--):(i[2]<i[0]?(d+="E",i[2]++):d+="")),print(d)
