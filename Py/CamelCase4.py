import re
try:
    while True:
        ip=input().rstrip()
        op,mcv,s=ip.split(";")
        if op=="S":
            if mcv=="M":
                temp=s[0:-2]
            else:
                temp=s
            res=re.sub(r"(\w)([A-Z])", r"\1 \2", temp)
            print(res.lower())
        if op=="C":
            temp=s.title()
            res=re.sub(r" ", r"", temp)
            if mcv=="M":
                print(res[0].lower()+res[1:]+"()")
            elif mcv=="V":
                out=res[0].lower() +res[1:]
                print(out)
            else:
                print(res)
except EOFError:
    pass
