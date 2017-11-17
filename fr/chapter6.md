# Chapitre 6<br />Avant de développer

À partir de maintenant, l’objectif de ce livre va être de réaliser une application Android de A à Z. Autrement dit, dès à présent, nous ne travaillerons que sur une seule application que nous ne cesserons d’améliorer jusqu’à la fin de ce livre.

Nous pourrions donc dès à présent ouvrir Android Studio, et commencer les développements. Mais ce serait oublier qu’avant de développer une application, il faut passer par une étape de conception et une étape de planification, afin de savoir comment mener ce projet à bien.

## Planification et itération

### Planification
Concernant les délais et le temps passé, nous ne nous attarderons pas sur ce sujet. En effet, cette variable dépend essentiellement du temps que vous décidez de consacrer à ce livre, et de votre rythme d’apprentissage. Tout ceci est tellement variable qu’il est impossible de définir un schéma à partir de cela.

En revanche, remarquez la formulation que j’ai utilisée en introduction de ce chapitre : «que nous ne cesserons d’améliorer jusqu’à la fin de ce livre». Cette notion n’est pas anodine et se montre très importante.

### Itérations

En fait, nous allons faire en sorte d’avoir une application fonctionnelle à chaque fin de chapitre. Ainsi, excepté bien sûr pour le prochain chapitre, nous partirons d’une application fonctionnelle, et améliorerons cette application existante pour obtenir une application fonctionnelle bonifiée à la fin du chapitre.

Ce mode de développement, c’est ce qu’on appelle développer de manière itérative. Ce nom-là a été choisi parce que dans ce mode de développement, vous répétez en boucle les mêmes étapes :

* Je développe des fonctionnalités ;
* Je publie une application fonctionnelle.

<h3 class="pageBreakBefore">Avantages du développement itératif</h3>

De prime abord, on pourrait se demander quel est l’intérêt d’une telle perte de temps. Se forcer à faire quelque chose qui fonctionne trop régulièrement, quitte parfois à devoir diviser le développement d’une fonctionnalité en plusieurs parties uniquement pour respecter ce principe, et adapter chacune de ces étapes pour faire quelque chose de fonctionnel, alors qu’aller directement au but serait plus rapide...

En fait, la liste des avantages est tellement longue qu’on ne peut en faire la liste complète, mais en voici quelques exemples :

* Ce que vous devez faire reste simple, puisque limité dans le temps. Vous pouvez expliquer très clairement ce que vous êtes en train de faire, pour qu’un collègue vous aide dans votre développement.
* Vous pouvez vous adapter très rapidement.
  * Une mise à jour d’Android propose des notifications tellement pertinentes que vous ne pouvez pas ne pas les utiliser. Très bien, vous reverrez vos priorités de développement pour la prochaine itération.
  * Vous commencez à développer la fonctionnalité du siècle. Cela va vous prendre six mois, mais avec ça, c’est certain, vous allez avoir le succès que vous espériez tant. Manque de chance, vos utilisateurs détestent cette nouvelle fonctionnalité. D’accord, pas besoin de perdre six mois dessus, vous n’avez qu’à revenir en arrière.

Sachez que toutes les sociétés au sein desquelles j’ai travaillé, ou bien toutes celles dont j’ai entendu parler, fonctionnent sur ce mode itératif. Pour vous donner un ordre d’idées, les itérations durent en général deux semaines dans la majorité des sociétés développant des applications Android. Même si ce n’est pas une règle, on est en général autour de cet ordre de grandeur.

## Application développée

Pour développer une application, nous partirons de deux définitions qui s’appliquent bien au développement itératif. La première, c’est notre vision, une définition très vague de l’ambition que nous envisageons avec le développement de notre projet. Cette définition étant très vague, nous pourrions passer des années avant d’atteindre cet objectif. Du coup, nous allons également nous baser sur une seconde définition, le produit minimum viable, aussi appelé MVP (pour Minimum Viable Product).

<h3 class="pageBreakBefore">Ambition</h3>

L’ambition de l’application que nous allons développer, c’est de permettre à l’utilisateur de gérer une liste de lieux favoris, comme par exemple les restaurants qu’il préfère, son club de sport, sa banque, etc.

### MVP

Si l’ambition de notre application est une définition volontairement très vague, la définition du MVP doit, elle, être très précise. Pour parvenir à une définition très rigoureuse, on peut utiliser des procédés éprouvés.

#### User stories

Les User Stories, en français scénarios utilisateur, sont des phrases qui décrivent qui peut faire quoi dans l’application. Un exemple de User Story peut être :

* En tant qu’utilisateur de l’application, lorsque je clique sur le bouton Ajouter, j’arrive sur un écran d’ajout de lieu.

L’avantage des User Stories, c’est qu’elles ne nécessitent rien d’autre que des schémas pour définir une application. Ces schémas nous permettront par exemple d’indiquer où se situe le bouton Ajouter, ...

Voici donc les User Stories de notre MVP :

* En tant qu’utilisateur, lorsque j’arrive sur l’écran d’accueil et qu’aucun lieu n’est enregistré, je vois un écran vide comportant un bouton flottant Ajouter.
* En tant qu’utilisateur, lorsque j’arrive sur l’écran d’accueil et que des lieux ont été enregistrés, je vois un écran comportant une liste disposée en rangées, avec le nom du lieu suivi de l’adresse pour chaque lieu enregistré, en plus d’un bouton flottant Ajouter.
* En tant qu’utilisateur, lorsque je clique sur le bouton Ajouter, j’arrive sur un écran d’ajout de lieu.
* En tant qu’utilisateur, lorsque j’arrive sur l’écran d’ajout de lieu, je vois un formulaire me demandant le nom du lieu à ajouter ainsi que l’adresse du lieu à ajouter et un bouton pour valider la saisie.
* En tant qu’utilisateur, sur l’écran d’ajout d’adresse, lorsque je clique sur le bouton pour valider la saisie et qu’un champ n’est pas rempli, alors le ou les champs non remplis sont surlignés en rouge, avec un message indiquant qu’ils sont obligatoires.
* En tant qu’utilisateur, sur l’écran d’ajout de lieu, lorsque je clique sur le bouton pour valider la saisie et que tous les champs sont remplis, alors le lieu est ajouté aux lieux enregistrés et je suis redirigé sur l’écran d’accueil.

Voilà les User Stories de notre MVP. Cela veut dire que ce sont ces comportements que nous allons développer avant de développer quoi que ce soit d’autre, et qu’une fois que ces comportements auront été développés, alors nous pourrons publier notre application.

#### Mock-ups

Les mock-ups sont des schémas représentant les différents écrans de notre application. Le mot schémas est très important : il ne s’agit pas de designs précis, mais bien de schémas grossiers indiquant comment sont disposées les données dans notre application.

Un conseil que je pourrais vous donner, ce serait de vous forcer à dessiner vos premiers mock-ups à la main. À moins que vous ne soyez un grand dessinateur, cela vous forcera à rester simple.

Voici ci-dessous les mock-ups que j’ai dessinés pour les trois écrans des User Stories :

1. Écran d’accueil vide,
1. Écran d’ajout d’un lieu,
1. Écran d’accueil avec des lieux.

<p><img class="ebook_only" src="../images/drawn_mockups.png" style="width:400px;height:300px;margin:0 auto;display:block;"/><img class="web_light_only" src="../images/drawn_mockups.png" style="margin:0 auto;display:none;"/><img class="web_dark_only" src="../images/drawn_mockups_night.png" style="margin:0 auto;display:none;"/></p>

<p style="text-align:center"><i>Vous le voyez clairement, pas besoin d’être un expert du dessin pour concevoir des mock-ups.</i></p>

L’avantage des mock-ups, c’est que l’on a tout de suite une idée beaucoup plus précise de ce à quoi doit ressembler l’application que l’on cherche à concevoir.

## Conclusion

Nous avons vu comment concevoir une application, et comment planifier son développement dans le temps. Nous pouvons donc désormais passer au développement.

Bien entendu, nous ne développerons pas uniquement le MVP dans ce livre, mais nous irons beaucoup plus loin, ne vous en faites pas.

Par contre, comme annoncé, le développement de notre MVP sera notre priorité, et par conséquent la première chose que nous développerons dans les prochains chapitres.
