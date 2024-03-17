# Задача 17. Общее обсуждение
# Дан список чисел. Определите, сколько в нем встречается различных чисел.
# Input: [1, 1, 2, 0, -1, 3, 4, 4] Output: 6

# 1ый способ
# s = [1, 1, 2, 0, -1, 3, 4, 4]
# s = set(s)
# print(len(s))

# 2ой способ
list_1 = [1, 1, 2, 2, 3, 3, 4, 4]
result_list = list()
for i in list_1:
    if i not in result_list: # Если i не из списка, то мы его туда добавляем, если повторяется, то нет
        result_list.append(i)
print(result_list)
print(len(result_list))