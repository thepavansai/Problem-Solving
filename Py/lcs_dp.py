def lcs(s1,s2):
    m=len(s1)
    n=len(s2)
    dp=[[0]*(n+1) for _ in range(m+1)]
    for i in range(1,m+1):
        for j in range(1,n+1):
            if(i==0 or j==0):
                dp[i][j]=0
            elif (s1[i-1]==s2[j-1]):
               dp[i][j]=dp[i-1][j-1]+1
            else:
                dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    print("LCS length: ",dp[m][n])
    l=''
    i=m
    j=n
    while i>0 and j>0 :
        if(s1[i-1]==s2[j-1]):
            l=l+s1[i-1]
        elif(dp[i][j-1]>dp[i-1][j-1]):
            j=j-1
        else:
            i=i-1
    print("Lcs is : ",l[::-1])

sq=input("Enter the String: ").replace(' ','')
sw=input("Enter the String: ").replace(' ','')
lcs(sq.lower(),sw.lower())
