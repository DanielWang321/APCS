s = "III"
s_list = list(s)
roman_dict = {"M":1000, "D": 500, "C":100,"L":50, "X": 10, "V":5, "I":1}
seperatedList = []
total = 0

k=0
while (k <(len(s_list))):
    if(k==(len(s_list)-1)):
        print(roman_dict[s_list[k]])
        total = total + roman_dict[s_list[k]]
        k+=1
    elif(roman_dict[s_list[k]]>=roman_dict[s_list[k+1]]):
        print(roman_dict[s_list[k]])
        total = total + roman_dict[s_list[k]]
        k+=1
    elif(roman_dict[s_list[k]]<roman_dict[s_list[k+1]] and k<(len(s_list)-1)):
        print(roman_dict[s_list[k+1]]-roman_dict[s_list[k]])
        total = total + (roman_dict[s_list[k+1]]-roman_dict[s_list[k]])
        k+=2

        
print(total)