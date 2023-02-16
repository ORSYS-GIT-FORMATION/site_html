# Les fondamentaux de java

## TP 1 : Création de notre premiere classe

_Jour 1 : Correction disponnible_

- Créer une classe CompteCourant. Elle comporte les attributs suivant : numéro (identifiant), solde, nom (nom du compte), decouvertAutoriserMax.
- Cette classe propose trois constructeurs : CompteCourant(numero), CompteCourant(numero, solde), CompteCourant(numero, solde, nom). Dans le cas ou le solde n'est pas donné il est automatiquement mis à 0. Dans le cas ou le nom n'est pas donné un nom par défaut est mis.
- Générer les getters et les setters nécessaires. 
- Réaliser une méthode resume() qui retourne une chaine formaté faisant le résumé des informations du compte les informations du compte.
- Le découvert max autorisé à l'instant T est égale à la moitié du solde du compte à l'instant T. Cet attribut doit être mis à jour automatiquement lorsque le solde change.

Réaliser des tests avec votre classe dans le fichier Main.java.

## TP 2 : Interaction entre les objets et méthodes statiques

_jour 2 : à faire_

- Compléter votre classe avec un attribut permettant d'avoir le nombre de compte ouvert.
- Utiliser cet attribut pour générer automatiquement un numéro de compte unique.
- Créer une méthode qui permet de faire des transfert d'argent entre deux comptes. Voici le prototype de la méthode : transfert(CompteCourant, CompteCourant, montant). Le transfert se fait du premier compte (arg1) au second (arg 2) et peut être positif ou négatif (créditeur ou débiteur).

Réaliser vos tests dans votre fichier Main.java.

## TP 3 : Classes Banque et Client

_jour 2 : à venir_

- On souhaite maintenant créer la classe Banque. Une banque est identifié par un nom, une adresse, une date de création, un ensemble de clients et un ensemble de comptes.
- Vous pouvez stocker ces clients avec un tableau en attendant d'en savoir plus sur les autres conteneurs disponibles.
- Créer une classe Client. Un client est identifié par un nom, prénom, date de naissance, date d'ouverture du premier compte dans la banque.
- On va maintenant ajouter à notre compte un client qui le posséde.
- Faites une méthode dans Banque qui affiche la liste des clients.

Après avoir vu les énumérations :

- Ajouter un champ typeCarte à la classe CompteCourant. Les types de cartes sont les suivants : {JEUNE, RETRAIT, CLASSIC, SILVER, GOLD, SPECIAL}

## TP 4 : Organiser notre projet

_jour 2 : à venir_

- Le projet commence à se compléter on va donc essayer de le mettre en forme et de l'organiser.
- Créer un package banque dans lequel vous allez mettre toutes les classes réaliser jusqu'ici (vous pouvez organiser autrement si vous le souhaitez)
- Maintenant que l'on utilise les classes en dehors de leur package il faut faire attention aux éléments public/potected/private. Corriger si necessaire.
- Nous allons réaliser un semblant d'application de gestion.
- Dans la classe main réaliser deux Menu qui présentent les différentes opérations possible : 
    - Premier menu :
        - Création d'une banque (créer un objet banque)
        - Gérer une banque (aller au menu suivi pour gérer la banque choisi)
        - Voir mes banques (afficher la liste des banques créer)
        - Quitter (arreter le programme)
    - Si l'on choisit de gérer une banque :
        - Ajouter un compte : demander à l'utilisateur de saisir les informations necessaire (nom, montant) pour le client proposer deux options. Choisir un client existant (on affiche une liste et l'utilisateur entre le nom ou un numero) soit créer un nouvelle utilisateur qui possedera ce compte.
        - Faire un transfert : Demander le numero du compte a debiter puis le numero du compte crediter et enfin le montant à l'utilisateur. Afficher un message d'erreur si le montant du debiteur est insuffisant.
        - Voir les comptes : On affiche les informations de tous les comptes
        - Recherche d'un compte : On entre le numero d'un compte pour le retrouver
        - Recherche d'un client : On entre un nom et l'application affiche tous les utilisateurs qui ont ce nom (potentiellement plusieurs) et propose d'afficher les comptes asocie.
        - Exit (revenir au menu précédent)
    
## TP 5 : Début de l'héritage

_jour 2 : à venir_

- Créer une class CompteEpargne, un compte epargne n'a pas de de découvert autorisé, pas de type de carte et ne peux faire de transferts d'argents qu'avec les autres comptes de son proprietaire.
- On souhaite faire en sorte que la banque ai une liste de tous les comptes courant comme epargne (dans une même liste).
- On souhaite avoir une méthode qui permette de faire des transfert entre deux comptes (courant comme epargne en en respectant les règles)

Faites les modifications nécessaire et tester les dans votre Main.

## TP 6 : Les interfaces

_jour 2 : à venir_

- XXXXX

## TP 7 : Maitrise de l'héritage et du polymorphisme

_jour 3 : à venir_

- XXXXX

## TP 8 : Gérer les excpetions

_jour 3 : à venir_

- XXXXXX

## TP 9 : Les collections

_jour 3 : à venir_

- XXXXXX

## TP 10 - Les streams 

_jour 4 : à venir_

- XXXXXX

## TP 11 - Serializations 

_jour 4 : à venir_

- XXXXXX

## TP 12 - Interagir avec les fichiers

_jour 4 : à venir_

- XXXXXX

## TP 13 : Design pattern

_jour 5 ; à venir_

- XXXXXX

