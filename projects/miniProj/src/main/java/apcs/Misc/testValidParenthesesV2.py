s="{[}]"
s = list(s)
open = ['(', '[','{']
close = [')',']','}']

#find closing paranthesis
#assuming starting parenthesis is open
def findEnding(startingParenthesisIndex):
    counter = 0 #counts how many parentheses of the same type
    absoluteCounter = 0
    openP = open.index(s[startingParenthesisIndex])
    i=startingParenthesisIndex+1
    while (i<len(s)):
        if(s[i] in open):
            if(open.index(s[i])== openP): # if current paranthesis tested is the same as starting paranthesis
                counter+=1
            absoluteCounter+=1
        elif(close.index(s[i]) == openP): #if current parentheses is a closer
            if(counter==0):
                if(absoluteCounter!=0):
                    return -1
                return i
            else:
                counter-=1
                absoluteCounter-=1
        else:
            absoluteCounter-=1
        i+=1
    return -1
   
def validateMiddle(index1, index2):
    totalOpen = 0
    totalClose = 0
    i=index1+1
    while(i<index2):
        if (s[i] in open):
            totalOpen+=1
        elif(s[i] in close):
            totalClose+=1
        i+=1
    if (totalClose == totalOpen):
        return True
    else: 
        return False
              
        
def main():
    closedIndexesFound = []
    #parse thru the string
    if (len(s)%2!=0):
        return(False)
    #pre: length is even
    i=0
    while(i<len(s)):
        if (s[i] in open):
            endingParenthesisIndex = findEnding(i)
            if(endingParenthesisIndex==-1): #if there IS a end parentheses
                return False
            closedIndexesFound.append(endingParenthesisIndex)
        elif(s[i] in close):
            if(i not in closedIndexesFound):
                return False
        i+=1
    
    return True

print(main())  