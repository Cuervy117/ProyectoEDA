import numpy as np
import matplotlib.pyplot as plt


data = np.loadtxt('C:/Users/LAP-CIT01/Downloads/EDA II/ProyectoEDA/Datos.txt', delimiter='\t')

tamaños = data[:, 0]
acciones = data[:, 1]


tamaños_unicos = np.unique(tamaños)


promedios_acciones = []
for tamaño in tamaños_unicos:
    indices = np.where(tamaños == tamaño)
    promedio_acciones = np.mean(acciones[indices])

print(promedio_acciones)

x = tamaños_unicos
y = np.array(promedios_acciones)


plt.plot(x, y, marker='o', linestyle='-', label='Promedio de Acciones')

plt.xlabel('Tamaño')
plt.ylabel('Promedio de Acciones')
plt.title('Promedio de Acciones por Tamaño')
plt.legend()
plt.grid(True)
plt.show()






    