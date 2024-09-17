import os
from tkinter import filedialog
import matplotlib
matplotlib.use('TkAgg')
import matplotlib.pyplot as plt
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
import tkinter as tk


class Grafica:
    def __init__(self, master):
        self.master = master
        self.figura, (self.iterativos, self.recursivos) = plt.subplots(2, 1, figsize=(10, 8))
        self.canvas = FigureCanvasTkAgg(self.figura, master=self.master)
        self.canvas.draw()
        self.canvas.get_tk_widget().pack(side=tk.TOP, fill=tk.BOTH, expand=1)
        # Boton para actualizar
        self.boton = tk.Button(master=self.master, text="Actualizar", command=self.actualizar)
        self.boton.pack(side=tk.BOTTOM)
        self.actualizarauto()

    def actualizar(self):
        algo = ['BubbleSort', 'InsertionSort', 'SelectionSort', 'QuickSort', 'HeapSort', 'MergeSort']
        archivo = filedialog.askopenfilename(title="Selecciona el achivo", filetypes=[("Archivos de texto", "*.txt")])
        if archivo:
            with open(archivo, 'r') as f:
                datos = f.readlines()
                insertionsort = []
                selectionsort = []
                bubblesort = []
                quicksort = []
                heapsort = []
                mergesort = []
                for linea in datos:
                    tokens = linea.strip().split('\t')
                    bubblesort.append(int(tokens[0]))
                    insertionsort.append(int(tokens[1]))
                    selectionsort.append(int(tokens[2]))
                    quicksort.append(int(tokens[3]))
                    heapsort.append(int(tokens[4]))
                    mergesort.append(int(tokens[5]))
                self.iterativos.clear()
                self.recursivos.clear()
                size = [50, 100, 500, 800, 1000, 2000, 5000, 10000]
                self.iterativos.plot(size, bubblesort, label=algo[0], marker='o')
                self.iterativos.plot(size, insertionsort, label=algo[1], marker='o')
                self.iterativos.plot(size, selectionsort, label=algo[2], marker='o')
                self.iterativos.set_ylabel('Operaciones realizadas')
                self.iterativos.set_xlabel('Tamaño de arreglos')
                self.iterativos.set_title('Algoritmos iterativos')
                self.iterativos.legend()
                self.iterativos.set_yticks([0, 25000000, 50000000, 75000000, 100000000])
                self.iterativos.set_yticklabels(['0', '25M', '50M', '75M', '100M'])

                self.recursivos.plot(size, quicksort, label=algo[3], marker='o')
                self.recursivos.plot(size, heapsort, label=algo[4], marker='o')
                self.recursivos.plot(size, mergesort, label=algo[5], marker='o')

                self.recursivos.set_ylabel('Operaciones realizadas')
                self.recursivos.set_xlabel('Tamaño de arreglos')
                self.recursivos.set_title('Algoritmos recursivos')

                self.recursivos.legend()

                self.recursivos.set_yticks([0, 100000, 200000, 300000, 400000, 500000])
                self.recursivos.set_yticklabels(['0', '100K', '200K', '300K', '400K', '500K'])
                self.canvas.draw()

    def actualizarauto(self):
        self.refresh()
        self.master.after(5000, self.actualizarauto)

    def refresh(self):
        algo = ['BubbleSort', 'InsertionSort', 'SelectionSort', 'QuickSort', 'HeapSort', 'MergeSort']
        directorio = os.path.join('..', 'DatosGuardados', 'Datos.txt')
        ruta_completa = os.path.abspath(directorio)
        if os.path.exists(ruta_completa):
            with open(ruta_completa, 'r', encoding='utf-8') as f:
                datos = f.readlines()
                insertionsort = []
                selectionsort = []
                bubblesort = []
                quicksort = []
                heapsort = []
                mergesort = []
                for linea in datos:
                    tokens = linea.strip().split('\t')
                    bubblesort.append(int(tokens[0]))
                    insertionsort.append(int(tokens[1]))
                    selectionsort.append(int(tokens[2]))
                    quicksort.append(int(tokens[3]))
                    heapsort.append(int(tokens[4]))
                    mergesort.append(int(tokens[5]))
                self.iterativos.clear()
                self.recursivos.clear()
                size = [50, 100, 500, 800, 1000, 2000, 5000, 10000]
                self.iterativos.plot(size, bubblesort, label=algo[0], marker='o')
                self.iterativos.plot(size, insertionsort, label=algo[1], marker='o')
                self.iterativos.plot(size, selectionsort, label=algo[2], marker='o')
                self.iterativos.set_ylabel('Operaciones realizadas')
                self.iterativos.set_xlabel('Tamaño de arreglos')
                self.iterativos.set_title('Algoritmos iterativos')
                self.iterativos.legend()
                self.iterativos.set_yticks([0, 25000000, 50000000, 75000000, 100000000])
                self.iterativos.set_yticklabels(['0', '25M', '50M', '75M', '100M'])

                self.recursivos.plot(size, quicksort, label=algo[3], marker='o')
                self.recursivos.plot(size, heapsort, label=algo[4], marker='o')
                self.recursivos.plot(size, mergesort, label=algo[5], marker='o')

                self.recursivos.set_ylabel('Operaciones realizadas')
                self.recursivos.set_xlabel('Tamaño de arreglos')
                self.recursivos.set_title('Algoritmos recursivos')

                self.recursivos.legend()

                self.recursivos.set_yticks([0, 100000, 200000, 300000, 400000, 500000])
                self.recursivos.set_yticklabels(['0', '100K', '200K', '300K', '400K', '500K'])
                self.canvas.draw()
        else:
            print(f"El archivo {directorio} no existe, favos de obtener los datos antes de ejecutar")


root = tk.Tk()
root.title('Grafica de Datos')
grafica = Grafica(root)
root.mainloop()
