# вводится два числа и нужно определить какое из них больше
a = int(input(" введите число А - "))
b = int(input(" введите число B - "))

if a > b:
    print(f" a = {a} > b = {b}")
elif a < b:
    print(f" a = {a} < b = {b}")
else:
    print(f" a = {a} == b = {b}")
