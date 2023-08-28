# Spring Boot API REST INDETEX Test

Aplicación/servicio en SpringBoot que provee una end point rest de consulta así

Acepta como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
- applicationDate
- productId
- brandId 

Devuelve como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
- productId
- brandId
- priceListId
- applicationDate *Especificar qué es "fechas" de aplicación 
- price

Utiliza una base de datos en memoria H2

Los test al endpoint rest validan las siguientes peticiones al servicio con los datos del ejemplo**:
               
- Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA) 	35.50 
- Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)	25.45
- Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)	35.50	
- Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)	30.50
- Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)	38.95

** Datos de Ejempo

BRAND_ID         START_DATE         END_DATE      PRICE_LIST          PRODUCT_ID  PRIORITY        PRICE  CURR

1         2020-06-14-00.00.00      2020-12-31-23.59.59      1      35455       0      35.50   EUR

1         2020-06-14-15.00.00      2020-06-14-18.30.00      2      35455       1      25.45   EUR

1         2020-06-15-00.00.00      2020-06-15-11.00.00      3      35455       1      30.50   EUR

1         2020-06-15-16.00.00      2020-12-31-23.59.59      4      35455       1      38.95   EUR

## Run Spring Boot application
```
mvn spring-boot:run
```

