# INTERPOLACIÓN Y AJUSTE DE FUNCIONES

Equipo:
Nili Estefanía López Gutierrez 
Elton Yael Alba Roldan

# Índice

* [Introducción](#introducción)
* [Interpolación](#interpolación)
  * [Lineal](#lineal)
  * [Cuadrática](#cuadrática)
  * [Newton](#newton)
  * [Lagrange](#lagrange)
* [Extrapolación](#extrapolación)
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

Algoritmo
```java
Función interpolacionLineal(x1, y1, x2, y2, x)
        retorno y1 + (x - x1) * ((y2 - y1) / (x2 - x1))
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/Lineal)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/dc03d2df-7d2d-4832-b16b-7f84720fa0da)

## Cuadrática

Es un método que utiliza una función cuadrática para estimar valores intermedios entre tres puntos conocidos en un conjunto de datos. A diferencia de la interpolación lineal, que asume una relación lineal entre los puntos, la interpolación cuadrática utiliza una función de segundo grado, lo que le permite modelar curvas más complejas.

CON FUNCIÓN (EJEMPLO: ------------ FUNCIÓN: f(x)=2senx-(x^2)/10 ------------ PUNTOS: X0, Y0, X1, Y1, X2, Y2):

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/87d1a744-013f-42b0-8063-32d202b7653a)

Algoritmo
```java
Función interpolacionCuadratica(x0, y0, x1, y1, x2, y2)
    a = y0 * (x1^2 - x2^2) + y1 * (x2^2 - x0^2) + y2 * (x0^2 - x1^2)
    b = 2 * y0 * (x1 - x2) + 2 * y1 * (x2 - x0) + 2 * y2 * (x0 - x1)
    y = a / b
    retorno y
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/Cuadratica)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/3ef45061-07ec-4cf0-9aa3-894dd6c76548)

SIN FUNCIÓN (UNICAMENTE LOS PUNTOS: X0, Y0, X1, Y1, X2, Y2, X)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/1dd900ad-a1f0-49e8-8286-cac0cb71aeff)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/e9c082e5-c53c-4bd4-a376-5024d4d63b57)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/d9801ab9-2966-439f-a119-e4dbdcf4ce04)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/40e0419e-6ca9-4d16-9e2a-6ef8801e39ab)


Algoritmo
```java
Función interpolacionCuadratica(x0, y0, x1, y1, x2, y2, x)
    a = ((y2 - y0) / ((x2 - x0) * (x2 - x1))) - ((y1 - y0) / ((x1 - x0) * (x2 - x1)))
    b = ((y1 - y0) / (x1 - x0)) - a * (x0 + x1)
    c = y0 - a * Potencia(x0, 2) - b * x0
    y = a * Potencia(x, 2) + b * x + c
    retorno y
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/CuadraticaSF)

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/791f5b2a-36d8-44ad-831c-ccd3d051dbce)

## Newton

El método de interpolación de Newton es otra técnica para encontrar el polinomio que pasa por un conjunto de puntos dados. Se basa en las diferencias divididas de Newton y ofrece una forma alternativa al método de Lagrange para construir el polinomio de interpolación. Dado un conjunto de n+1 puntos distintos (x0, y0), (x1, y1), ..., (xn, yn). Formula:

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/6d478a01-2785-40b1-975e-a6eef0bd66bf)

Algoritmo
```java
Inicializar las diferencias divididas:
Crear una tabla de diferencias divididas y asignar f(xi)=yi para i = 0, 1, 2, n
Calcular las diferencias divididas:
Para cada 𝑗 desde 1 hasta 𝑛 *Para cada 𝑖 desde 0 hasta 𝑛−𝑗 *Calcular f[xi,xi+1,…,xi+j] usando la fórmula recursiva.
Construir el polinomio de interpolación:
Iniciar el polinomio 𝑃(𝑥) con el primer coeficiente 𝑎0 = 𝑓[𝑥0].
Para cada 𝑘 desde 1 hasta 𝑛: *Añadir el término ak(x-x0)(x-x1)...(x-xk-1) al polinomio, donde ak = f[x0, x1, ..., xk]​ ​
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/Newton)


## Lagrange

El método de Lagrange, también conocido como el método de interpolación de Lagrange, es una técnica matemática para encontrar un polinomio que pasa exactamente por un conjunto de puntos dados. Este método es muy útil en la interpolación de datos y en la aproximación de funciones. El polinomio resultante, llamado polinomio de interpolación de Lagrange, se construye de manera que cada valor del polinomio coincide con el valor de la función en cada uno de los puntos dados. Dado un conjunto de n + 1 puntos distintos (x0, y0), (x1, y1), ..., (xn, yn) el objetivo es encontrar un polinomio P(x) de grado n Formula:

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/a1072f1b-3ca9-4b11-b2aa-a8cf36dd2fbe)

Donde Li(x):

![image](https://github.com/NiliLG/MetodosNumericosT5/assets/147437701/7d36579d-4ea5-4db8-921d-5f4551107f41)

Algoritmo
```java
Inicializar el polinomio de interpolación:
𝑃(𝑥) = 0.
Para cada punto (𝑥𝑖,𝑦𝑖) en el conjunto de puntos:
Inicializar el polinomio básico de Lagrange 𝐿𝑖(𝑥)=1.
Construir el polinomio básico 𝐿𝑖(𝑥) para cada 𝑖:
Para cada 𝑗 de 0 a 𝑛, donde 𝑗≠𝑖:
Actualizar 𝐿𝑖(𝑥) multiplicándolo por ((𝑥−𝑥𝑗)/(𝑥𝑖−𝑥𝑗))​.
Actualizar el polinomio de interpolación 𝑃(𝑥): *Sumar al polinomio de interpolación 𝑃(𝑥) el término 𝑦𝑖⋅𝐿𝑖(𝑥).
Simplificar *Simplificar 𝑃(𝑥) si es necesario para obtener el polinomio en su forma más simple.
```

[Implementación](https://github.com/NiliLG/MetodosNumericosT5/tree/master/Interpolaci%C3%B3n/Lagrange)

# Extrapolación

Predice valores más allá del rango de los datos conocidos. A diferencia de la interpolación, que estima valores dentro del rango de datos existentes, la extrapolación extiende esta estimación más allá de esos límites. Utiliza la tendencia identificada en los datos conocidos para prever cómo se comportarán los valores fuera de ese rango. Esto implica hacer suposiciones sobre la continuidad o el patrón subyacente de los datos más allá de lo que se ha observado.

# Conclusiones

Inf

# Bibliografía

Chapra, S. C., & Canale, R. P. (2006). Métodos numéricos para ingenieros (5a ed.). McGraw-Hill Interamericana.
