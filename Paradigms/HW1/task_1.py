def bubble_sort_desc(numbers):
    n = len(numbers)
    for i in range(n):
        for j in range(0, n-i-1):
            if numbers[j] < numbers[j+1]:
                numbers[j], numbers[j+1] = numbers[j+1], numbers[j]

# Пример использования:
numbers = [64, 34, 25, 12, 22, 11, 90]
bubble_sort_desc(numbers)
print("Отсортированный список в порядке убывания:", numbers)
