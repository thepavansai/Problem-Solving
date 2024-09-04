def lis(ar):
    n= len(ar)
    l=[1]*n
    for i in range(1,n):
        for last in range(0,i):
            if(ar[i]>ar[last]):
                l[i]=max(l[i],l[last]+1)
    return max(l)

print(lis([8,23,4,27,14,34,23,69]))
