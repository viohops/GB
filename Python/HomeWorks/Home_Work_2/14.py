# Задача 14: Требуется вывести все целые степени двойки 
# (т.е. числа вида 2^k), не превосходящие числа N.
# 10 -> 1 2 4 8

n = int(input("Введите число N: "))
k = 0
while 2**k <= n:
    print(2**k, end=" ")
    k += 1