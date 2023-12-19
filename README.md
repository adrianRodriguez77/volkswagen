# Proyecto Volkswagen Grand California

## Descripción
Este proyecto de programación en Kotlin tiene como objetivo calcular el valor de mercado de una Volkswagen Grand California, considerando factores como el modelo, los kilómetros recorridos, los años de antigüedad, la presencia de portabicis y el estado de los neumáticos.

## Estructura del Proyecto
El proyecto consta de tres archivos principales:

### 1. FuncionsEntrada.kt
Este archivo contiene funciones de entrada de datos, como `llegirInt()`, `llegirLong()` y `llegirDouble()`, que facilitan la lectura de números enteros, largos y decimales desde la consola.

### 2. FuncionsVW.kt
Aquí se encuentran las funciones específicas para calcular el precio base y actual de la Volkswagen Grand California. Las funciones incluyen la depreciación según los kilómetros y años, el impacto de los portabicis y los descuentos por el estado de los neumáticos.

### 3. Main.kt
El archivo principal para interactuar con el usuario. Solicita información sobre el modelo, los kilómetros, los años, la presencia de portabicis y muestra el precio base original y el precio actual calculado.

## Instrucciones de Uso
1. Ejecutar el archivo `Main.kt` para iniciar la interacción con el usuario.
2. Proporcionar la información solicitada, como el modelo, los kilómetros, los años y la presencia de portabicis.
3. El programa calculará y mostrará el precio base original y el precio actual de la Volkswagen Grand California.

## Notas Adicionales
- Si la furgo tiene menos de 5000km, el precio no se modifica. Si tiene entre 5000 y 10000km, se reduce en 200€, y si tiene 10000km o más, se reduce en 300€.
- Si la furgo tiene entre 6 y 10 años, la depreciación será de 0.0002 por kilómetro. Si tiene más de 10 años, la depreciación será de 0.0004 por kilómetro.
