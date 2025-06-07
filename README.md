# 💻​ DLP - Compilador TypeScript
Este es mi proyecto para la asignatura DLP del Grado en Ingeniería del Software de la Universidad de Oviedo. Aquí iré subiendo lo que vaya haciendo a lo largo de las distintas sesiones prácticas de la asignatura.

Mi compilador en concreto incluye las prácticas desarrolladas con Óscar, que en **2025** fueron sobre **TypeScript**. El modelo cambia dependiendo del profesor (y puede que del año), aunque no varía en exceso.

Hay un archivo txt con una descripción general del lenguaje, así como varios ejemplos de inputs. Es posible que algunos inputs den errores inesperados con la versión final del compilador, ya que estos pueden ser de las primeras clases de laboratorio.

En las ramas tengo distintos ejercicios de ejemplo que hice para practicar para el examen. El que mejor hecho está es el de `practica-asignacion-dinamica` y quizás `ternary-operator`, lo demás son soluciones algo pochillas.

## Examen
El examen de Mayo de 2025 exigía las siguientes mejoras:
*  Permitir asignaciones entre tipos compatibles siguiendo la jerarquía char -> int -> number, de modo que podemos tener un int `a` y hacer la operación `a = 'c'`, o un number (double) `b` y hacer la operación `b = 2` o `b = 'c'`, pero no operaciones en el sentido contrario de la jerarquía.
*  Permitir promoción de tipos siguiendo la jerarquía anterior en las llamadas a funciones. Por ejemplo, una función `f` con un parámetro de tipo int puede ser llamada con `f('c')`.
*  Permitir promoción de tipos en los returns. Si la función devuelve int, podemos hacer `return 'c'`.

El enunciado incluía dos ejemplos de código, uno correcto y uno que debía dar errores. Ambos estarán incluidos junto a mi solución en un zip `DLP-EXAMEN` (no lo añadí todavía).

