strs = ["ab","a"]
characterSeperated = []
prefix = ""
for i in range(len(strs)):
    characterSeperated.append(list(strs[i]))
print(characterSeperated)


#check first letter of each word
#move onto second letter
i=0
noMorePrefixes = False
while (i<len(min(strs, key=len))):
    for wordIndex in range(len(characterSeperated)):
        if characterSeperated[0][i] != characterSeperated[wordIndex][i]:
            noMorePrefixes = True
    if noMorePrefixes == False:
        prefix += characterSeperated[0][i]
    else:
        break
    i+=1
    
    '''
    for wordList in strs:
        if strs[0] == strs[i]:
            prefix+=strs[0]
            '''
            
            
print(prefix)
    