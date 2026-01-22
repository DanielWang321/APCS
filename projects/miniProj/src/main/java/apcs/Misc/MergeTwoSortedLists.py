list1 = [1,2,4,7,8,10]
list2 = [1,2,3,4,5]
def MergeSortedLists(list1, list2):
    i= 0
    j = 0 
    result = []
    while(len(list1)>0 and len(list2)>0):
            if (list1[i] <= list2[j]):
                result.append(list1[i])
                del list1[i]
            else:
                result.append(list2[j])
                del list2[j]
    result.extend(list2)
    result.extend(list1)
    return result
        
            
print(MergeSortedLists(list1,list2))