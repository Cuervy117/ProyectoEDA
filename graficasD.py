import matplotlib.pyplot as plt
import numpy as np

insertionsort = []
selectionsort = []
bubblesort = []
quicksort = []
heapsort = []
mergesort = []

with open('D:\\EDA II\\repoProyecto\\Datos.txt', 'r') as archivo:
    lineas = archivo.readlines()

for linea in lineas:
    tokens = linea.strip().split('\t')
    print(tokens)
    bubblesort.append(int(tokens[0]))
    insertionsort.append(int(tokens[1]))
    selectionsort.append(int(tokens[2]))
    quicksort.append(int(tokens[3]))
    heapsort.append(int(tokens[4]))
    mergesort.append(int(tokens[5]))


algo = ['BubbleSort', 'InsertionSort', 'SelectionSort', 'QuickSort', 'HeapSort', 'MergeSort']

fig, (iterativos, recursivos) = plt.subplots(2, 1, figsize=(10,8))
size = [50, 100, 500, 800, 1000, 2000, 5000, 10000]
iterativos.plot(size, bubblesort, label=algo[0], marker='o')
iterativos.plot(size, insertionsort, label=algo[1], marker='o')
iterativos.plot(size, selectionsort, label=algo[2], marker='o')

iterativos.set_ylabel('Operaciones realizadas')
iterativos.set_xlabel('Tamaño de arreglos')
iterativos.set_title('Algoritmos iterativos')
iterativos.legend()

iterativos.set_yticks([500, 5000, 50000, 500000, 5000000, 50000000, 50000000])
iterativos.set_yticklabels(['500', '5k', '50k', '500k', '5M', '50M', '500M'])

recursivos.plot(size, quicksort, label=algo[3], marker='o')
recursivos.plot(size, heapsort, label=algo[4], marker='o')
recursivos.plot(size, mergesort, label=algo[5], marker='o')

recursivos.set_ylabel('Operaciones realizadas')
recursivos.set_xlabel('Tamaño de arreglos')
recursivos.set_title('Algoritmos recursivos')
recursivos.legend()

recursivos.set_yticks([400, 4000, 40000, 400000])
recursivos.set_yticklabels(['400', '4k', '40k', '400k'])

plt.tight_layout()

plt.show()
