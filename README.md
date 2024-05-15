# INTERPOLACIÓN Y AJUSTE DE FUNCIONES

# Índice

* [Introducción](#introducción)
* [Interpolación](#interpolación)
  * [Lineal](#lineal)
  * [Cuadrática](#cuadrática)
* [Extrapolación](#extrapolación)
  * [Regla de Simpson 1/3](#regla_de-simpson_13)
* [Conclusiones](#conclusiones)
* [Bibliografía](#bibliografía)

# Introducción

La interpolación y extrapolación son técnicas matemáticas utilizadas para estimar valores entre y fuera de puntos de datos conocidos, respectivamente. En este apartado, se verá la implementación estas técnicas en Java, utilizando diferentes algoritmos, como la interpolación lineal o cuadrática.
La interpolación implica estimar valores entre puntos de datos conocidos, mientras que la extrapolación extiende estos valores más allá de los puntos conocidos.

# Interpolación

Es un método utilizado en matemáticas y ciencias computacionales para estimar valores desconocidos dentro de un conjunto de datos conocidos. 
Consiste en utilizar puntos conocidos para calcular valores intermedios. Por ejemplo, si tienes datos discretos para ciertas cantidades en ciertos momentos, la interpolación te permite estimar el valor de esas cantidades en momentos intermedios.

## Lineal

Método simple pero efectivo para estimar valores intermedios dentro de un rango definido por dos puntos conocidos. Este método asume que la relación entre los valores conocidos es lineal, es decir, que sigue una línea recta.

El proceso de interpolación lineal implica trazar una línea recta entre dos puntos dados y utilizar esta línea para predecir el valor de una variable dependiente en algún punto intermedio. La fórmula básica de la interpolación lineal es:

y = y1 + (x - x1) * ((y2 - y1) / (x2 - x1))

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/Cuadratica)

Algoritmo
```java
Función interpolacionLineal(x1, y1, x2, y2, x)
        retorno y1 + (x - x1) * ((y2 - y1) / (x2 - x1))
```

## Cuadrática

Es un método que utiliza una función cuadrática para estimar valores intermedios entre tres puntos conocidos en un conjunto de datos. A diferencia de la interpolación lineal, que asume una relación lineal entre los puntos, la interpolación cuadrática utiliza una función de segundo grado, lo que le permite modelar curvas más complejas.

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/87d1a744-013f-42b0-8063-32d202b7653a)

[Implementación](https://github.com/NiliLG/MetodosNumericosT4/tree/main/ReglaSmps)

Algoritmo
```java
Función interpolacionCuadratica(x0, y0, x1, y1, x2, y2)
    a = y0 * (x1^2 - x2^2) + y1 * (x2^2 - x0^2) + y2 * (x0^2 - x1^2)
    b = 2 * y0 * (x1 - x2) + 2 * y1 * (x2 - x0) + 2 * y2 * (x0 - x1)
    y = a / b
    retorno y
```
# Extrapolación

Predice valores más allá del rango de los datos conocidos. A diferencia de la interpolación, que estima valores dentro del rango de datos existentes, la extrapolación extiende esta estimación más allá de esos límites. Utiliza la tendencia identificada en los datos conocidos para prever cómo se comportarán los valores fuera de ese rango. Esto implica hacer suposiciones sobre la continuidad o el patrón subyacente de los datos más allá de lo que se ha observado.

# Conclusiones

Inf

# Bibliografía

Chapra, S. C., & Canale, R. P. (2006). Métodos numéricos para ingenieros (5a ed.). McGraw-Hill Interamericana.
