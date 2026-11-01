# Sistema de Gestión de Cuentas Bancarias

## Descripción
Este proyecto desarrolla un sistema de gestión de cuentas bancarias utilizando Java y Programación Orientada a Objetos. Permite administrar distintos tipos de cuentas, realizar depósitos y extracciones, aplicar intereses y controlar límites de sobregiro.

El sistema contempla dos tipos de cuentas: caja de ahorro y cuenta corriente, cada una con sus propias características y reglas de funcionamiento.

## Funcionamiento del programa

El programa crea dos cuentas bancarias:

- **Caja de ahorro:** pertenece a Laura Gómez, comienza con un saldo de $100.000 y tiene una tasa de interés mensual del 2%.
- **Cuenta corriente:** pertenece a Carlos Pérez, comienza con un saldo de $50.000 y tiene un límite de sobregiro de $30.000.

Luego realiza las siguientes operaciones:

### Caja de ahorro
1. Deposita $20.000.
2. Intenta extraer $150.000, pero la operación es rechazada por falta de fondos.
3. Extrae $40.000 correctamente.
4. Aplica los intereses mensuales del 2%.

**Saldo final: $81.600.**

### Cuenta corriente
1. Deposita $10.000.
2. Extrae $80.000, utilizando el sobregiro autorizado. El saldo queda en -$20.000.
3. Intenta extraer $15.000, pero la operación es rechazada porque supera el límite de sobregiro.
4. Deposita $25.000 y sale del descubierto.

**Saldo final: $5.000.**

Finalmente, el programa almacena ambas cuentas en un arreglo de tipo `CuentaBancaria[]` y recorre sus elementos para mostrar la información de cada una.

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `CuentaBancaria` | Clase base que contiene los datos generales y las operaciones comunes de una cuenta. |
| `CajaAhorro` | Hereda de `CuentaBancaria` y permite aplicar intereses mensuales. |
| `CuentaCorriente` | Hereda de `CuentaBancaria` y permite realizar extracciones utilizando un límite de sobregiro. |
| `Main` | Contiene el método principal y ejecuta las operaciones de prueba. |

## Conceptos de programación aplicados

- **Herencia:** `CajaAhorro` y `CuentaCorriente` heredan atributos y métodos de `CuentaBancaria`.
- **Encapsulamiento:** los atributos `numeroCuenta` y `titular` son privados y se accede a ellos mediante getters.
- **Polimorfismo:** las cuentas se almacenan en un arreglo de tipo `CuentaBancaria`, permitiendo trabajar con diferentes tipos de cuentas.
- **Sobrescritura de métodos:** `CuentaCorriente` redefine el método `extraer()` para incorporar el sobregiro, mientras que ambas subclases redefinen `toString()`.
- **Validaciones:** se controlan los montos de depósitos y extracciones, los fondos disponibles y el límite de sobregiro.
- **Constructores:** se inicializan los atributos de cada cuenta mediante constructores y el uso de `super()`.

## Tecnologías utilizadas

- Lenguaje: Java.
- Entorno de desarrollo: IntelliJ IDEA.
- Paradigma: Programación Orientada a Objetos.

## Ejecución

<img width="917" height="386" alt="image" src="https://github.com/user-attachments/assets/41bd19c2-0408-451c-9209-89d01d147ae7" />

## Resultado esperado

El programa muestra las operaciones realizadas sobre ambas cuentas, informa cuando una extracción no puede concretarse y presenta los saldos finales.

- Caja de ahorro: **$81.600,00**.
- Cuenta corriente: **$5.000,00**.

## Objetivo del ejercicio

Aplicar los conceptos de herencia, encapsulamiento y polimorfismo mediante la construcción de un sistema bancario sencillo que permita representar diferentes tipos de cuentas y sus operaciones específicas.

## Estructura del proyecto

```text
SistemaCuentasBancarias/
├── CuentaBancaria.java
├── CajaAhorro.java
├── CuentaCorriente.java
├── Main.java
└── README.md
```

**Nombre sugerido para el repositorio:** `sistema-cuentas-bancarias`
