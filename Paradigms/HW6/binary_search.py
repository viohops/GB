def binary_search(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2

        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1

# Пример использования:
arr = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
target = 11
index = binary_search(arr, target)

if index != -1:
    print(f"Элемент {target} найден в массиве, его индекс: {index}")
else:
    print(f"Элемент {target} не найден в массиве")
