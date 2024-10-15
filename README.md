
# Conversor de Monedas

Este programa es una aplicación de consola que permite realizar conversiones entre distintas monedas utilizando la API de ExchangeRate-API. El usuario puede elegir entre conversiones predeterminadas (como de dólares a pesos argentinos, reales, etc.) o realizar conversiones entre otras monedas especificadas manualmente.

## Características

- Conversión entre monedas predeterminadas (dólares a pesos argentinos, reales, colombianos y viceversa).
- Opción para convertir cualquier par de monedas ingresando sus códigos.
- Utiliza la API de ExchangeRate-API para obtener las tasas de conversión actualizadas.
- Interfaz interactiva por consola.

## Requisitos

- Java 11 o superior.
- Conexión a Internet (para consultar las tasas de conversión en tiempo real).
- Librerías adicionales:
  - [Google Gson](https://github.com/google/gson) para manejar el formato JSON de las respuestas de la API.
  
## Configuración

1. **Descargar las dependencias necesarias**: Asegúrate de tener `Gson` en tu proyecto. Puedes descargar la librería de su repositorio de GitHub o usar un gestor de dependencias como Maven o Gradle.
2. **Clonar el proyecto**:
   ```bash
   git clone https://github.com/tu_usuario/conversor-monedas.git
   ```
3. **Agregar tu API key**: En la clase `ConsultaMoneda`, reemplaza `API-KEY` por tu propia clave obtenida en [ExchangeRate-API](https://www.exchangerate-api.com/).
4. **Compilar y ejecutar el programa**:
   ```bash
   javac Principal.java
   java Principal
   ```

## Uso

1. Al iniciar el programa, el usuario verá un menú con varias opciones de conversión:
   ```
   *****************************
   Bienvenido al conversor de monedas

   Ingrese la conversion que desee realizar

   1-> Dollar a Peso Argentino
   2-> Peso Argentino a Dollar
   3-> Dollar a Real Brasilero
   4-> Real Brasilero a Dollar
   5-> Dollar a Peso Colombiano
   6-> Peso Colombiano a Dollar
   7-> Convertir otra moneda
   8-> Salir
   ```

2. El usuario selecciona una opción ingresando el número correspondiente.
3. Si selecciona una opción de conversión (por ejemplo, "1 -> Dollar a Peso Argentino"), el programa solicita la cantidad de dinero que se desea convertir.
4. El programa muestra el resultado de la conversión utilizando la tasa de cambio actual obtenida desde la API.

### Ejemplo de Conversión

- El usuario selecciona la opción 1 (Dólar a Peso Argentino).
- Se le solicita ingresar la cantidad de dólares que desea convertir.
- El programa muestra el resultado utilizando la tasa de cambio actual, por ejemplo:
  ```
  La tasa de conversion para hoy
  1 USD = 98.47 ARS
  Ingrese la cantidad de USD: 100
  100 USD = 9847.00 ARS
  ```

## Personalización

Puedes agregar más opciones de conversión específicas agregando más `case` en la estructura `switch` de la clase `Principal`. Para convertir otras monedas predeterminadas, basta con cambiar los códigos de moneda en la función `ConversorMoneda.convertir`.

## API

El programa utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/). Asegúrate de:
- Registrarte y obtener una clave API válida.
- Revisar los límites y la documentación de la API para asegurarte de no sobrepasar el límite de solicitudes.

