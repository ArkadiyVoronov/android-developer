# Chapitre 2<br />Variables, Types, Constantes et Opérateurs

## Définition d’une variable

Une variable, c’est un symbole qui associe un nom à une valeur. Les variables, vous les utilisez déjà en mathématiques. Lorsqu’on vous demande la formule de la circonférence d’un cercle, vous répondez π multiplié par le diamètre. Or, lorsque vous dites cela, vous associez le mot *diamètre* à une valeur.

### Types de variable

En informatique, une valeur correspond à un emplacement de mémoire. Cependant, pour optimiser les performances d’une application, il va falloir faire en sorte d’utiliser au mieux l’espace mémoire.

Imaginons que vous souhaitiez faire un quizz ayant plus ou moins pour but de faire deviner un nombre entre 1 et 100. Ce nombre peut très bien être stocké sur un octet (2<sup>8</sup>, soit 256 valeurs possibles). Vous allez donc affecter à ce nombre une valeur pouvant être stockée sur un octet, afin d’optimiser la mémoire consommée par votre application.

Si maintenant, vous souhaitez associer à chaque participant d’une convention un numéro, sachant que cette convention rassemble entre 2 500 et 3 000 personnes. Vous vous apercevez très vite qu’il n’est pas possible de stocker le numéro de chaque personne sur un octet. Très vite, vous serez dépassé. Vous aurez besoin de les stocker dans un type pouvant englober plus de données.

#### Nombres

C’est pourquoi, en Kotlin, nous avons 8 types de variables possibles pour stocker des nombres :
* `Byte` : une valeur allant de -128 à +127, stockée sur un octet,
* `Short` : une valeur allant de -32 768 à 32 767, stockée sur deux octets,
* `Int` : une valeur allant de -231 à 231-1, stockée sur quatre octets,
* `Long` : une valeur allant de -263 à 263-1, stockée sur huit octets,
* `Float` : utilisée pour stocker des valeurs décimales avec une précision relative, stockée sur seize octets,
* `Double` : utilisée pour stocker des valeurs décimales avec une plus grande précision, stockée sur trente-deux octets.

Attention, `Float` et `Double` doivent toujours être considérées comme des valeurs approximatives (`Double` étant plus précis), et jamais comme des valeurs exactes.

#### Caractères

Certes, nous pouvons stocker des nombres dans une variable, mais également des caractères. Ce qu’on appelle un caractère, c’est grosso modo un signe qui peut être affiché à l’écran, comme par exemple une lettre, une tabulation, un retour à la ligne ou encore un signe de ponctuation.

* `Char` : valeur utilisée pour stocker des caractères, stockée sur deux octets.

#### Booléen

Enfin, le type booléen ne peut prendre que deux valeurs, soit `true` (vrai) soit `false` (faux).

* `Boolean` : valeur utilisée pour stocker une valeur binaire, stockée sur un emplacement très faible en mémoire (inférieur ou égal à un octet), mais de taille variable.

#### Objet

Enfin, en plus de ces dix types primitifs, les variables peuvent également stocker des instances d’objets. Mais la notion d’objet est un concept que nous verrons plus loin dans ce livre.

### Notation

Pour définir une variable, en Kotlin, on utilise le mot clé `var`, suivi du nom de la variable, de deux points, et de son type, suivi du signe `=` et de sa valeur.

Ainsi, pour définir une variable de type `Double`, qui a pour nom `diameter`, nous l’écrirons ainsi :

```kotlin
var diameter: Double = 3.78
```

## Définition d’une valeur invariante

Une valeur invariante, c’est une variable qui ne change pas de valeur. Vous initialisez sa valeur, et vous ne pouvez plus la modifier. Si vous la modifiez, le compilateur refusera de compiler votre programme.

<p class="pageBreakAfter">En dehors du fait que vous ne pouvez pas modifier sa valeur, tout ce qui a été dit à propos des variables est également valable pour une valeur invariante.</p>

### Notation

Pour définir une valeur invariante, en Kotlin, on utilise la même notation que pour une variable, à l’exception du mot `var` qui devient `val`.

```kotlin
val pi: Double = 3.14
```

## Définition d’une constante

Une constante, c’est un identifiant qui va être remplacé par sa valeur par le préprocesseur du compilateur avant la compilation.

Nous avons vu les différentes étapes pour passer d’un code source au résultat final, et parmi elle, la compilation.

Juste avant la compilation, il y a un préprocesseur qui va passer pour modifier votre code source. Et ce préprocesseur va remplacer tous les appels à une constante par leur valeur.

Cette contrainte implique que vous ne pouvez spécifier qu’une valeur brute à une constante. Vous ne pouvez pas, par exemple, affecter à une constante la valeur de retour d’une fonction (notion que nous verrons dans la suite de ce chapitre), mais simplement un nombre ou une chaine de caractère…

Afin de produire un code plus clair, il est d’usage d’utiliser pour une valeur :

* Une constante,
* S’il n’est pas possible d’utiliser une constante, alors une valeur invariante,
* S’il n’est pas possible d’utiliser une valeur invariante, alors une variable.

### Notation
Pour définir une constante en Kotlin, la notation est la même que pour une valeur invariante, sauf que l’on fait précéder le mot clé val par le mot clé const.

<pre class="pageBreakAfter"><code class="lang-kotlin">const val PI: Double = 3.14</code></pre>

## Définition d’un argument

Un argument, c’est une variable que l’on passe à une fonction pour que cette dernière interagisse avec. Par exemple, si l’on écrit une fonction pour calculer la circonférence d’un cercle, alors nous aurons besoin de connaitre le diamètre du cercle. Ce dernier pourra être passé en argument à la fonction.

### Notation

Un argument s’écrit entre deux parenthèses dans la définition d’une fonction. Tout comme une variable, on écrit le nom de l’argument, suivi de deux points, suivi de son type. Pour une fonction calculant la circonférence d’un cercle, cela s’écrira :

```kotlin
fun circumference(diameter: Double){

}
```

Nous avons vu ici comment écrire une fonction avec un argument. Mais une fonction peut prendre plusieurs arguments. Dans ce cas, les arguments sont séparés par une virgule. Ainsi, si nous voulons écrire une fonction qui calcule le périmètre d’un rectangle, nous aurons besoin de la longueur et de la largeur de ce dernier. La fonction s’écrira donc ainsi :

```kotlin
fun rectanglePerimeter(width: Double, height: Double){

}
```

## Valeur de retour d’une fonction

Une fonction peut retourner une valeur. Certes, dans notre premier exemple Hello World, la fonction `main` ne retournait aucune valeur. Mais dans le cas d’une fonction calculant la circonférence d’un cercle, nous pourrions souhaiter que la fonction retourne la valeur de ladite circonférence. Pour indiquer une valeur de retour, après la parenthèse fermante, nous ajoutons deux points, suivi du type de la valeur de retour. Ainsi, pour la fonction calculant la circonférence d’un cercle, cela donne :

```kotlin
fun circumference(diameter: Double): Double{

}
```

Une fonction ne peut avoir qu’une seule valeur de retour, et cette dernière ne peut être que d’un type donné.

Maintenant, vous pouvez tout à fait choisir d’affecter à une variable, la valeur de retour d’une fonction. Cela se note ainsi :

```kotlin
val diameter : Double = 3.78
val circumference : Double = circumference(diameter)
```

## Types implicites et littéraux

Nous avons vu comment définir une variable :

```kotlin
val someValue: Int = 4
```

Dans ce cas précis, nous ne sommes pas obligés de déclarer le type `Int`, nous pouvons nous contenter d’écrire :

```kotlin
val someValue = 4
```

Cette notation est tout à fait correcte, et est équivalente à la première. Attention toutefois, si le type n’est pas explicitement indiqué, il n’en demeure pas moins que 4 est un nombre entier. Pour vous en convaincre, vous pouvez écrire le programme suivant :

<div class="fileTitle">TypeError.kt</div>

```kotlin
fun main(args: Array<String>) {
   var someValue = 4
   someValue = 5.56
   println(someValue)
}
```

En essayant de compiler ce programme, vous obtiendrez l’erreur suivante :

<pre class="terminal"><code class="terminal">TypeError.kt:3:17: error: the floating-point literal does not conform to the expected type Int
    someValue = 5.56
                ^</code></pre>

Kotlin vous indique de manière spécifique qu’il ne peut pas affecter une valeur décimale à une variable de type `Int`.

Mais du coup, quel type par défaut est donné à une variable quand on ne spécifie pas son type ?

On peut le savoir en écrivant un petit programme en Kotlin :

<div class="fileTitle">VarTpes.kt</div>

```kotlin
fun main(args: Array<String>) {
   val someValue = 4
   val someValue2 = 4.56
   val someValue3 = 'c'

   println(someValue.javaClass.kotlin.qualifiedName)
   println(someValue2.javaClass.kotlin.qualifiedName)
   println(someValue3.javaClass.kotlin.qualifiedName)
}
```

<p style="text-align:center;"><i>Ce programme fait appel à des notions que nous verrons plus loin dans ce livre. Contentez-vous de le recopier tel qu’il est, ce n’est pas important si vous ne comprenez pas tout maintenant.</i></p>

En compilant puis en exécutant ce programme, on obtient le résultat suivant :

<pre class="terminal"><code class="terminal">kotlin.Int
kotlin.Double
kotlin.Char</code></pre>

Ainsi, on peut savoir que, implicitement, lorsqu’on écrit un nombre entier, c’est le type `Int` par défaut qui lui est assigné, pour un nombre avec une décimale, le type `Double`, et pour un caractère écrit entre guillemets simples, le type `Char`.

Mais comment faire alors pour assigner à une variable le type `Float` ou bien `Long` sans avoir à spécifier son type ?

On peut utiliser un caractère, à la fin de la valeur, pour spécifier le type de cette valeur :

<div class="fileTitle">VarTpesFull.kt</div>

```kotlin
fun main(args: Array<String>) {
   val someValue = 4
   val someValue2 = 4L
   val someValue3 = 4.56
   val someValue4 = 4.56F
   val someValue5 = 'c'

   println(someValue.javaClass.kotlin.qualifiedName)
   println(someValue2.javaClass.kotlin.qualifiedName)
   println(someValue3.javaClass.kotlin.qualifiedName)
   println(someValue4.javaClass.kotlin.qualifiedName)
   println(someValue5.javaClass.kotlin.qualifiedName)
}
```

<p class="pageBreakAfter">En compilant puis en exécutant ce programme, on obtient le résultat suivant :</p>

<pre class="terminal"><code class="terminal">kotlin.Int
kotlin.Long
kotlin.Double
kotlin.Float
kotlin.Char</code></pre>

On voit qu’en ajoutant `L` à la fin d’un nombre entier, cela passe son type à `Long`, et qu’en ajoutant `F` à la fin d’un nombre décimal, cela passe son type à `Float`. Ce sont les deux seuls types pour lesquels on peut utiliser ce raccourci.

Pour déclarer une variable de type `Short` ou `Byte`, vous devrez utiliser la déclaration complète.

## Notations des entiers

Pour rendre le code plus lisible et/ou plus compréhensible, il est possible d’utiliser des notations différentes pour les entiers.

### Underscore

Pour les très grands nombres, il est possible d’utiliser le caractère underscore afin de séparer les chiffres par groupe, dans le but de rendre cela plus lisible :

```kotlin
val complexGigaByte = 1073741824
val readableGigaByte = 1_073_741_824
```

Ces deux déclarations sont identiques, et l’on peut aisément voir que la seconde est bien plus lisible.

### Notation Binaire

Parfois, on peut souhaiter écrire un nombre dans sa notation binaire. C’est possible en préfixant ce nombre de `0b`. Là encore, les underscores sont utilisables :

```kotlin
val readableGigaByte = 1_073_741_824
val binaryGigaByte = 0b1000_0000_0000_0000_0000_0000_0000_000‬
```

Ces deux déclarations sont équivalentes.

### Notation Hexadécimale

<p class="pageBreakAfter">De la même façon qu’il est possible d’écrire un nombre en notation binaire en le préfixant de <code>0b</code>, il est possible d’écrire un nombre dans sa notation hexadécimale en le préfixant de <code>0x</code> :</p>

```kotlin
val readableGigaByte = 1_073_741_824
val hexadecimalGigaByte = 0x4000_0000‬
```

## Opérateurs

### Affectation

C’est le seul opérateur que nous ayons déjà utilisé. Il s’agit du signe `=` pour affecter une valeur à une variable :

```kotlin
val three = 3
```

### Opérateurs mathématiques classiques

Il est possible d’effectuer des opérations mathématiques entre deux valeurs ou variables numériques :

<div class="fileTitle">Operators.kt</div>

```kotlin
fun main(args: Array<String>) {
   val add = 2_000_000_000+2_000_000_000
   val multiply = 3*7
   val substract = 7-4
   val divide = 7/3
   val modulo = 7%3

   println(add)
   println(multiply)
   println(substract)
   println(divide)
   println(modulo)
}
```

<p style="text-align:center"><i>L’opération modulo retourne le reste de la division euclidienne.</i></p>

En compilant puis en exécutant le programme, on obtient le résultat suivant :

<pre class="terminal"><code class="terminal">-294967296
21
3
2
1</code></pre>

On peut voir ici que la somme de 2 milliards + 2 milliards produit un résultat négatif. De même, on peut voir que la division de 7 par 3 donne comme résultat 2. C’est simplement parce qu’une opération entre deux variables de même type renvoie un résultat de même type. Ici, une addition de deux `Int`, ou une division de deux `Int`, produit un `Int`.

Très bien, cela explique pourquoi la division de 7 par 3 renvoie 2, mais pas pourquoi notre somme renvoie un nombre négatif. On a déjà dit que le type `Int` était limité à 2<sup>31</sup>-1, soit 2 147 483 647. Si l’on dépasse cette valeur, alors plus rien de fiable n’est à attendre d’une variable `Int`.

Mais qu’en est-il alors d’une opération entre deux types différents ? C’est le type qui est codé sur le plus d’octets qui est gardé. La seule exception concerne le type `Char`, qui restera un `Char` même si l’on y ajoute une valeur codée sur plus d’octets. Ainsi, pour obtenir le résultat attendu, on peut écrire le programme suivant :

<div class="fileTitle">OperatorsCorrect.kt</div>

```kotlin
fun main(args: Array<String>) {
   val byte:Byte = 7
   val short:Short = 5

   val add = 2_000_000_000+2_000_000_000L
   val multiply = 3*7
   val substract = 7-4
   val divide = 7/3.0
   val modulo = 7%3
   val add2 = byte+2_000_000_000
   val add3 = short+2_000_000_000
   val add4 = 'c'+3

   println(add)
   println(multiply)
   println(substract)
   println(divide)
   println(modulo)
   println(add2)
   println(add3)
   println(add4)
}
```

En compilant puis en exécutant le programme, on obtient le résultat suivant :

<pre class="terminal pageBreakAfter"><code class="terminal">4000000000
21
3
2.3333333333333335
1
2000000007
2000000005
f</code></pre>

### Affectations avancées

Parfois, vous pourrez avoir besoin d’écrire le code suivant :

```kotlin
var value = 3
value = value + 10
value = value - 1
value = value / 3
value = value * 4
value = value % 5
```

Quand votre variable est à la fois la valeur affectée, et le premier élément d’une opération mathématique, alors, vous pouvez l’écrire comme suit :

```kotlin
var value = 3
value += 10
value -= 1
value /= 3
value *= 4
value %= 5
```

Les deux extraits de code sont équivalents.

### Cas particulier des chaines de caractères

Vous pouvez utiliser le signe `+` dans une chaine de caractère pour concaténer le résultat :

```kotlin
val HelloWorld100 = "Hello "+"World! "+100;
```

La variable `HelloWorld100` vaut désormais `"Hello World! 100"`.

## Place à la pratique

<p class="pageBreakAfter">Dans votre éditeur de texte, ouvrez un nouveau fichier que vous nommerez Circumference.kt.</p>

<div class="fileTitle">Circumference.kt</div>

```kotlin
fun main(args: Array<String>) {
   var diameter: Double = 3.78
   var circumference = circumference(diameter)
   println(circumference)
   diameter = 1.72
   circumference = circumference(diameter)
   println(circumference)
}

fun circumference(diameter: Double): Double{
   return 3.14*diameter
}
```

Ce programme retourne la circonférence d’un cercle en fonction de son diamètre. Si vous compilez puis exécutez ce programme, cela donnera le résultat suivant :

<pre class="terminal"><code class="terminal">47.4768
22.2312</code></pre>

Nous pourrions nous satisfaire de cela, mais il manque une dernière petite chose.

## Nettoyage du code

Le contenu de notre fonction `main` est difficile à appréhender. Il faut la lire ligne par ligne pour bien comprendre ce que fait cette fonction. Mais nous pourrions rendre les choses plus claires.

### Commentaires

Dans le code, nous pouvons ajouter des commentaires. Ce sont des parties du code que le compilateur va tout simplement ignorer, mais qui peuvent aider à la lecture.

#### Commentaire sur une ligne

Pour écrire un commentaire sur une ligne, il suffit d’ajouter `//`. Tout ce qui suit sera ignoré par le compilateur, à l’exception des `//` dans une chaine de caractère :

<pre class="pageBreakAfter"><code class="lang-kotlin">var diameter: Double = 3.78 // diameter vaut 3.78
println("Je suis affiché // et moi aussi") // mais pas moi</code></pre>

#### Bloc de commentaires

Nous avons également la possibilité d’écrire un commentaire sur plusieurs lignes. Le commentaire doit commencer par `/*` et se terminer par `*/` :

```kotlin
/*Calcule la circonférence d'un cercle.
La formule utilisée et pi*diamètre
C'est quand même beaucoup plus clair*/
circumference = circumference(diameter)
```

#### KDoc
KDoc est une forme particulière de commentaire, que l’on dispose avant un bloc, et qui permet d’expliquer ce bloc. L’avantage de KDoc est qu’étant donné qu’il est connu et utilisé par tous, sa lecture, son accès, et même la génération de documentation sont simplifiés.

On pourrait consacrer un chapitre entier à KDoc, mais je préfère simplement vous en montrer un exemple, et que vous vous imprégniez de son usage au fur et à mesure de la lecture de ce livre.

```kotlin
/**
 * Retourne la circonférence d'un cercle de diamètre [diameter].
 * @param diameter le diamètre du cercle
 * @return la circonférence d'un cercle de diamètre [diameter]
 */
fun circumference(diameter: Double): Double{
   return 3.14*diameter
}
```

Le bloc KDoc ici permet d’indiquer clairement ce que fait la fonction, et comment sont utilisés les arguments.

<p><div class="kdoc"><img src="../images/kdoc.png" style="width:362px;height:177px;display:block;margin:0 auto;"/></div></p>

<p class="pageBreakAfter" style="text-align:center"><i>Exemple d’affichage d’une boîte d’aide sur le rôle d’une fonction pour laquelle une documentation au format KDoc a été rédigée dans Android Studio.</i></p>

### Langue anglaise

Comme vous pouvez le remarquer, tous les codes jusqu’ici ont été écrits en anglais. Non, il ne s’agit pas d’une traduction incomplète de ce livre, puisque ce dernier a d’abord été écrit en français, avant d’être traduit en anglais.

Mais l’immense majorité des développeurs s’accordent à tout écrire en anglais pour plusieurs raisons :

* Toutes les fonctions Kotlin sont en anglais, comme par exemple la fonction `println` que l’on a utilisée. Écrire son code en anglais permet donc de ne pas mélanger deux langues différentes dans son code, et par conséquent de garder une certaine homogénéité qui facilite la compréhension.
* De la même façon, vous vous servirez de nombreux sites anglophones à la fois pour poster des questions avec des extraits de votre code, mais aussi pour copier/coller du code disponible. Là encore, garder tout en anglais permet de conserver l’homogénéité, et de mieux se faire comprendre de ceux qui vont nous aider.
* Enfin, la dernière raison, c’est que les identifiants de variables et de fonctions n’aiment pas les caractères spéciaux. Vous ne pouvez pas utiliser de “é”, de “è” ou de “ç” dans les noms de fonctions. Plutôt que d’écrire avec des erreurs, autant tout écrire correctement.

### Factorisation

Vous l’avez vu, dans notre code, nous répétons à deux reprises la séquence suivante :

* diameter = valeur
* circumference = retourDeFonction
* affichage de circonférence

Le problème avec le code qui se répète, c’est que si l’on souhaite le modifier, pour corriger des bugs ou le faire évoluer, cela implique de devoir modifier son code deux fois.

### Constantes

Afin de rendre le code plus lisible, il est recommandé de sortir toutes les variables brutes du code des fonctions pour les mettre dans des constantes.

En effet, si vous faites une faute de frappe avec un nombre ou une chaine de caractère dans votre code, cela peut avoir pour conséquence de rendre le code très complexe à corriger (dans des projets de grand volume).

Passer par des constantes simplifiera la chose, puisque si vous faites une faute de frappe dans l’écriture du nom d’une constante, le compilateur refusera de compiler, en vous indiquant précisément où se situe votre erreur.

Pour distinguer les constantes des variables, il est fréquent d’écrire le nom des constantes en majuscules.

## Place à la pratique… encore

Du coup, en appliquant les conseils ci-dessus, on obtient le code suivant :

<div class="fileTitle">Circumference.kt</div>

```kotlin
/** The value of π for calculating the circumference */
const val PI: Double = 3.14

/**
 * Main method, displaying the circumference of two circles
 */
fun main(args: Array<String>) {
   printCircumference(3.78)
   printCircumference(1.72)
}

/**
 * Prints the circumference of circle when diameter is [diameter]
 * @param diameter the diameter of circle
 */
fun printCircumference(diameter: Double){
   println(circumference(diameter))
}

/**
 * Returns the circumference of circle when diameter is [diameter]
 * @param diameter the diameter of circle
 * @return the circumference of a circle when diameter is [diameter]
 */
fun circumference(diameter: Double): Double{
   return PI*diameter
}
```

<p class="pageBreakAfter">Cela rend le code beaucoup plus facile à lire et à maintenir. Imaginons maintenant que vous souhaitiez afficher <code>"circumference("+diameter+")="+circumference(diameter)</code>, vous n’aurez à effectuer cette modification qu’à un seul endroit :</p>

<div class="fileTitle">Circumference.kt</div>

```kotlin
/**
 * Prints the circumference of a circle when the diameter is [diameter]
 * @param diameter the circumference of the circle
 */
fun printCircumference(diameter: Double){
   println("circumference("+diameter+")="+circumference(diameter))
}
```

La factorisation vous a permis de ne modifier qu’un seul endroit pour rectifier les deux affichages.

## Exercices

### Exercice 1 - Facile

Développez un programme similaire au précédent, mais qui calcule le périmètre d’un carré en fonction de la mesure de ses côtés.

### Exercice 2 - Facile

Développez un programme, qui, à partir des valeurs 13 et 5, renvoie `"13/5 = 2 et il reste 3"`.
