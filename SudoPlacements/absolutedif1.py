for i in range(t):
    n,k = input().split()
    li = list(map(str, input().split()))
    final = list()
    boo = True
    for i in li:
        if(int(i)<int(k)):
            lis = list(i)
            for j in range(len(lis)-1):
                if(ord(lis[j])==(ord(lis[j+1])+1) or ord(lis[j])==(ord(lis[j+1])-1)):
                    if(boo==False):
                        break
                    else:
                        boo = True
                        
                else:
                    boo = False
                    break
            if(boo):
                final.append(i)
        boo = True
    if(len(final)==0):
        print(-1)
    else:
        print(" ".join([i for i in final]))
