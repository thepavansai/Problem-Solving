def countpairs(mat1,mat2,n,x):
    i1=0
    j1=0
    i2=n-1
    j2=n-1
    count=0
    while(i1<n and i2>=0):
        ans=mat1[i1][j1]+mat2[i2][j2]
        if(ans==x):
            count+=1
            j1+=1
            j2-=1
        elif(ans<x):
            j1+=1
        else:
            j2-=1
        if(j1==n):
            j1=0
            i1+=1
        if(j2==-1):
            j2=n-1
            i2-=1
    return count
