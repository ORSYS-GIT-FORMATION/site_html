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

- On souahite maintenant créer la classe Banque. Une banque est identifié par un nom, une adresse, une date de création, un ensemble de clients et un ensemble de comptes.
- Vous pouvez stocker ces clients avec un tableau en attendant d'en savoir plus sur les autres conteneurs disponibles.
- Créer une classe Client. Un client est identifié par un nom, prénom, date de naissance, date d'ouverture du premier compte dans la banque.
- On va maintenant modifié

## TP 4 : Organiser notre projet

_jour 2 : à venir_

- XXXXX

## TP 5 : Gérer les références 

_jour 2 : à venir_

- XXXXX

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

