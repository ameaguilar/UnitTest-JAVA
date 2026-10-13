# Cálculo de compras y descuentos

Proyecto educativo en Java para practicar pruebas unitarias con JUnit Jupiter. La clase `PurchaseCalculator` contiene operaciones sencillas de compra y `PurchaseCalculatorTest` comprueba sus resultados con escenarios representativos.

## Descripción del programa

La implementación trabaja con el precio de un producto (`double`), la cantidad (`int`) y el subtotal. Sus métodos son:

| Método | Comportamiento implementado |
|---|---|
| `subtotal(double price, int quantity)` | Multiplica el precio por la cantidad y devuelve el resultado. |
| `isValidPurchase(double price, int quantity)` | Devuelve `true` cuando tanto el precio como la cantidad son mayores que cero; en otro caso devuelve `false`. |
| `calculateDiscount(double subtotal)` | Si el subtotal es mayor que 1,000, devuelve el 10 % del subtotal. Para un subtotal de 1,000 o menor, la implementación actual devuelve el subtotal recibido. |
| `calculateFinalPrice(double subtotal)` | Si el subtotal es mayor que 1,000, devuelve el subtotal menos el 10 %. En los demás casos devuelve el subtotal sin cambios. |

Los importes del ejercicio se entienden como pesos mexicanos. La implementación usa `double` y no aplica redondeo monetario.

## Pruebas unitarias

`PurchaseCalculatorTest` contiene cuatro métodos de prueba y trece aserciones:

- `subtotalProof`: comprueba precio por cantidad, cantidad unitaria y cantidad cero.
- `isValidProof`: comprueba valores positivos, precio cero, cantidad cero y precio negativo.
- `discountProof`: revisa subtotales de 140, 1,000 y 2,000.
- `finalPriceProof`: revisa precios finales para subtotales de 140, 1,000 y 2,000.

### Anotaciones de JUnit

`@Test` identifica cada método como una prueba que JUnit debe ejecutar. Sin esta anotación, el motor de JUnit no lo trata como un caso de prueba al descubrir la suite.

`@DisplayName` asigna un nombre legible a la prueba en los resultados del IDE o del motor de JUnit. En este proyecto los nombres, como “Prueba método subtotal()”, permiten reconocer qué operación se está verificando. La anotación solo afecta la presentación; no cambia el resultado ni el comportamiento del método probado.

### Importaciones de la clase de pruebas

- `org.junit.jupiter.api.Test`: proporciona la anotación `@Test` de la API Jupiter.
- `org.junit.jupiter.api.DisplayName`: proporciona la anotación `@DisplayName`.
- `org.junit.jupiter.api.Assertions.*` con `static import`: permite llamar directamente a `assertEquals`, `assertTrue` y `assertFalse`, en vez de escribir `Assertions.assertEquals(...)`. El asterisco importa los miembros estáticos disponibles de esa clase; las pruebas usan las tres aserciones mencionadas.

`PurchaseCalculator` no declara importaciones porque usa únicamente tipos de `java.lang` (disponibles automáticamente) y no depende de otras clases externas.

## Nota sobre la regla del descuento

El archivo de instrucciones describe un descuento de 10 % cuando el subtotal es igual o superior a 1,000, y descuento cero por debajo de ese límite. El código actual no coincide completamente con esa regla: usa `subtotal > 1000`, por lo que no descuenta cuando el subtotal es exactamente 1,000; además, `calculateDiscount` devuelve el subtotal completo para importes menores o iguales al límite, en vez de devolver cero. Las aserciones actuales de `discountProof` esperan ese comportamiento y por ello no detectan esas diferencias. Esta sección describe lo que hace el código disponible, para que el README no presente como implementada una regla distinta.

## Estructura del repositorio

```text
src/
└── PurchaseCalculator.java
test/
└── PurchaseCalculatorTest.java
.gitignore
```

El proyecto está configurado en IntelliJ IDEA y utiliza su sistema de compilación integrado, sin Maven ni Gradle. La dependencia de JUnit se administra desde la configuración del IDE.

## Entorno

- Java 17 o superior.
- JUnit Jupiter (API de JUnit 6, según la configuración del proyecto).
- IntelliJ IDEA.

## Consideraciones

Los métodos de descuento reciben directamente el subtotal; no validan precios negativos ni cantidades. La validación de la compra se realiza por separado mediante `isValidPurchase`. Las comparaciones de los resultados `double` en las pruebas no especifican tolerancia; para cálculos decimales más generales conviene usar una tolerancia apropiada. En aplicaciones reales de dinero también se debe considerar `BigDecimal` y una política explícita de redondeo.

Este README se basa en el código y las pruebas disponibles. Los resultados de ejecución no se reportan aquí porque deben tomarse de una ejecución real de JUnit.
