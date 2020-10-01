def CEF(L1,L2):
    Output = []
    for i in L1:
        for j in L2:
            if i != j:
                continue
            else:
                Output.append(i)

    return Output

L1=[1,2,3,5,8]
L2=[1,2,7,3,6]
print(CEF(L1,L2))
