# SOLUCION DE LAS PREGUNTAS DEL TALLER DE NIVELACIÓN

1. ¿qué es un repositorio en git y como se diferencia de un proyecto normal?
los repositorios de git es un sistema de versiones que se utiliza para subir archivos a la nube y que puede ser editado por diferentes usuarios, y un proyecto normal no tiene la utilidad de ser editado por varios usuarios y ver los cambios de cada uno.

2. ¿cuáles son las tres areas principales de git?
working directory: es el espacio donde realizamos nuestro trabajo y se almacenan los cambios que aún no han sido confirmados en la base de datos de git; en otras palabras, aquí se guardan las modificaciones locales.
staging area: corresponde a la siguiente etapa, donde se colocan los archivos que han sido preparados. su función es organizar y dejar listos los cambios que pasarán al repositorio, facilitando así la selección de lo que se desea confirmar.
repository: es el lugar donde se almacenan de forma segura todas las modificaciones confirmadas. gracias a él, podemos acceder al historial y recuperar versiones anteriores de los archivos.
3. ¿cómo representa un git los cambios internamente?
blob: es el objeto que se utiliza para guardar la información contenida en un archivo; en términos simples, representa un archivo en git.
tree: funciona como un directorio, similar a un árbol con ramas, ya que puede contener archivos y subdirectorios. en otras palabras, se encarga de organizar directorios.
commit: registra una versión específica del proyecto o de sus archivos, actuando como una marca de tiempo que nos permite consultar y volver a confirmaciones anteriores.
tag: sirve como un identificador o marcador especial para señalar versiones relevantes e importantes del proyecto.
¿quieres que también lo prepare en un estilo comparativo (con ejemplos de la vida real) para que sea más didáctico?

4. ¿cómo se crea un commit y qué información almacena un objeto commit?
aquí tienes el texto reescrito con mejor redacción y claridad:
cuando realizas una modificación en un archivo dentro del working directory, seleccionas los cambios que deseas conservar, lo que hace que pasen al staging area. luego, al ejecutar el comando git commit -m, esos cambios se guardan en el repositorio local.
en este proceso, git crea un objeto tree que representa la estructura de los archivos y lo enlaza con un commit. dicho commit funciona como una especie de “fotografía” del proyecto en un instante específico, la cual queda registrada de forma permanente en el historial.
¿quieres que también te lo prepare en una versión resumida (como para diapositivas) o en una versión más técnica (como para documentación)?

5. ¿cuál es la diferencia entre git pull y git fetch?
git fetch descarga los cambios desde el repositorio remoto, pero no los aplica de inmediato a la rama local; simplemente los trae para que podamos revisarlos.
git pull, en cambio, obtiene los cambios del repositorio remoto y los integra directamente en nuestro directorio de trabajo, actualizando la rama local de forma automática.

6. ¿qué es un branch (rama) en git y cómo git gestiona los punteros a commits?
un git branch permite crear nuevas funciones o desarrollos dentro de una aplicación sin afectar el trabajo de la rama principal. su funcionamiento se puede comparar con un árbol: cada rama crece de manera independiente sin interferir con las demás.
en git, las ramas son muy ligeras, ya que se almacenan como referencias en archivos de texto simples. cada rama apunta al hash sha-1 de un commit específico. entre los punteros más importantes se encuentran: head, el nombre de la rama y el commit al que esta hace referencia.

7. ¿cómo se realiza un merge y qué conflictos pueden surgir? ¿cómo se resuelven?
el merge se utiliza para integrar los cambios provenientes de diferentes ramas. generalmente, git intenta combinar las modificaciones de forma automática; sin embargo, cuando dos desarrolladores editan la misma parte de un archivo, git no puede resolverlo por sí solo y se produce un conflicto.
al detectarse un conflicto, se puede usar git status para obtener más información, ya que en la sección “unmerged paths” aparecerán los archivos involucrados. luego, es necesario abrirlos manualmente, decidir qué partes del código conservar, marcar los archivos como resueltos y finalmente completar el merge.


8. ¿cómo funciona el área de staging (git add) y qué pasa si omito este paso?
la staging area es como una lista previa donde eliges qué cambios guardar en el próximo commit.
si no usas esta zona, git no registrará tus modificaciones y el commit quedará vacío.
9. ¿qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
el archivo .gitignore, como su nombre lo indica, se utiliza para especificar qué archivos o carpetas deben ser ignorados dentro de un proyecto. esto permite a los desarrolladores excluir elementos innecesarios y mantener un historial más limpio y organizado.
es importante destacar que solo afecta a los archivos que aún no han sido rastreados por git.

10. ¿cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
la diferencia está en que git commit --amend modifica el commit más reciente, reemplazándolo por uno actualizado, mientras que un nuevo commit crea un registro adicional en el historial sin alterar el anterior.
11. ¿cómo se utiliza git stash y en qué escenarios es útil?
el comando git stash permite guardar temporalmente los cambios no confirmados, de modo que puedas cambiar de rama sin necesidad de hacer un commit y sin perder tu trabajo en curso.
es especialmente útil cuando deseas probar código sin arruinar tus avances actuales o cuando necesitas revisar el trabajo de otro desarrollador. al usarlo, los cambios se guardan de forma segura y luego puedes recuperarlos fácilmente como si nada hubiera pasado.

12. ¿qué mecanismos ofrece git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?
el comando git revert se utiliza para deshacer cambios en el historial de confirmaciones de un repositorio, pero sin eliminar ni alterar dicho historial. es la forma más segura de revertir modificaciones, ya que mantiene todo el registro intacto.
en cambio, otros comandos como git checkout, git restore (en versiones más recientes) o git reset funcionan de manera distinta, ya que mueven los punteros de referencia (head y la rama) hacia una confirmación específica.

13. ¿cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
el origin es el repositorio remoto principal y predeterminado, normalmente el que clonamos para trabajar en nuestro proyecto. por otro lado, upstream se refiere a un repositorio remoto adicional, comúnmente el repositorio original del cual hicimos un fork, al que podemos dar seguimiento o al que deseamos contribuir con cambios.
ejemplo práctico con fork:
clonar tu fork
git clone https://github.com/tuusuario/proyecto.git
cd proyecto
agregar el repositorio original como remoto
git remote add upstream https://github.com/autor/proyecto.git
ver los repositorios remotos configurados
git remote
actualizar tu fork con los cambios del original
git fetch upstream
git checkout main
git merge upstream/main   o:  git rebase upstream/main
git push origin main

14. ¿cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?
con git log puedes consultar el historial de commits realizados en el repositorio.
con git diff es posible comparar y visualizar las diferencias entre versiones o cambios en los archivos.
y con git show puedes ver los detalles completos de un commit específico..

15. ¿cuáles son los tipos de datos primitivos en java?
los datos primitivos son tipos básicos que representan valores simples y se almacenan directamente en la memoria. entre los más comunes se encuentran:
integer: números enteros.
double / float: números con decimales.
char: un único carácter.
boolean: valores lógicos, verdadero o falso.
16. ¿cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en java?
if: ejecuta un bloque de código cuando la condición es verdadera (true).
else: ejecuta un bloque alternativo cuando la condición es falsa (false).
switch: evalúa una variable y ejecuta el bloque correspondiente según su valor.
for: bucle con tres partes: inicialización, condición e incremento.
while: repite un bloque de código mientras la condición sea verdadera.
do-while: ejecuta un bloque al menos una vez y luego continúa mientras la condición sea verdadera.
break: finaliza de inmediato un bucle o una sentencia switch.
continue: salta a la siguiente iteración de un bucle sin terminarlo por completo.
17. ¿por qué es importante usar nombres significativos para variables y métodos?
es fundamental porque contribuye a la legibilidad, la mantenibilidad y la calidad del código en general.
legibilidad: elegir nombres adecuados permite comprender el propósito de una variable o método sin necesidad de comentarios extra.
mantenibilidad: con nombres descriptivos, es más sencillo detectar errores y realizar cambios sin riesgo de alterar partes equivocadas del código.
calidad de código: evita errores por malinterpretación. una buena práctica es usar variables claras como nombreusuario en lugar de un genérico nombre.
18. ¿qué es la programación orientada a objetos poo?
es un paradigma de programación que se basa en el uso de objetos, los cuales contienen datos o atributos y comportamientos o métodos. su finalidad es organizar el código de manera modular, reutilizable y escalable, tomando como referencia la forma en que representamos entidades del mundo real.
19. ¿cuáles son los 4 pilares de programación orientada a objetos?
encapsulamiento: consiste en ocultar los detalles internos de un objeto y mostrar solo lo necesario.
ejemplo: uso de modificadores de acceso (private, protected, public).
herencia: permite que una clase hija herede atributos y métodos de una clase padre.
palabra clave: extends.
polimorfismo: un objeto puede adoptar múltiples formas.
ejemplo: sobrescritura de métodos con @override.
también se logra mediante interfaces, que actúan como contratos de comportamiento.
abstracción: simplifica la representación de objetos complejos, ocultando los detalles irrelevantes.
ejemplo: uso de clases abstractas (abstract class).
20. ¿qué es la herencia en poo y como se utiliza en java?
la herencia es uno de los cuatro pilares de la programación orientada a objetos. permite que una clase herede atributos y métodos de otra, favoreciendo la reutilización del código y estableciendo una jerarquía lógica entre clases. en java, se implementa mediante la palabra clave extends.
21. ¿qué son los modificadores de acceso y cuáles son los más comunes en java?
los modificadores de acceso en java determinan la visibilidad de clases, atributos, métodos y constructores. con ellos se controla desde qué partes del código es posible acceder a estos elementos, lo que resulta esencial para aplicar el encapsulamiento de datos.
los modificadores más comunes son:
public, protected, default, private
22. ¿qué es un variable de entorno y por qué son importantes para java o la programación en general?
una variable de entorno es un valor dinámico que se guarda en el sistema operativo y que los programas en ejecución pueden utilizar. su función es definir configuraciones esenciales para el entorno donde corre una aplicación, por ejemplo:
credenciales de bases de datos (usuario y contraseña).
direcciones de apis externas.
rutas de archivos o programas (como path o java_home).
modos de ejecución de la aplicación.
son importantes porque:
seguridad: evitan incluir información sensible, como contraseñas, directamente en el código.
portabilidad: permiten que la aplicación se ejecute en distintos entornos (desarrollo, pruebas o producción) sin necesidad de modificar el código.

