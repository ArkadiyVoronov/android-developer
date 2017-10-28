# Chapitre 1 <br /> Premier programme Kotlin

## Installation de Kotlin

Pour pouvoir compiler et exécuter des programmes écrits en Kotlin, vous aurez besoin d’un compilateur. Pour ce faire, récupérez la dernière version du compilateur Kotlin à l’adresse suivante https://github.com/JetBrains/kotlin/releases/latest.

Une fois que vous aurez téléchargé le fichier .zip, extrayez-le dans un emplacement de votre choix. Il vous suffira ensuite d’ajouter l’emplacement du dossier `bin` qu’il contient, à la variable d’environnement `PATH` de votre système. La procédure dépend de votre système d’exploitation.

### Windows

* Dans le panneau de configuration, choisissez *Afficher par : Petites icônes* en haut à droite ;
* Cliquez sur *Système* ;
* À gauche, cliquez sur *Paramètres Systèmes Avancés* ;
* Dans la boîte de dialogue, cliquez sur le bouton `Variables d’environnement…` ;
* Dans le cadre du bas, cliquez sur la ligne dont la valeur pour la colonne Variable vaut `Path` ;
* Cliquez sur le bouton `Modifier…` ;
* Ajoutez le chemin vers le dossier `bin` dans une nouvelle ligne ;
* Cliquez sur `OK` afin de fermer chacune des trois boîtes de dialogue.

### macOS

* Ouvrez un terminal ;
* Exécutez la commande <code class="terminal" style="background-color:#434343;color:#f3f3f3;">sudo nano /etc/paths</code> ;
* Ajoutez le chemin vers votre dossier `bin` sur une nouvelle ligne ;
* Tapez `Ctrl+O` pour enregistrer, puis `Ctrl+X` pour quitter.

### Linux

<p class="pageBreakAfter">La procédure dépend de votre distribution. Mais si vous êtes sous Linux, je suppose que vous savez modifier la variable d’environnement <code>PATH</code> vous-même.</p>

## Hello World!

### Code source

Un programme Hello World! est un programme basique, ce qui se fait de plus élémentaire dans chaque langage de programmation. Il s’agit simplement d’afficher à l’écran la chaine de caractères `Hello World!`. Son objectif est de fournir une première approche minimaliste du langage étudié.

Ouvrez un éditeur de texte (comme l'excellent [Atom](https://atom.io/) par exemple), et écrivez le contenu suivant, que vous sauvegarderez dans un fichier nommé `HelloWorld.kt`.

<div class="fileTitle">HelloWorld.kt</div>

```kotlin
fun main(args: Array<String>) {
   println("Hello world!")
}
```

### Du code source à l’exécution

Pour exécuter un programme en Kotlin, nous devons passer par trois étapes.

#### L’écriture du code source

C’est ce que nous venons de faire. Il s’agit d’écrire un programme dans un langage lisible par un développeur. Ce que vous avez écrit, n’importe quel développeur est capable de le lire et de le modifier assez facilement pour modifier le comportement du programme.

#### La compilation

Il s’agit d’une étape qui vise à transformer votre code source en un fichier compréhensible par la machine. Pour certains langages, comme le PHP ou le JavaScript, il n’est pas nécessaire de compiler le code source. Le système va être capable de lire et d’interpréter directement votre programme. Toutefois, l’inconvénient de ce système est qu’il présente des lacunes en termes de performances.

<p class="pageBreakAfter">En effet, en tant qu’humains, nous sommes capables d’écrire du code directement compréhensible par l’ordinateur. Le désagrément d’écrire un tel programme est qu’il va être très complexe à lire et à modifier par un être humain.</p>

<div class="fileTitle">HelloWorld.exe</div>

```
4D 5A 3B 00 01 00 00 00 02 00 00 01 FF FF 02 00
00 10 00 00 00 00 00 00 1C 00 00 00 00 00 00 00
0E 1F B4 09 BA 0E 00 CD 21 B8 00 4C CD 21 48 65
6C 6C 6F 20 57 6F 72 6C 64 21 24
```

Regardez le programme ci-dessus : il y a très peu de chances pour que vous compreniez quoi que ce soit. C’est la retranscription en hexadécimal d’un `Hello World!` pour les systèmes DOS 32 bits. Vous voyez aisément que si l’on écrit dans la «langue naturelle» pour le système, il devient très difficile de comprendre ou de modifier ce message.

Le rôle du compilateur va donc être de générer un fichier plus facilement compréhensible par votre système, à partir d’un ou plusieurs fichiers facilement compréhensibles par un être humain.

##### Système et environnement d’exécution

Je viens de parler de codes plus facilement compréhensibles par le système. En fait, le système décrit l’environnement dans lequel s’exécute le programme. Il peut s’agir par exemple de votre système d’exploitation, ou bien encore, comme c’est le cas en Java (et donc en Kotlin qui se base sur Java), d’un environnement d’exécution dédié.

Le principal avantage de cet environnement d’exécution dédié est que vous pouvez écrire des programmes et partager les binaires sans vous soucier du système d’exploitation sur lequel il sera exécuté.

Par exemple, un fichier exécutable `.exe` pourra être exécuté sous Windows, mais si vous tentez de l’exécuter sous macOS, cela ne fonctionnera pas.

Cependant, un fichier exécutable Java ou Kotlin, qui se matérialise par un fichier `.class`, pourra être exécuté aussi bien sous Windows, que macOS ou encore Android.

#### L’exécution

Enfin, vient l’étape de l’exécution du programme. C’est cette étape qui produit le résultat final.

### Compilation Kotlin

Sous Kotlin, pour compiler un programme, il suffit d’exécuter la commande suivante dans un terminal :

<pre class="terminal"><code class="terminal">kotlinc HelloWorld.kt</code></pre>

Cette commande produira normalement un fichier `HelloWorldKt.class`. Il s’agit d’un fichier exécutable Kotlin.

### Exécution Kotlin

Pour exécuter votre programme Kotlin désormais compilé, il suffit d’exécuter la commande suivante :

<pre class="terminal"><code class="terminal">kotlin HelloWorldKt</code></pre>

Le résultat produit sera le suivant :

<pre class="terminal"><code class="terminal">Hello world!</code></pre>

Félicitations, vous venez d’écrire le code source, de compiler, et d’exécuter votre première application Kotlin.

## Explications du code source

Revenons un peu sur notre code source, et nous allons chercher à savoir ce qu’il fait exactement.

<div class="fileTitle">HelloWorld.kt</div>

```kotlin
fun main(args: Array<String>) {
   println("Hello world!")
}
```

### Fonctions, instructions

Le mot-clé `fun` indique à Kotlin que nous allons définir une fonction. En programmation, on désigne par fonction un groupe contenant une ou plusieurs instructions à exécuter dans un ordre défini.

Une instruction étant un appel à une action de la part de l’ordinateur, cette action peut soit être une action exécutée par le système (créer un fichier, afficher du texte à l’écran, etc.), soit un appel à une fonction.

Juste après ce mot-clé `fun`, on trouve le nom donné à la fonction, dans notre cas, `main`. Le fait d’appeler cette fonction `main` permet d’indiquer à Kotlin que c’est cette fonction qui doit être exécutée lorsque l’on appelle le programme `HelloWorldKt`. En effet, nous aurions pu écrire un programme contenant plusieurs fonctions, et si tel avait été le cas, il aurait bien fallu indiquer à Kotlin quelle fonction exécuter en premier.

Entre parenthèses, nous retrouvons les arguments de notre fonction, ici `args: Array<String>`. Les arguments, ce sont les données avec lesquelles notre fonction va interagir. Ici, ces données ne servent pas, donc nous n’allons pas entrer plus en détails sur l’argument de cette fonction `main`, mais cet argument est obligatoire. Si nous avions écrit notre fonction `main` comme ceci : `fun main()`, cela aurait provoqué un bug lors de l’exécution, même si la notation écrite ici correspond à une fonction `main` sans argument, ce qui est tout à fait valide. Il s’agit plus d’un bug dû à la spécificité de la fonction `main`, qui est celle appelée lors de l’exécution d’un programme.

Ensuite, nous retrouvons une accolade ouvrante et une accolade fermante à la fin du fichier. Ces accolades servent à délimiter les instructions d’une fonction. Ainsi, toutes les instructions comprises entre ces accolades sont les instructions de la fonction main.

### Println

Ensuite, nous avons un appel à la fonction `println`. Cette fonction sert à afficher un texte (`print`) sur une nouvelle ligne (`ln`). Cette fonction prend en argument la chaine de caractères `"Hello world!"`. On voit bien ici l’utilité de l’argument d’une fonction. Ici, l’argument représente les données que va afficher la fonction `println`.

## Conclusion

Et voilà, nous avons vu comment écrire un code source en Kotlin, comment le compiler et l’exécuter. Nous en avons profité pour voir ce que sont que les fonctions, les instructions et les arguments.

Juste une petite note pour vous rassurer : le début de cet livre contient beaucoup de définitions, qui peuvent vous paraitre abstraites, et que vous pouvez avoir du mal à comprendre. Cela est tout à fait normal, et ne doit pas vous décourager.

Autant il est nécessaire que tous ces termes soient définis lors de leur premier usage, autant il n’est pas nécessaire d’en connaitre la définition par cœur pour appréhender la suite du livre.

<p class="pageBreakAfter">Afin de vous rassurer sur ce point, j’ai été contraint d’aller sur Wikipédia pour définir ces notions, afin d’avoir une idée de la définition qu’il donnait de ces mots. Une fois que vous aurez développé quelques programmes, vous verrez rapidement que vous saurez ce qu’est une fonction, sans forcément savoir définir ce que c’est précisément. Vous aurez une idée très claire de ce que c’est et de ce que ce n’est pas.</p>

## Exercices

Chaque chapitre se terminera par un ou plusieurs exercices, avec une mention à propos de la difficulté : facile, moyen ou difficile. Il ne s’agit pas vraiment de la complexité du programme à écrire (car cette valeur est subjective et propre à chacun), mais plus d’une échelle permettant de savoir à quoi vous attendre :

* **Facile** : Tout ce dont vous avez besoin pour compléter l’exercice est dans le chapitre. Vous n’avez qu’à appliquer la théorie à la problématique de l’exercice pour comprendre.
* **Moyen** : Vous pouvez compléter cet exercice avec ce qui est dit dans le chapitre, mais vous aurez besoin pour cela d’expérimenter, de tenter des choses, de vous tromper, car tout n’est pas forcément indiqué.
* **Difficile** : Le seul contenu de ce livre ne vous permettra pas de compléter l’exercice. Vous aurez besoin de chercher comment faire sur Internet, ou bien sur d’autres sources.

Bien sûr, j’aurais pu écrire un livre exhaustif dont le contenu puisse directement vous permettre de compléter les exercices. Mais c’est une volonté que de vous mettre face à de telles épreuves. Encore une fois, le but de ce livre est de faire de vous des développeurs débutants. Or, un développeur passe ses journées à essayer à tâtons, à aider ses collègues et à se faire aider par ses collègues, et à chercher sur Internet des solutions aux problèmes qu’il rencontre. Autant vous y habituer tout de suite…

### Exercice 1 - Moyen
Reprenez le programme `HelloWorld.kt`, et modifiez-le de sorte que :
* Il contienne deux fonctions, `main` et `displayHelloWorld`.
  * `displayHelloWorld`, sans argument, sera une fonction qui affiche `Hello world!`,
  * `main` se contentera d’appeler displayHelloWorld.

### Exercice 2 - Difficile
Nous l’avons vu, lorsque nous compilons notre programme, cela nous produit un fichier `HelloWorldKt.class` dans le répertoire actuel. Faites en sorte que le fichier `HelloWorldKt.class` soit généré dans un dossier `exercice`, en utilisant uniquement la commande <code class="terminal" style="background-color:#434343;color:#f3f3f3;">kotlinc</code>
 (donc sans créer le dossier `exercice` autrement qu’en utilisant la commande <code class="terminal" style="background-color:#434343;color:#f3f3f3;">kotlinc</code>).
