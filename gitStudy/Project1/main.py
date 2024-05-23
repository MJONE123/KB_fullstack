# 함수부
def add_num(n1,n2) :
    #retValue = 0
    retValue = n1 + n2
    return retValue

def sub_num(n1,n2) :
    #retValue = 0
    retValue = n1 - n2
    return retValue

#전역 변수부
num1 = 100
num2 = 200
hap = 0

#메인부
hap = add_num(num1,num2)
print(hap)

hap = sub_num(num1,num2)
print(hap)
