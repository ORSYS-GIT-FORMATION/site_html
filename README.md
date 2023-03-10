# Les fondamentaux de java

## TP 1 : Création de notre premiere classe

_Jour 1 : Correction disponible_

- Créer une classe CompteCourant. Elle comporte les attributs suivants : numéro (identifiant), solde, nom (nom du compte), decouvertAutoriserMax.
- Cette classe propose trois constructeurs : CompteCourant(numéro), CompteCourant(numéro, solde), CompteCourant(numero, solde, nom). Dans le cas ou le solde n'est pas donné il est automatiquement mis à 0. Dans le cas ou le nom n'est pas donné un nom par défaut est mis.
- Générer les getters et les setters nécessaires. 
- Réaliser une méthode resume() qui retourne une chaine formatée faisant le résumé des informations du compte les informations du compte.
- Le découvert max autorisé à l'instant T est égale à la moitié du solde du compte à l'instant T. Cet attribut doit être mis à jour automatiquement lorsque le solde change.

Réaliser des tests avec votre classe dans le fichier Main.java.

## TP 2 : Interaction entre les objets et méthodes statiques

_jour 2 : Correction disponible_

- Compléter votre classe avec un attribut permettant d'avoir le nombre de comptes ouvert.
- Utiliser cet attribut pour générer automatiquement un numéro de compte unique.
- Créer une méthode qui permet de faire des transferts d'argent entre deux comptes. Voici le prototype de la méthode : transfert(CompteCourant, CompteCourant, montant). Le transfert se fait du premier compte (arg1) au second (arg 2) et peut être positif ou négatif (créditeur ou débiteur).

Réaliser vos tests dans votre fichier Main.java.

## TP 3 : Classes Banque et Client

_jour 2 : Correction disponible_

- On souhaite maintenant créer la classe Banque. Une banque est identifiée par un nom, une adresse, une date de création, un ensemble de clients et un ensemble de comptes.
- Vous pouvez stocker ces clients avec un tableau en attendant d'en savoir plus sur les autres conteneurs disponibles.
- Créer une classe Client. Un client est identifié par un nom, prénom, date de naissance, date d'ouverture du premier compte dans la banque.
- On va maintenant ajouter à notre compte un client qui le posséde.
- Faites une méthode dans Banque qui affiche la liste des clients.

Après avoir vu les énumérations :

- Ajouter un champ typeCarte à la classe CompteCourant. Les types de cartes sont les suivants : {JEUNE, RETRAIT, CLASSIC, SILVER, GOLD, SPECIAL}

## TP 4 : Organiser notre projet

_jour 3 : à venir_

- Le projet commence à se compléter on va donc essayer de le mettre en forme et de l'organiser.
- Créer un package banque dans lequel vous allez mettre toutes les classes réaliser jusqu'ici (vous pouvez organiser autrement si vous le souhaitez)
- Maintenant que l'on utilise les classes en dehors de leur package, il faut faire attention aux éléments public/potected/private. Corriger si necessaire.
- Nous allons réaliser un semblant d'application de gestion.
- Dans la classe main réaliser deux Menus qui présentent les différentes opérations possibles : 
    - Premier menu :
        - Création d'une banque (créer un objet banque)
        - Gérer une banque (aller au menu suivi pour gérer la banque choisi)
        - Voir mes banques (afficher la liste des banques créer)
        - Quitter (arrêter le programme)
    - Si l'on choisit de gérer une banque :
        - Ajouter un compte : demander à l'utilisateur de saisir les informations nécessaire (nom, montant) pour le client proposer deux options. Choisir un client existant (on affiche une liste et l'utilisateur entre le nom ou un numero) soit créer un nouvelle utilisateur qui possedera ce compte.
        - Faire un transfert : Demander le numéro du compte à débiter puis le numéro du compte créditer et enfin le montant à l'utilisateur. Afficher un message d'erreur si le montant du debiteur est insuffisant.
        - Voir les comptes : On affiche les informations de tous les comptes
        - Recherche d'un compte : On entre le numéro d'un compte pour le retrouver
        - Recherche d'un client : On entre un nom et l'application affiche tous les utilisateurs qui ont ce nom (potentiellement plusieurs) et propose d'afficher les comptes asocie.
        - Exit (revenir au menu précédent)
    
## TP 5 : Début de l'héritage

_jour 3 : à venir_

- Créer une classe CompteEpargne, un compte épargne n'a pas de découvert autorisé, pas de type de carte et ne peux faire de transferts d'argents qu'avec les autres comptes de son propriétaire. (héritage)
- On souhaite faire en sorte que la banque ai une liste de tous les comptes courant comme épargne (dans une même liste).(Travail sur les types) => Créer une classe mère commune : Compte.
- On souhaite avoir une méthode qui permette de faire des transferts entre deux comptes (courant comme épargne en respectant les règles) (polymorphisme)

Faites les modifications nécessaires et tester les dans votre Main.

- On souhaite ensuite créer une classe Registre qui va contenir des Operations (une autre classe). La classe operations ne doit pas être modifiable. Et on peut seulement ajouter des operations au registre pas en retirer. (immutabilité)
- Chaque transfert est enregistré dans le registre (une nouvelle operations) avec les informations suivantes (numéro compte débité,numéro compte crédité, montant, date et heure de l'opération).

Faites les modifications et tester.

- Il n'y a pas de Compte générique, la classe sert simplement a rassemblé des informations commune... c'est une classe abstraite ! Declarer la comme tel et définisser sa ou ses méthodes abstraite.

Faites les modifications et tester

## TP 6 : Les interfaces

_jour 4 : à venir_

Partie 1 :

- Avant de créer nos propres interfaces essayont d'implémenter celles qui existent. Nous avons besoin de pouvoir trier facilement les comptes et les clients d'une banque.
- On souhaite que la condition suivante (client1 > client2) soit vraie si jamais client1 a plus d'argent (sommes sur tous ses comptes) que client2 et faux si client 1 à moins d'argent (ou la même somme) que client 2.
- De la même manière au niveau des comptes. On souhaite que compte1 > compte2 renvoi vrai si le montant de compte1 est plus important que celui de compte2. Et faux dans les autres cas.
- Dans l'option "afficher les comptes" du menu faites en sorte que l'affichage respecte cet ordre, même chose pour l'affichage des clients. (ajouter une option "afficher les clients" si elle n'existe pas).

Réaliser les modifications et tester.

Partie 2 : 

- On va maintenant créer notre propre interface. On réalise un logiciel de gestion bancaire. On peut imaginer que notre logiciel a différents utilisateurs.
- En plus des Clients, il nous faut créer des classes Employe et Administrateur représentant deux postes au sein des banques. 
- On va créer une interface Authentifiable qui va permettre de vérifier si un utilisateur est authentifié ou non. Cette interface contient une méthode authentifié qui prend en paramètre un mot de passe et qui renvoie un booléen. On déclare aussi les autres méthodes utilent à cet usage (getMotDePasse, setMotDePasse, getLogin, setLogin, getLog).
- Il faut un accès différent aux données et à l'application selon l'utilisateur (ses comptes pour les clients, les différents comptes qu'il gère pour un employé, tous les comptes pour l'administrateur)

Réaliser les modifications nécessaires et tester.

## TP 7 : Gérer les exceptions

_jour 4 : à venir_

- On va maintenant gérer les exceptions. On souhaite que l'application ne plante pas si l'utilisateur entre des données incorrectes ou si un comportement imprévu survient.
- On va commencer par gérer les exceptions liées aux transferts. On souhaite que l'application ne plante pas si l'utilisateur entre un montant négatif ou un montant supérieur au solde (+ découvert) du compte débité.
- Créer deux nouvelles exceptions : MontantNegatifException et SoldeInsuffisantException. Ces exceptions sont lancé dans la méthode transfert de la classe Compte. On souhaite que ces exceptions soient gérées dans le Main. On souhaite que l'utilisateur soit informé de l'erreur et qu'il puisse réessayer. Il faut donc propager ces exceptions.
- Ajouter un message d'erreur à vos exceptions et afficher en cas d'erreur.
- On souhaite maintenant gérer les exceptions liées à la création d'un compte. On souhaite que l'application ne plante pas si l'utilisateur entre un nom de client (ou ID) qui n'existe pas.
- Créer une nouvelle exception : ClientInconnuException. Cette exception est lancé dans la méthode ajouterCompte de la classe Banque. On souhaite que cette exception soit gérée dans le Main. On souhaite que l'utilisateur soit informé de l'erreur et qu'il puisse réessayer. Il faut donc propager cette exception.

Faites les modifications nécessaires et tester.

- On souhaite hiérarchiser ces exceptions. Créer une classe mère : CompteException. Créer une classe fille de CompteException : MontantNegatifException et SoldeInsuffisantException. Créer une classe BanqueException. ClientInconnuException est une classe fille de BanqueException, comme CompteException.
- Vous pouvez maintenant gérer ces exceptions de manière plus générale.

## TP 8 : Les collections

_jour 4 : à venir_

- Vous pouvez remplacer les tableaux JAVA, peu pratique par la Collection qui vous semblera le plus approprié. (ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, ...)
- Vous pouvez maintenant trier en utilisant la méthode sort de la classe Collections. (Collections.sort(liste);)
- Créer vos propres classes qui implémentent l'interface Comparator. Et tester les différentes méthodes de tri.
- Proposer lors de l'affichage dans le menu, des banques, clients et comptes les différents types de tri possible.

Faites les modifications nécessaires et tester.

- Ajouter les exceptions nécessaires dans les méthodes permettant de gérer les collections. (CompteNonTrouvé ect...)

## TP 9 : Design pattern

_jour 5 ; à venir_

- A ce stade, vous avez surement une classe Applications / Gestionnaire / Menu que vous instanciez dans le Main et qui contient vos banques, les menus et la logique ascociée.
- Si ce n'est pas le cas :
  - créer une classe gestionnaire. Cette classe doit contenir la liste des banques existantes, les méthodes permettant de gérer les banques, les clients et les comptes. (ajouter, supprimer, modifier, ...).
  - Votre main ne doit contenir que l'instanciation et l'appel à la méthode MenuPrincipal (la méthode principale) de votre gestionnaire.
- Si c'est le cas ou une fois fait :
  - Appliquer le design pattern Singleton à votre classe Gestionnaire. Il ne peut en exister qu'une seule instance.
  - Appliquer le design pattern Factory à votre classe Banque : BanqueFactory.

## TP 10 : Les threads

_jour 5 : à venir_

- XXXXXX


```java

if (CompteA estUnCompteCourant() && CompteB estUnCompteCourant()){
    
        crediter 
        debiter
    
        } else if (CompteA et B sont ou courant ou epargne){
    
        if (meme proprioetaire) {
            crediter
            debiter
        }else {
            exception invalid operetion
        }
    
        }else {
                Compte non géré
        }



```