# Напишите программу, которая принимает на вход координаты точки х и Y). 
# причем х * О и Y о и выдает номер четверти плоскости, в которой 
# находится эта точка (или на какой оси она находится).

ax = int(input('Введите координату х точки А: '))
ay = int(input('Введите координату y точки А: '))

if ax > 0 and ay > 0:
    print('1 четверть')
elif ax > 0 and ay < 0:
    print('2 четверть')
elif ax < 0 and ay < 0:
    print('3 четверть')
elif ax < 0 and ay > 0:
    print('4 четверть')
else:
    print('точка лежит на оси координат')