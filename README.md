# 💻​ DLP - Compilador TypeScript
Este es mi proyecto para la asignatura DLP del Grado en Ingeniería del Software de la Universidad de Oviedo, calificado con un 8.6/10.

Consiste en un compilador sencillo basado en el lenguaje de programación `TypeScript`. En el proyecto existe un archivo `descripcion.txt` el cual se describe la sintaxis 
y semántica del lenguaje, que incluye la siguiente descripción:

## Programa
Un programa es una secuencia de definiciones. 
Las definiciones pueden ser de variables o de funciones.

## Definición de Variable
La sintaxis de la definición de una variable empieza con la palabra 
reservada "let", seguida de una lista (con al menos un elemento) de 
identificadores separados por comas y finaliza con ":" y un tipo. 
Las definiciones de variables terminan mediante el caracter ";"

## Definición de Función
Las funciones se definen mediante la palabra reservada "function" el
 identificador de la función, una lista de parametros separados 
 por comas entre "(" y ")" seguido de ":" y el tipo de retorno 
 cuando sea necesario.
El tipo de retorno y de los parámetros debe ser de tipo simple 
(no se permiten ni arrays ni registros). 
El cuerpo de la funcion va entre "{" y "}".
El cuerpo de las funciones se compone de una secuencia de cero 
o más definiciones de variables seguida de una secuencia de cero 
o más sentencias.
La funcion "main" es obligatoria, no devuelve nada, no recibe parámetros y 
debe estar declarada en último lugar.

## Tipos
Los tipos simples son "int", "number" y "char".
Los arrays se pueden crear con el constructor de tipos "[]",
 especificando el tamaño con una constante entera, 
 seguido de cualquier tipo.
Se usa el constructor de tipos "record" para la creación de registros. 
Los registros no tienen identificador, y los campos son declarados
 como variables dentro de "[" "]".

## Sentencias
La sentencia de escritura consiste en la palabra reservada "log" seguida de una lista de una o más expresiones separadas por comas.
La sentencia de lectura consiste en la palabra reservada "input" seguida de una lista de una o más expresiones separadas por comas.
Una asignación está compuesta por dos expresiones separadas por el operador "=".
La sentencia condicional "if"-"else" y la sentencia iterativa "while" siguen la sintaxis del lenguaje TypeScript: la condición entre paréntesis "(" ")" y 
las sentencias del cuerpo van entre "{" "}" y solamente si hay una única sentencia pueden omitirse. 
La sentencia de retorno consiste en la palabra reservada "return" seguida de una <expresión>.
La invocación a una función sin retorno (se denomina procedimiento) será siempre una sentencia.
Todas las sentencias excepto "if-else" y "while" finalizan con ";".

## Expresiones
La invocación a una función podrá ser también una expresión cuando retorne un valor.
La conversión explícita a tipos simples (cast) se escribe entre paréntesis '(' ')' y sigue la sintaxis <expresión> "as" <tipo>. 
Las expresiones están formadas por:
- Constantes enteras, reales y caracter sin signo.
- Identificadores
- Los siguientes operadores aplicados a una o dos expresiones (por 
orden de precedencia descendente):
```
		( )			Non associative
		[]			Non associative
 		.			Left associative
        CAST     	Non associative
		- (unary)	Non associative
        !			Non associative
		* / %		Left associative
		+ -			Left associative
	> >= < <= != ==	Left associative
		&& ||		Left associative
```

# 📋 Examen
En las ramas tengo distintos ejercicios de ejemplo que hice para practicar para el examen. El que mejor hecho está es el de `practica-asignacion-dinamica` y `ternary-operator`.
El examen de Mayo de 2025 exigía las siguientes mejoras:
*  Permitir asignaciones entre tipos compatibles siguiendo la jerarquía char -> int -> number, de modo que podemos tener un int `a` y hacer la operación `a = 'c'`, o un number (double) `b` y hacer la operación `b = 2` o `b = 'c'`, pero no operaciones en el sentido contrario de la jerarquía.
*  Permitir promoción de tipos siguiendo la jerarquía anterior en las llamadas a funciones. Por ejemplo, una función `f` con un parámetro de tipo int puede ser llamada con `f('c')`.
*  Permitir promoción de tipos en los returns. Si la función devuelve int, podemos hacer `return 'c'`.

El enunciado incluía dos ejemplos de código, uno correcto y uno que debía dar errores. Ambos están incluidos junto a mi solución en un zip `DLP-EXAMEN`.

