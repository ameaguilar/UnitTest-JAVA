# Cálculo de compras y descuentos

Proyecto educativo en Java que modela cálculos básicos de una compra en línea y verifica sus reglas de negocio mediante pruebas unitarias con JUnit 6.

## Descripción

El ejercicio representa una parte pequeña del backend de una tienda en línea. A partir del precio de un producto y la cantidad solicitada, se obtiene el subtotal, se valida la compra y se calcula el precio final considerando un posible descuento. Las pruebas unitarias ayudan a comprobar que estas operaciones produzcan los resultados esperados, incluidos los casos límite de la regla de descuento.

## Reglas de negocio

La clase `PurchaseCalculator` contempla las siguientes operaciones:

| Operación | Regla |
|---|---|
| Subtotal | Precio del producto multiplicado por la cantidad. |
| Validación de compra | La compra es válida cuando el precio y la cantidad son mayores que cero. |
| Descuento | Se aplica un descuento del 10 % cuando el subtotal es igual o superior a $1,000 MXN; por debajo de ese importe, el descuento es cero. |
| Precio final | Subtotal menos el descuento que corresponda. |

Para mantener el alcance introductorio, los importes se expresan en pesos mexicanos y se representan con `double`. No se realiza redondeo monetario. En aplicaciones financieras o comerciales reales, debe evaluarse el uso de `BigDecimal` y definirse explícitamente la política de redondeo.

## Pruebas unitarias

La suite `PurchaseCalculatorTest` verifica de manera independiente las operaciones de cálculo y validación. Los escenarios incluyen cantidades unitarias, valores cero y negativos para la validación, subtotales por debajo, en y por encima del umbral de $1,000 MXN, así como precios finales con y sin descuento.

Las comparaciones numéricas con valores `double` consideran una tolerancia. La prueba del subtotal exactamente igual a $1,000 MXN es especialmente relevante porque confirma que el límite de la promoción está incluido.

## Tecnologías y entorno

- Java 17 o superior.
- JUnit 6 para las pruebas unitarias.
- IntelliJ IDEA y su sistema de compilación integrado.
- El proyecto no utiliza Maven ni Gradle.

## Estructura del proyecto

Los archivos principales del ejercicio son:

```text
PurchaseCalculator.java       # Reglas de cálculo de compras
PurchaseCalculatorTest.java  # Pruebas unitarias
DOCUMENTACION.md              # Descripción técnica y resultados de las pruebas
.gitignore                    # Exclusiones de archivos locales y generados
```

Las rutas concretas de código fuente y pruebas dependen de la organización del proyecto configurada en IntelliJ IDEA.

## Alcance

El proyecto se limita a la lógica de cálculo y sus pruebas. No incluye una tienda completa, interfaz de usuario, persistencia, bases de datos ni gestión de catálogo. La documentación detallada de la implementación y de los resultados de ejecución se presenta en `DOCUMENTACION.md`.

## Estado de las pruebas

Los resultados de ejecución deben corresponder a una ejecución real de la suite en el entorno del proyecto y se registran en `DOCUMENTACION.md`.
