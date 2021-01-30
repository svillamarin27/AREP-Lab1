# Tarea Introducción MVN-GIT
# AREP - Arquitecturas Empresariales 2021-1
# Profesor: Luis Daniel Benavides

Este laboratorio consiste en desarrollar una aplicación que calcule el promedio y la desviación estándar de un conjunto de números reales, este conjunto debe ser obtenido desde un archivo y para realizar los cálculos debe usar una Lista Encadenada (Linked List) de su propia implementación que debe ser compatible con la API de colecciones de Java.

## Prerrequisitos

Para el desarrollo de este se utilizó Maven como una herramienta para la construcción del mismo, el código fue desarrollado con el lenguaje de programación Java, por lo tanto se requiere para su ejecución tener estas dos herramientas en las versiones especificadas :
- Java versión 8 o superior

- Maven versión 3.5 o superior

## Uso

Este repositorio se puede clonar o descargar de git ya instalada en su computador. Si se clona utilizar el siguiente comando  :

    git clone https://github.com/svillamarin27/AREP-Lab1.git
    
![image](https://user-images.githubusercontent.com/37603257/106345590-5e749780-627f-11eb-8769-6d464ea7a410.png)

Ya con el proyecto clonado se accede a la consola (**cmd**) desde el directorio donde esta el pom e inicialmente se pondra el siguiente comando :

![image](https://user-images.githubusercontent.com/37603257/106345656-d0e57780-627f-11eb-837c-60fa7274c7ca.png)

    mvn package

![image](https://user-images.githubusercontent.com/37603257/106345674-e8bcfb80-627f-11eb-8340-3510b9d92c44.png)

![image](https://user-images.githubusercontent.com/37603257/106345700-16a24000-6280-11eb-8150-8f0eedc54eff.png)

# Pruebas del proyecto

Posteriormente al ejecutar **"mvn package"**, para ejecutar las pruebas se utiliza el siguiente comando :
    
    mvn test
    
![image](https://user-images.githubusercontent.com/37603257/106345770-7b5d9a80-6280-11eb-943b-258adfc5ffd4.png)

![image](https://user-images.githubusercontent.com/37603257/106345780-96300f00-6280-11eb-9d65-8bd7a559e622.png)

Como se puede evidenciar en la ultima imagen al ejecutar el comando el proyecto ejecuta bien las pruebas que tiene.

Las pruebas propuestas para este fueron :

![image](https://user-images.githubusercontent.com/37603257/106345818-e5763f80-6280-11eb-8ff7-099445d9b15f.png)

Se puede apreciar que en la primera tabla estan los datos y en la segunda tabla estan los valores esperados tanto de medias como desviaciones estandar.

# Autor

### Sebastián Camilo Villamarín Rodríguez

# Licencia
