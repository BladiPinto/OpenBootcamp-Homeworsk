# PRIMERA PARTE
def suma(num1, num2, num3):
    return num1 + num2 + num3

# Llamar a la función y darle valores
resultado = suma(5, 10, 15)
print(resultado) # Resultado: 30

# SEGUNGA PARTE
class Coche:
    def __init__(self, puertas):
        self.puertas = puertas

    def aumentar_puertas(self):
        self.puertas += 1

# Crear objeto miCoche y añadirle una puerta
miCoche = Coche(3)
miCoche.aumentar_puertas()

# Mostrar número de puertas del objeto
print(miCoche.puertas) # Resultado: 4
