# В ячейке ниже представлен код генерирующий DataFrame, которая 
# состоит всего из 1 столбца. Ваша задача перевести его в one hot вид. 
# Сможете ли вы это сделать без get_dummies?

# import random
# lst = ['robot'] * 10
# lst += ['human'] * 10
# random.shuffle(lst)
# data = pd.DataFrame({'whoAmI'lst})
# data.head()

import pandas as pd
import numpy as np

lst = ['robot'] * 10
lst += ['human'] * 10
random.shuffle(lst)
data = pd.DataFrame({'whoAmI': lst})

# Создаем пустой DataFrame для one-hot представления
one_hot_data = pd.DataFrame()

# Получаем уникальные значения столбца 'whoAmI'
unique_values = data['whoAmI'].unique()

# Проходим по каждому уникальному значению
for value in unique_values:
    # Создаем новый столбец с именем, соответствующим уникальному значению
    # Если значение в исходном столбце равно текущему уникальному значению, присваиваем 1, иначе 0
    one_hot_data[value] = np.where(data['whoAmI'] == value, 1, 0)

one_hot_data.head()
