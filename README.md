Exos Javas

Voici le dépôt des exercices Java du 27 au 31 aout:

Exercice 1 : [Sans utiliser Eclipse et sans utiliser les concepts pas encore vus, par ex Exception,
Expressions régulières] Dans un répertoire local « TestCdeJava » par ex, vous allez réaliser votre premier programme java en utilisant un éditeur simple et la ligne de commande
•
1.1 Écrire une classe "Hello.java", ajouter une méthode main pour afficher le message "bonjour et bienvenu dans mon programme java"
•
1.2 puis ajouter "quel est votre nom ?" + saisir le nom puis afficher "salut nom"
•
1.3 faire de même pour le prénom pour obtenir par ex : "bienvenu nom prénom !"
Exercice 2 : programme sur les conditions (éditeur simple + ligne de commande)
•
2.1 Écrivez une classe "Test.java", ajouter une méthode main qui lit un nombre entier et indique s'il est positif, négatif ou s'il vaut zéro (n’oubliez pas de gérer l’interaction)
•
2.2 Ajouter la possibilité de savoir si le nombre est pair ou impair.
•
2.3 Que se passe-t-il si on saisit une valeur inattendue et comment régler ce problème ?
•
2.4 Prévoir l'option permettant à l'utilisateur de saisir une valeur directement en ligne de commande, ce qui donnera le résultat suivant si vous exécutez en ligne de commande
$java Test 5
$valeur positive et impair
Exercice 3 : Créer un projet Java par exercice sous Eclipse, ex ici : « BaseEx3Loop »
•
3.1 Trouvez le moyen de faire la même chose que dans l’exercice 2.3 sous Eclipse
•
3.2 Que se passe-t-il si on saisit une valeur inattendue et comment régler ce problème ?
•
3.3 Ajouter l’option selon laquelle vous pouvez reproduire l’action précédente autant de fois qu’il y a d’arguments en ligne de commande puis tester le tout pour obtenir ce résultat :
→ java Test 5 10 3 -4

<img width="228" height="117" alt="image" src="https://github.com/user-attachments/assets/99aba26d-5a93-43e3-997d-f077ada28b84" />

TP 1 : [BaseTP1Game] Écrire un programme demandant à l'utilisateur s'il souhaite jouer à notre jeu, si non alors sortir du programme, si oui, alors proposer de saisir un chiffre entre 1 et 100 et dire à chaque itération si le chiffre est plus petit ou plus grand. Une fois le chiffre trouvé, afficher un message : vous avez trouvé en x coups !
Attention, vous devez réaliser le programme en un minimum de lignes de codes tout en veillant à ce qu’il reste parfaitement lisible, enfin que ce soit intuitif pour un autre dev.
FMS-EA 2024 © El Babili - Tous droits réservés 2
- Puis rendre le jeu permanent tant que le joueur veut jouer, il doit pouvoir continuer
NB : la méthode Math.random() permet de renvoyer une valeur comprise entre 0 et 0,9

<img width="512" height="343" alt="image" src="https://github.com/user-attachments/assets/88e02f9d-013f-4eb7-91e6-c306d4c30a90" />

FMS-EA 2024 © El Babili - Tous droits réservés 2
- Puis rendre le jeu permanent tant que le joueur veut jouer, il doit pouvoir continuer
NB : la méthode Math.random() permet de renvoyer une valeur comprise entre 0 et 0,9
Exercice 4 : Les Tableaux [BaseEx4Array] & qq collections
•
4.1 Parcourir un tableau contenant des notes, écrire la note la plus petite, la plus grande et la moyenne (Utiliser des méthodes statiques pour gérer les différentes fonctionnalités)
•
4.2 : Dans une autre classe, demander au professeur de saisir nom et prénom d’un élève puis de saisir ses notes, une fois fini, afficher nom et prénom + moyenne, l'action est répétée autant de fois qu'il y a d'élèves.
•
4.3 : Le programme doit maintenant indiquer si un élève saisi au clavier est présent dans la liste du professeur, si oui, afficher ses notes et sa moyenne.
•
Utiliser un moyen permettant de gérer à la fois nom et prénom d’une part, suite de notes d’autre part.
•
4.4 : Écrire enfin un programme qui va trier dans l’ordre décroissant la liste des prénoms de votre promo, puis dans l’ordre croissant.
•
4.5 : Que fait ce programme ? qu’affichera-t-il ?

  <img width="749" height="526" alt="image" src="https://github.com/user-attachments/assets/742250ec-6176-4ed7-bd32-7c5716837ddc" />

Exercice 5 : Les Strings [BaseEx5String]
•
5.1 : Trouver plusieurs moyens de concaténer 2 chaînes de type String.
•
5.2 : Dans une chaîne(phrase) donnée, trouver s'il existe un mot, si oui, afficher trouvé.
ex : "il fait beau aujourd'hui" → mot recherché "Beau" donc trouvé !
•
5.3 : Reprendre exercice précédent et remplacer le mot si trouvé par un autre saisi par l'utilisateur. ex : "il fait beau aujourd'hui" donne "il fait chaud aujourd'hui"
•
5.4 : Écrire un programme qui dit si une chaîne est un palindrome, ex : akka, ottO
•
5.5 : Tester votre programme avec : "Elu par cette crapule" (c'est un palindrome), que faire ?
Exercice 6 : Les Opérations [BaseEx6Operation]
•
6.1 : Réaliser une classe Operation qui regroupe les méthodes Add, Sub, Mul et Div
permettant de réaliser les opérations basiques telles que : → System.out.println(add(5,2)); va afficher 7 → System.out.println(sub(5,2)); va afficher 3
→ Comment gérez vous le cas suivant : System.out.println(div(3,0));
•
6.2 : Trouver un moyen de dessiner un triangle sur la console, il en existe au moins 2.

<img width="214" height="187" alt="image" src="https://github.com/user-attachments/assets/fd4eefcd-bb60-4f06-8f8f-661363afdaef" />

•
6.3 : Écrire un code qui doit, pour un tableau contenant X nombres donné, retourner la somme des 2 plus grands nombres présent dans ce tableau. Exemple : avec le tableau 78, 6, -250, 2, 12, 9, le résultat sera 90.
•
6.4 : Dans une classe Matrix censé représenté une matrice, on souhaite additionner 2 matrices via une méthode, assurez-vous qu’elles ont bien le même nombre de colonnes et lignes avant tout pour respecter la formule.
Mais avant tout voilà à quoi une ressemble l’opération d’addition de 2 matrices :

<img width="474" height="235" alt="image" src="https://github.com/user-attachments/assets/24ea5aa5-ddb4-4008-a95b-6f7829e1d558" />

Le premier exemple représente le résultat de l’addition de 2 matrices.
En effet, une matrice est un tableau à 2 dimensions formé donc de lignes et de colonnes entouré de crochet ici. Par ex, sur la 1ère matrice, à la 2ème ligne et à la 3ème colonne, nous avons la valeur -1. Sur la 2ème matrice toujours à la 2ème ligne et à la 3ème colonne, nous avons la valeur 4. Delors, l’addition de ces 2 valeurs donne une valeur dans la 3ème matrice à droite (à la 2ème ligne et à la 3ème colonne) égal à 3, en effet -1 + 4 = 3.
Le second exemple montre la soustraction d’une matrice par une autre avec au passage toujours les mêmes valeurs : -1 – 4 = -5
A l’aide de notre langage préféré, une matrice est comme dans l’exemple ci-dessous représenté par un tableau à 2 dimensions, cad que pour chaque ligne de notre tableau accessible via le 1er indice ici « firstMatrix[0] » nous avons avons un tableau dont les éléments sont accessibles via le deuxième indice soit « firstMatrix[0][1] » contient l’entier 2. Prenez le temps de bien comprendre les jeux d’essais et résultats plus bas pour comprendre les besoins.
•
6.5 : Ajouter la méthode soustraire qui prend donc en argument 2 matrices (A et B si vous voulez) et renvoi une troisième que sera le résultat de A – B = C ;
•
6.6 : puis multiplier par une valeur (appelé scalaire) une matrice, ce qui revient à multiplier tous les éléments d’une matrice par une valeur donné (voir les résultats plus bas)
...de sorte que pour tel jeux d’essai

<img width="557" height="538" alt="image" src="https://github.com/user-attachments/assets/75a5afde-52fb-423f-94a4-fafc8bd9d5e6" />

Nous obtenons les résultats suivants :

<img width="915" height="642" alt="image" src="https://github.com/user-attachments/assets/0f095e77-bd3d-48dc-8dc5-023616930c99" />

TP 2 [BaseTP2Resto] On se fait un « resto » à la maison ?
En effet, votre programme doit simuler la prise d’une commande afin d’obtenir ce résultat :

<img width="805" height="917" alt="image" src="https://github.com/user-attachments/assets/e9b701b4-b7ff-4020-9f4b-27e2ad3bfb82" />

NB : vous pouvez modifier les menus de-lors que les fonctionnalités répondent aux besoins.
Exercice 6 : Factorielle (récursivité)

<img width="967" height="233" alt="image" src="https://github.com/user-attachments/assets/6b176c8b-1a1b-45c3-9655-ad09e10cce83" />

Ecrire un programme java qui met en oeuvre la notion de factorielle telle que n ! = n*(n-1) …*1
